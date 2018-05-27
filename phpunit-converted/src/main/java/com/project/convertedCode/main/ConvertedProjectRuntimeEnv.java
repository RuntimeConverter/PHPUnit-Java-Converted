package com.project.convertedCode.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;

public class ConvertedProjectRuntimeEnv
        extends com.runtimeconverter.runtime.runtimeEnv.RuntimeEnvActive {

    public ConvertedProjectRuntimeEnv() {
        super(new com.project.convertedCode.main.ConvertedProject());
    }

    public ConvertedProjectRuntimeEnv(
            HttpServletRequest req, HttpServletResponse resp, RuntimeIncludable includable) {
        super(new com.project.convertedCode.main.ConvertedProject(), req, resp, includable);
    }
}
