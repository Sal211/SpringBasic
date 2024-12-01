package com.example.springBasic.readData;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ReadDataService {

    public String read() throws IOException {
        // Access the file using ClassPathResource
        //     ClassPathResource resource = new ClassPathResource("test.txt");
        //   Path path = resource.getFile().toPath();
        // Convert to Path and read content

        Path path = Paths.get("D:\\SpringBoot\\MainLesson\\test.txt");
        String content = Files.readString(path);

        return content;
    }
}
