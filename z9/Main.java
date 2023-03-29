import java.io.IOException;

public class Main {

    private char docelowyX;

    public Main() {
        docelowyX = (char) ((int) (Math.random() * 26) + 'A');
    }

    public void play() throws IOException {
        while (true) {
            System.out.println("Wprowadź klawisz z zakresu od A do Z:");
            char inputChar = (char) System.in.read();
            inputChar = Character.toUpperCase(inputChar);
            while ( Character.isISOControl(inputChar)) {
                inputChar = (char) System.in.read();
                inputChar = Character.toUpperCase(inputChar);
            }
            if (inputChar == docelowyX) {
                System.out.println("Dobrze!");
                break;
            } else if (inputChar < docelowyX) {
                System.out.println("Źle! Trafiłeś za nisko ");
            } else {
                System.out.println("Źle! Trafiłeś za wysoko");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main game = new Main();
        game.play();
    }
}