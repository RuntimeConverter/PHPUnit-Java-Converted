package com.project.convertedCode.servlets.vendor.doctrine.instantiator.src.Doctrine.Instantiator.Exception;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        "/vendor/doctrine/instantiator/src/Doctrine/Instantiator/Exception/ExceptionInterface.php")
public class servlet_ExceptionInterface_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .doctrine
                .instantiator
                .src
                .Doctrine
                .Instantiator
                .Exception
                .file_ExceptionInterface_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
