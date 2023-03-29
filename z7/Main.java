import java.util.Scanner;
import java.lang.Math;
public class Main {

    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void wypiszTablice() {
        // wypisanie tablicy na ekranie
        System.out.print("Pojemnośc walca wynosi ");
        float pi = Math.round(Math.PI * 10000) / 10000f;

        float wynik;
        wynik=(pi*x*x*y);
        wynik =  Math.round(wynik * 10000) / 10000f;
        System.out.print(wynik);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień walca: ");
        int x = scanner.nextInt();
        System.out.print("Podaj wysokość walca: ");
        int y = scanner.nextInt();

        Main tablica = new Main(x,y);

        tablica.wypiszTablice();

    }
}
