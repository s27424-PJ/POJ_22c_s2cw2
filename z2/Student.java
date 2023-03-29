import java.util.Scanner;

public class Student {

    private String imie;
    private String nazwisko;
    private String grupa;
    private String kierunek;
    public Student(String imie, String nazwisko, String grupa, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.grupa = grupa;
        this.kierunek = kierunek;
    }
    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek studiów: " + kierunek);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Imię: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj Grupę: ");
        String grupa = scanner.nextLine();

        System.out.print("Podaj Kierunek Studiów: ");
        String kierunek = scanner.nextLine();

        Student student = new Student(imie,nazwisko,grupa,kierunek );
        student.wyswietlDane();
    }
}
