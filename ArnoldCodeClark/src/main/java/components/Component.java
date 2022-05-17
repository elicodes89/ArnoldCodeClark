package components;

public abstract class Component {

    private String name;

    public String getName() {
        return name;
    }

    public Component(String name) {
        this.name = name;
    }
}
