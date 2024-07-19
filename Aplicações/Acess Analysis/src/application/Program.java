package application;

import entities.Users;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        //CONFIGS
        Scanner sc = new Scanner(System.in);
        Set<Users> setUsers = new HashSet<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        //CONFIGS

        System.out.println("Caminho relativo: (src/data/content.txt): ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] user = line.split(" ");
                setUsers.add(new Users(user[0], LocalDateTime.parse(user[1])));
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(setUsers.size());

        sc.close();
    }
}
