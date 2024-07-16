package entities;

public class EMployee implements Comparable<EMployee> {

    private String id;
    private String name;

    public EMployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(EMployee o) {
        return name.compareTo(o.getName());
    }
}
