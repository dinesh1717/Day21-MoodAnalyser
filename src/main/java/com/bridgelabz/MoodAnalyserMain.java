package com.bridgelabz;

public class MoodAnalyserMain {
    public MoodAnalyserMain() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
