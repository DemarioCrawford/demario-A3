package com.coderscampus.A3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
    public Users[] readDataFromFile(String fileName) throws IOException {
        Users[] users = new Users[4];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String line;
        int i = 0;

        while ((line = fileReader.readLine()) != null) {
            System.out.println(line);
            
        }
     return users;

    }
}
