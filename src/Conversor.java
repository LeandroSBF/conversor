import javax.swing.*;
import java.util.Arrays;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class Conversor {
    public Conversor() {
        String[] opciones = {"Conversor de Monedas", "Conversor de Temperaturas"};

        String opcionElegida = (String) JOptionPane.showInputDialog(null,
                "Elije un conversor",
                "Conversor",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        int casos = Arrays.asList(opciones).indexOf(opcionElegida);

        switch (casos) {
            case 0:
                new Moneda();
                break;
            case 1:
                new Temperatura();
                break;
        }
    }

    public boolean continuar() {
        int a = JOptionPane.showConfirmDialog(null,
                "¿Deseas continuar?", "Conversor", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (a != 0) {
            JOptionPane.showMessageDialog(null, "¡Hasta pronto!", "Cerrando el programa", JOptionPane.PLAIN_MESSAGE);
            return false;
        } else {
            return true;
        }
    }
}