package myUtil;

import post.Coment;
import javax.swing.JOptionPane;

public class readComent {

    /*The first parameter is the number of comments, and the second is the reference to a list of comments*/
    public static Coment readComents() {
        return new Coment(JOptionPane.showInputDialog(null, "Digite um comentário:"));
    }
}
