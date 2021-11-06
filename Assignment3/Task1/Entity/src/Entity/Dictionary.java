package Entity;

public abstract class Dictionary {
    private int id;
    private String name;

    public Dictionary() {
        this.id = 0;
        this.name = "";

    }

    public Dictionary(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
