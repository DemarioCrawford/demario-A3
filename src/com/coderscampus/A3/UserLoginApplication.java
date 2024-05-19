package com.coderscampus.A3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserLoginApplication {

    public static void main(String[] args) throws IOException {

        FileService fileService = new FileService();
        Users[] users = fileService.readDataFromFile("data.txt");
        for (Users user: users) {
            System.out.println(user);
        }

        }


    }

