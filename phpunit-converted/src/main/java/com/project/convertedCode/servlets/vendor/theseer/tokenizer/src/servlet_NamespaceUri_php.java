package com.project.convertedCode.servlets.vendor.theseer.tokenizer.src;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/theseer/tokenizer/src/NamespaceUri.php")
public class servlet_NamespaceUri_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .theseer
                .tokenizer
                .src
                .file_NamespaceUri_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
