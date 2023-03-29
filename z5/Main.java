import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private int x;
    private int y;

    public Main(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void inkr() {
        ++x;
        System.out.println("++x = "+x);
        y++;
        System.out.println("y++ = "+y);
        x--;
        System.out.println("x-- = "+x);
        --y;
        System.out.println("--y = "+y);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakie przykłady operacji chcesz zobaczyć: a==inkrementacji/dekrementacji b==arytmetycznych c==relacyjnych");
        String odp = scanner.nextLine();
        if(odp.equals("a")) {
            System.out.print("x = ");
            int x = scanner.nextInt();
            System.out.print("y = ");
            int y = scanner.nextInt();
            Main test = new Main(x, y);
            test.inkr();
        }
        else if(odp.equals("b")) { //teraz przechodzimy do klasy aryt.java
            System.out.println("Liczby wpisz z przecinkiem a nie z kropką");
            System.out.print("w = ");
            float w = scanner.nextFloat();
            System.out.print("z = ");
            float z = scanner.nextFloat();
            aryt test = new aryt(w,z);
            test.ary();
        } else if (odp.equals("c"))
        {
            System.out.print("m = ");
            int m = scanner.nextInt();
            System.out.print("n = ");
            int n = scanner.nextInt();
            System.out.print("o = ");
            int o = scanner.nextInt();
            relac test = new relac(m,n,o);
            test.rel();
        }
    }
}
