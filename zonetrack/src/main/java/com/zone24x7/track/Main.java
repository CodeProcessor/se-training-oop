package com.zone24x7.track;

public class Main {
    public static void main(String[] args) {
        String FILENAME = "src/projects.txt";
        cmdInput cmdInputObj = new cmdInput(args);
        csvReader csvObj = new csvReader(FILENAME);
        basicCosts costObj = new basicCosts();
        cmdDisplay dispObj = new cmdDisplay();

        String userInputProject = cmdInputObj.getUserInput();

        if(csvObj.isProjectAvailable(userInputProject)){
            String projectType = csvObj.getProjectType(userInputProject);
            String[] projectDetails = csvObj.getProjectDetails(userInputProject);
            if(projectType.equals("fixed")){
                costObj = new fixedCost(projectDetails[3]);
            }else if(projectType.equals("var")){
                costObj = new variableCost(projectDetails[4], projectDetails[5]);
            }else{
                System.out.println("Unknown project type :"+projectType);
            }
        }else{
            System.out.println("couldn't find project");
        }
        dispObj.show(costObj.getCostType(), costObj.getCost());
    }
}
