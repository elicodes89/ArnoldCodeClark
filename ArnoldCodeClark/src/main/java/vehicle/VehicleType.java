package vehicle;

public enum VehicleType {
    PETROL(3),
    DIESEL(3),
    ELECTRIC(120),
    HYBRID(30);

    private final int chargeMinutes;

    VehicleType(int chargeMinutes) {
        this.chargeMinutes = chargeMinutes;
    }

    public int getChargeMinutes() {
        return chargeMinutes;
    }
}

