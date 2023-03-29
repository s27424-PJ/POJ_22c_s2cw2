public class relac {
    private int m;
    private int n;
    private int o;

    public relac(int m, int n, int o) {
        this.m = m;
        this.n = n;
        this.o = o;
    }

    public void rel() {
        boolean wynik;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        wynik = (m < n);
        System.out.println("m < n = " + wynik);
        wynik = (m > o);
        System.out.println("m > o = " + wynik);
        wynik = (n <= o);
        System.out.println("n ≤ o = " + wynik);
        wynik = (m >= n);
        System.out.println("m ≥ n = " + wynik);
        wynik = (n == o);
        System.out.println("n == o = " + wynik);
        wynik = (m != o);
        System.out.println("m ≠≠ o = " + wynik);
    }
}