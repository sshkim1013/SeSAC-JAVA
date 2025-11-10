package d.inheritance.practice3;

public class Car extends Vehicle {

    boolean hasGPS;

    public Car(String model, double dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = super.calculateRentalCost(days);
        if (hasGPS) {
            baseCost += days * 10000;
        }

        return baseCost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hasGPS=" + hasGPS +
                ", model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}
