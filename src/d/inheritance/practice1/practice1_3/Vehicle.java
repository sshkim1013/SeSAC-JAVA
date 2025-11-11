package d.inheritance.practice1.practice1_3;

public class Vehicle {

    String model;
    double dailyRate;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", dailyRate=" + dailyRate +
                '}';
    }
}
