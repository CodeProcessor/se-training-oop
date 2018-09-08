Convert below code to fully OOP code



package com.zone24x7.track;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        String FILENAME = "src/projects.txt";
        String projectID = args[0];
        System.out.println(projectID);

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILENAME));
            String line = br.readLine();
            while(line != null){
                String[] parts = line.split(",");
                if(projectID.equals(parts[0])){
                    System.out.println("Found line");
                    String job_type = parts[1].trim();
                    if(job_type.equals("fixed")){
                        System.out.println("Fixed cost");
                        System.out.println("Cost:"+parts[3]);
                    }
                    if(job_type.equals("var")){
                        System.out.println("Variable cost");
                        int cost = Integer.parseInt(parts[4].trim()) * Integer.parseInt(parts[5].trim());
                        System.out.println("Cost: " + Integer.toString(cost));
                    }
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
