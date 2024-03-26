package main;


import post.Post;
import myUtil.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(DateForm.setDate(), "Praia do Rio", "Fim de semana viajando com a família", 87);
        post1.addComent(readComent.readComents());
        post1.addComent(readComent.readComents());

        Post post2 = new Post(DateForm.setDate(), "Camp Nou", "Assistindo meu primeiro el classico", 647);
        post2.addComent(readComent.readComents());
        post2.addComent(readComent.readComents());


        JOptionPane.showMessageDialog(null, post1.toString());
        JOptionPane.showMessageDialog(null, post2.toString());
    }
}
