import java.util.Scanner;

public class Main {
    private String string1;
    private String string2;

    public Main(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }
    public String PorownajStringi() {

        if (string1.equals(string2)) {
            return "true";
        } else {
            return "false";
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("str1: ");
        String string1 = scanner.nextLine();
        System.out.print("str2: ");
        String string2 = scanner.nextLine();
        Main stringi = new Main(string1,string2);
        System.out.println("str1==str2 ");
        System.out.println(stringi.PorownajStringi());
    }
}
