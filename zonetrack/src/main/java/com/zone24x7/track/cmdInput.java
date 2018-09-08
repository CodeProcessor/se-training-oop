package com.zone24x7.track;

public class cmdInput {
    private final String firstArg;

    cmdInput(String[] args){
        this.firstArg = args[0].trim();
    }

    public String getUserInput() {
        String userInput = this.firstArg;
        return userInput;
    }
}
