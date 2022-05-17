package components;

public class Tyres extends Component {
    private int tread;

    public Tyres(String name, int tread) {
        super(name);
        this.tread = tread;
    }

    public int getTread() {
        return tread;
    }

}
