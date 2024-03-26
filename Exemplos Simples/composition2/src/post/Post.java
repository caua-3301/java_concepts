package post;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import myUtil.DateForm;

public class Post {
    private LocalDate date;
    private String title;
    private String content;
    private int likes;

    private List<Coment> coments = new ArrayList<>();

    public Post(LocalDate date, String title, String content, int likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void addComent(Coment coment) {
        coments.add(coment);
        JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
    }

    public StringBuilder showAllComents() {
        StringBuilder comentsInString = new StringBuilder();
        for (Coment coment : coments) {
            comentsInString.append(coment.getText() + "%n");
        }
        comentsInString.append("%n%n");

        return comentsInString;
    }

    @Override
    public String toString() {
        return String.format("Resumo post: %n" +
                title + "%n" +
                content + "%n" +
                DateForm.formate.format(date) + "%nLikes: " + likes + "%n%nComentarios: %n" +
                showAllComents());
    }
}
