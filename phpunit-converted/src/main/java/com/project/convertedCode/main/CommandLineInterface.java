package com.project.convertedCode.main;

import com.runtimeconverter.jni.LoadLibrary;

public class CommandLineInterface {

    public static void main(String[] args) {
        LoadLibrary.loadLibrary();
        new com.project.convertedCode.main.ConvertedProjectRuntimeEnv().runCLI(args);
    }
}
