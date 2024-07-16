package application;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ProcessBuilder addBuilder = new ProcessBuilder("git", "add", ".");
            addBuilder.redirectErrorStream(true);
            Process addProcess = addBuilder.start();
            addProcess.waitFor();
        }
        catch (InterruptedException | IOException error) {
            System.out.println("Error to exec \"git add .\" " + error.getMessage());
        }
    }

}
