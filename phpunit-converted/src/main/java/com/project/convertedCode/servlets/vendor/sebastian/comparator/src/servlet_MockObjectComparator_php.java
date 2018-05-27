package com.project.convertedCode.servlets.vendor.sebastian.comparator.src;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/sebastian/comparator/src/MockObjectComparator.php")
public class servlet_MockObjectComparator_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .sebastian
                .comparator
                .src
                .file_MockObjectComparator_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
