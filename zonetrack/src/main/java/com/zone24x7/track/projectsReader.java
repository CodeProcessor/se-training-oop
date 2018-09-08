package com.zone24x7.track;

public interface projectsReader {
    String read();
    Boolean isProjectAvailable(String projectID);
    String getProjectType(String projectID);
    String[] getProjectDetails(String projectID);
}
