package com.kodilla.integration.transform;

import java.nio.file.Paths;

public class FileTransformer {
    public String transformFile(String path) {
        return Paths.get(path).getFileName().toString();
    }
}
