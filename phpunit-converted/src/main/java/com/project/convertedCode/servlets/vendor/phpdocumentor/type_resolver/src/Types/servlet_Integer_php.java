package com.project.convertedCode.servlets.vendor.phpdocumentor.type_resolver.src.Types;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/phpdocumentor/type-resolver/src/Types/Integer.php")
public class servlet_Integer_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .phpdocumentor
                .type_resolver
                .src
                .Types
                .file_Integer_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
