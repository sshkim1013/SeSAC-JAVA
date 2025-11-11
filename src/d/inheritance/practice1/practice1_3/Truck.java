package d.inheritance.practice1.practice1_3;

public class Truck extends Vehicle {

    double capacity;

    public Truck(String model, double dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = super.calculateRentalCost(days);
        baseCost += capacity * days * 5000;

        return baseCost;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacity=" + capacity +
                ", model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}
