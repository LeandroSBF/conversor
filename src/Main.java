import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar) {
            Conversor conversor = new Conversor();
            continuar = conversor.continuar();
        }
    }
}