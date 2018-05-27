package com.project.convertedCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.runtimeconverter.jni.LoadLibrary;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.runtimeconverter.runtime.includes.RouterScriptInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.annotation.WebFilter;
import javax.servlet.*;
import java.io.IOException;

/*

README:

This java entry point and Spring configuration is copied here so that you can re-configure it accoring to your needs.

It offers a few modes of operation:
1) A CLI application
2) A CLI application with Spring Boot support (see ApplicationLoader and useSpringWithCLI)
3) A Spring Boot server using ServletComponentScan
4) A Spring Boot server using HandlerInterceptor (similar to PHP's router script mode)

You should remove the configuration options that you do not use.

Use "gradle bootRun" to load the Spring Boot Server.

Add -DruntimeConverterRouterScriptName="/router.php" to use router.php with HandlerInterceptor.


 */

@ServletComponentScan
@SpringBootApplication
public class Application {
    // Set this value to "true" to load the spring framework when a script is called in CLI mode
    // It will have no effect on the "web" command which needs spring boot to load the web server
    private static final boolean useSpringWithCLI = false;
    private static boolean useWeb = false;

    public static void main(String[] args) {
        LoadLibrary.loadLibrary();
        useWeb = args.length == 1 && args[0].equals("RuntimeConverterGradleBootRun");
        if (!useWeb && !useSpringWithCLI) {
            runCLI(args);
            System.exit(0);
        }
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        builder.sources(Application.class);
        // builder.properties("logging.pattern.console=");
        builder.bannerMode(Banner.Mode.CONSOLE);
        builder.web(useWeb);
        if (!useWeb) {
            System.out.println("\n\nLoading Spring in CLI Mode...");
        }
        builder.run(args);
    }

    private static void runCLI(String[] args) {
        String scriptName = System.getProperty("runtimeConverterScriptName");
        List<String> argsBuilder = new ArrayList<>(args.length + 1);
        argsBuilder.add(scriptName);
        Collections.addAll(argsBuilder, args);
        args = new String[argsBuilder.size()];
        argsBuilder.toArray(args);
        new com.project.convertedCode.main.ConvertedProjectRuntimeEnv().runCLI(args);
    }

    @Component
    public class ApplicationLoader implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            if (!useWeb) {
                runCLI(args);
            }
        }
    }

    // This "HiddenHttpMethodFilter" accesses the raw post contents and destroys the input stream
    // which is used by RuntimeEnv to get post variables
    @Bean
    public FilterRegistrationBean registration(HiddenHttpMethodFilter filter) {
        FilterRegistrationBean registration = new FilterRegistrationBean(filter);
        registration.setEnabled(false);
        return registration;
    }

    // Optional additional configuration
    // This handler can be used to load the runtime similar to a PHP routing script
    @WebFilter(urlPatterns = "*")
    @Configuration
    public class RuntimeConverterRouterFilter implements Filter {
        private final RouterScriptInterceptor interceptor =
                new RouterScriptInterceptor(new com.project.convertedCode.main.ConvertedProject()) {
                    @Override
                    protected RuntimeEnv getRuntimeEnv(
                            String s, HttpServletRequest req, HttpServletResponse resp) {
                        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                                req, resp, this.include);
                    }
                };

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {}

        @Override
        public void doFilter(
                ServletRequest request, ServletResponse response, FilterChain filterChain)
                throws IOException, ServletException {
            boolean continueRequest = true;
            if (request instanceof HttpServletRequest && response instanceof HttpServletResponse) {
                continueRequest =
                        interceptor.handle(
                                (HttpServletRequest) request, (HttpServletResponse) response);
            }
            if (continueRequest) {
                filterChain.doFilter(request, response);
            }
        }

        @Override
        public void destroy() {}
    }
}
