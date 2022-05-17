package vehicle;
import components.Component;
import java.sql.Array;
import java.util.ArrayList;

public class Vehicle {
    private String name;
    private VehicleType type;
    private int price;
    private ArrayList<Component> components;

    public Vehicle(String name, VehicleType type , int price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.components = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public VehicleType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public int numberOfComponents(){
        return components.size();
    }

    public void addComponent(Component component){
        this.components.add(component);
    }
}
