public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(6,60,8.5);
        Vehicle sportsCar = new Vehicle(4,50,10);
        //miniVan.range("Minivan");
        //sportsCar.range("Auto sportowe");
        miniVan.fuelNeeded("Minivan",220);  // nazwa, oraz ilość kilometrów jakich chcemy przejechac
        sportsCar.fuelNeeded("Auto sportowe",322);  // ilość kilometrów jakich chcemy przejechac
    }
}
