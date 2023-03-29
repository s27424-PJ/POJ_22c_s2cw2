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
        Student student = new Student("Adam", "Rzepa", "22c", "Informatyka");
        student.wyswietlDane();
    }
}
