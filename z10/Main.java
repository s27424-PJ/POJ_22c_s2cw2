public class Main {

    private int x;

    public Main(int x) {
        this.x =x;
    }
    public void inkr() {
        int liczba = 1;
        for (int i = 0; i <= 14; i++) {
            System.out.println("2 do potęgi " + i + " wynosi " + liczba);
            liczba *= 2;
        }
    }

        public static void main(String[] args) {
            int liczba = 1;
            int x=2;
            Main test = new Main(x);
            test.inkr();

    }
}