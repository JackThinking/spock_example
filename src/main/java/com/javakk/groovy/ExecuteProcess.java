package com.javakk.groovy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProcess {
    public static void main(String[] args) {
        try {
            Process exec = Runtime.getRuntime().exec("brew -h");
            BufferedReader result = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            String line;
            while ((line = result.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
