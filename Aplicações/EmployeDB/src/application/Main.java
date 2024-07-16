package application;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Executa o comando git add .
            Process addProcess = Runtime.getRuntime().exec("git add .");
            addProcess.waitFor();

            // Executa o comando git commit -m "save"
            Process commitProcess = Runtime.getRuntime().exec("git commit -m \"save\"");
            commitProcess.waitFor();

            // Executa o comando git push
            Process pushProcess = Runtime.getRuntime().exec("git push");
            pushProcess.waitFor();

            System.out.println("Comandos Git executados com sucesso!");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
