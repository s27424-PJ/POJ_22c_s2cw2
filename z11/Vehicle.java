public class Vehicle {
    private int passengers;
    private double fuelcap;
    private double fuelconsumption;


    public Vehicle(int passengers, double fuelcap, double spalanie) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.fuelconsumption = spalanie;
    }

    public double range() {
        return fuelcap / fuelconsumption * 100;
    }
}

