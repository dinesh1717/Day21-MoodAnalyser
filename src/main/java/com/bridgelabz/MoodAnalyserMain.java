package com.bridgelabz;

public class MoodAnalyserMain {
    private String message;
    /**
     * create a constructor ,this is default constructor name as MoodAnalyserMain
     */
    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message=message;
    }
    public String analyseMood() {
        if (this.message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

