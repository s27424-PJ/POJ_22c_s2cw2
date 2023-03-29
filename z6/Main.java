import java.util.Scanner;
public class Main {
    Scanner scanner = new Scanner(System.in);
    private int[][] tablica;

    public Main() {
        tablica = new int[3][3];
    }

    public void wypelnijTablice() {
        System.out.println("Wpisz wartosci do tablicy:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j]=scanner.nextInt();;
            }
        }
    }

    public void wypiszTablice() {
        // wypisanie tablicy na ekranie
        System.out.println("Tablica:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void zamienWiersze() {
        int[] tymcz= tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = tymcz;
    }

    public static void main(String[] args) {
        Main tablica = new Main();
        tablica.wypelnijTablice();
        tablica.wypiszTablice();
        tablica.zamienWiersze();
        tablica.wypiszTablice();
    }
}
