import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Moneda {
    private Double ars2usd = 0.0029;
    private Double ars2eur = 0.0027;
    private Double ars2gbp = 0.0024;
    private Double ars2yen = 0.43;
    private Double ars2rub = 0.28;
    double resultado = 0.00;
    DecimalFormat numberFormat = new DecimalFormat("#,##0.00");
    DecimalFormat numberFormat1 = new DecimalFormat("#,##0.00000");

    public Moneda() {
        String inputValue = JOptionPane.showInputDialog(null,
                "Ingresa el importe a convertir",
                "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE);

        while (!inputValue.matches("^[0-9]\\d*(\\.\\d+)?$")) {
            inputValue = JOptionPane.showInputDialog(null,
                    "Ingresa un número entero o con decimales separados por un \".\" ",
                    "Conversor de Monedas",
                    JOptionPane.PLAIN_MESSAGE);
        }
        Double valor = Double.valueOf(inputValue);

        String a = "AR$ a U$D";
        String b = "AR$ a €UR";
        String c = "AR$ a GB£";
        String d = "AR$ a ¥EN";
        String e = "AR$ a ₽UB";
        String f = "U$D a AR$";
        String g = "€UR a AR$";
        String h = "GB£ a AR$";
        String i = "¥EN a AR$";
        String j = "₽UB a AR$";

        Object[] conversion = {a, b, c, d, e, f, g, h, i, j};
        Object conversionSelector = JOptionPane.showInputDialog(null,
                "Elije una opción de conversión", "Conversor de Monedas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                conversion,
                conversion[0]);

        int selector = Arrays.asList(conversion).indexOf(conversionSelector);

        switch (selector) {
            case 0:
                // Pesos a Dólares
                resultado = valor * ars2usd;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " AR$ = " + numberFormat1.format(resultado) + " U$D",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 1:
                // Pesos a Euros
                resultado = valor * ars2eur;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " AR$ = " + numberFormat1.format(resultado) + " €UR",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 2:
                // Pesos a Libras
                resultado = valor * ars2gbp;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " AR$ = " + numberFormat1.format(resultado) + " GB£",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 3:
                // Pesos a Yenes
                resultado = valor * ars2yen;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " AR$ = " + numberFormat1.format(resultado) + " ¥EN",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 4:
                // Pesos a Rublos
                resultado = valor * ars2rub;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " AR$ = " + numberFormat1.format(resultado) + " ₽UB",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 5:
                // Dólares a Pesos
                resultado = valor / ars2usd;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " U$D = " + numberFormat.format(resultado) + " AR$",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 6:
                // Euros a Pesos
                resultado = valor / ars2eur;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " €UR = " + numberFormat.format(resultado) + " AR$",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 7:
                // Libras a Pesos
                resultado = valor / ars2gbp;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "GB£ = " + numberFormat.format(resultado) + " AR$",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 8:
                // Yenes a Pesos
                resultado = valor / ars2yen;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " ¥EN = " + numberFormat.format(resultado) + " AR$",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
            case 9:
                // Rublos a Pesos
                resultado = valor / ars2rub;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + " ₽UB = " + numberFormat.format(resultado) + " AR$",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE,
                        null);
                break;
        }
    }
}

