package com.project.convertedCode.servlets.vendor.myclabs.deep_copy.src.DeepCopy.Filter.Doctrine;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/myclabs/deep-copy/src/DeepCopy/Filter/Doctrine/DoctrineProxyFilter.php")
public class servlet_DoctrineProxyFilter_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .myclabs
                .deep_copy
                .src
                .DeepCopy
                .Filter
                .Doctrine
                .file_DoctrineProxyFilter_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
