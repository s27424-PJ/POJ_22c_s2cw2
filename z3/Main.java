public class Main {

    public static void main(String[] args) {
        Wartosci wartosci = new Wartosci();
        wartosci.DrukujWartosci();
    }
}

class Wartosci {
    short a;
    int b;
    long c;
    float d;
    double e;
    char f;
    boolean g;

    public void DrukujWartosci() {
        System.out.println("Primitive types in Java:");
        System.out.println("short: " + a);
        System.out.println("int: " + b);
        System.out.println("long: " + c);
        System.out.println("float: " + d);
        System.out.println("double: " + e);
        System.out.println("char: " + f);
        System.out.println("boolean: " + g);
    }
}