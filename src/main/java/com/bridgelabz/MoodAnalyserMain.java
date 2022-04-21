package com.bridgelabz;

public class MoodAnalyserMain {
    private String message;

    /**
     * create a default constructor name as MoodAnalyserMain
     */

    public MoodAnalyserMain() {
    }

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
