package people;

import behaviours.IBuy;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private int money;
    private ArrayList<Vehicle> vehiclesList;

    public Dealership(int money) {
        this.money = money;
        this.vehiclesList = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesList.add(vehicle);
    }

    @Override
    public void buyVehicle(Vehicle vehicle) {

        if (this.money > vehicle.getPrice()) { //if customer has enough funds
            this.money -= vehicle.getPrice();
            addVehicle(vehicle);
        }
    }
    }


