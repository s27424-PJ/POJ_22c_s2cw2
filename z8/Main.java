import java.util.Scanner;
import java.lang.Math;
public class Main {

    private boolean p[];
    private boolean q[];

    public Main(boolean[] p, boolean[] q) {
        this.p = p;
        this.q = q;
    }
    public boolean And(boolean p, boolean q) {
        boolean wynik;
        if(p&&q){
            wynik=true;
        }
        else {
            wynik=false;
        }
        return wynik;


    }
    public boolean Or(boolean p, boolean q) {
        boolean wynik;
        if(p||q){
            wynik=true;
        }
        else {
            wynik=false;
        }
        return wynik;

    }
    public boolean Xor(boolean p, boolean q) {
        boolean wynik;
        if(p^q){
            wynik=true;
        }
        else {
            wynik=false;
        }
        return wynik;

    }
    public boolean Not(boolean p, boolean q) {
        boolean wynik;
        if(p!=true){
            wynik=true;
        }
        else {
            wynik=false;
        }
        return wynik;

    }
    public static void main(String[] args) {
        boolean p[] = new boolean[4];
        boolean q[] = new boolean[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz pierwszą tablcę");
        p[0]= scanner.nextBoolean();
        p[1]= scanner.nextBoolean();
        p[2]= scanner.nextBoolean();
        p[3]= scanner.nextBoolean();
        System.out.println("Wpisz drugą tablcę");
        q[0]= scanner.nextBoolean();
        q[1]= scanner.nextBoolean();
        q[2]= scanner.nextBoolean();
        q[3]= scanner.nextBoolean();
        Main test = new Main(p, q);
        // Wyświetlanie tabeli
        System.out.println(" P     | Q     | AND   | OR    | XOR   | NOT");
        System.out.println("-------+-------+-------+------+-------+------");
        for (int i = 0; i < 4; i++) {
            System.out.printf(" %5s | %5s | %5s | %5s | %5s | %5s\n",
                    p[i], q[i], test.And(p[i], q[i]), test.Or(p[i], q[i]),
                    test.Xor(p[i], q[i]), test.Not(p[i], q[i]));
        }
    }
}
