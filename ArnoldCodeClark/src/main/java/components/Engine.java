package components;

public class Engine extends Component {

    private int power, litres;

    public Engine(String name, int power, int litres) {
        super(name);
        this.power = power;
        this.litres = litres;
    }

    public int getPower() {
        return power;
    }

    public int getLitres() {
        return litres;
    }
}
