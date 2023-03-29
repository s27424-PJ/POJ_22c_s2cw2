
public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(6, 60.0, 8.5);
        Vehicle sportsCar = new Vehicle(4, 50.0, 10.0);
        double miniVanRange = miniVan.range();

        double sportsCarRange = sportsCar.range();
        int roundedRangeM =(int) Math.round(miniVanRange);
        int roundedRangeS =(int) Math.round(sportsCarRange);
        System.out.println("Zasięg miniVana: " + roundedRangeM + " km");
        System.out.println("Zasięg sportsCar: " + roundedRangeS + " km");
    }
}
