package com.zone24x7.track;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class csvReader implements projectsReader {
    private List<String> lines = new ArrayList<String>();
    private List<String> jobs = new ArrayList<String>();
    private String filename = null;

    csvReader(String filename){
        this.filename = filename;
        this.read();
    }
    public String read() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(this.filename));
            String line = br.readLine();
            while(line != null){
                lines.add(line);
                this.jobs.add(line.split(",")[0].trim());
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean isProjectAvailable(String projectID) {
        boolean ret = false;
        if(this.jobs.contains(projectID)){
            ret = true;
        }
        return ret;
    }

    public String getProjectType(String projectID) {
        int getPos  = this.jobs.indexOf(projectID);
        String projectDetails = this.lines.get(getPos);
        String[] subElements = projectDetails.split(",");
        return subElements[1].trim();
    }

    public String[] getProjectDetails(String projectID) {
        int getPos  = this.jobs.indexOf(projectID);
        String projectDetails = this.lines.get(getPos);
        String[] subElements = projectDetails.split(",");
        return subElements;
    }
}
