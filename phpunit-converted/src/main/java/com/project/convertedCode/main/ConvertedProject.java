package com.project.convertedCode.main;

import java.io.File;

public class ConvertedProject extends com.runtimeconverter.runtime.Project {

    public ConvertedProject() {
        super();
        this.basePackageName = "com.project.convertedCode";
    }

    protected String initRootWorkingDirectory() {
        // The runtime needs a virtual directory root for resolving paths such as __FILE__ and
        // __DIR__.
        // This directory does not need to exist or have any contents, but it is useful to have
        // original PHP sources and resources in this folder.
        String directory = System.getProperty("user.dir");
        String rootWorkingDirectory = directory + File.separator + "workingDirectory";
        if (new File(rootWorkingDirectory).exists()) {
            return rootWorkingDirectory;
        } else {
            throw new RuntimeException(
                    "Cannot find directory \""
                            + rootWorkingDirectory
                            + ".\nThe runtime needs a virtual directory root for resolving paths such as __FILE__ and __DIR__.\nThis directory does not need to exist or have any contents, but it is useful to have original PHP sources and resources in this folder.\nThis file is user-space code and can be edited.");
        }
    }
}
