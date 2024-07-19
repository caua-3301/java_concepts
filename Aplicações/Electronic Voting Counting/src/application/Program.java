package application;

import entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String path = "src/data/votesContent.txt";
        Map<String,Integer> candidates = new HashMap<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();

            while (line != null) {
                String[] data = line.split(",");

                if (candidates.containsKey(data[0])) {
                    int current_votes = Integer.parseInt(data[1]) + candidates.get(data[0]);
                    candidates.put(data[0], current_votes);
                }
                else {
                    candidates.put(data[0], Integer.parseInt(data[1]));
                }
                line = bf.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        for(String key : candidates.keySet()) {
            System.out.printf("%s - %s %n", key, candidates.get(key));
        }
    }

}
