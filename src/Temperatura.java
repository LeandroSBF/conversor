import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Temperatura {

    double resultado = 0.00;
    DecimalFormat numberFormat = new DecimalFormat("#,###.0");

    public Temperatura() {
        String inputValue = JOptionPane.showInputDialog(null,
                "Ingresa los grados a convertir",
                "Conversor de Temperaturas",
                JOptionPane.PLAIN_MESSAGE);
        while (!inputValue.matches("^-?[0-9]\\d*(\\.\\d+)?$")) {
            inputValue = JOptionPane.showInputDialog(null,
                    "Ingresa un número entero o con decimales separados por un \".\" ",
                    "Conversor de Temperaturas",
                    JOptionPane.PLAIN_MESSAGE);
        }

        double valor = Double.parseDouble(inputValue);

        String a = "Celcius a Farenheit";
        String b = "Celcius a Kelvin";
        String c = "Farenheit a Celcius";
        String d = "Farenheit a Kelvin";
        String e = "Kelvin a Celcius";
        String f = "Kelvin a Farenheit";

        Object[] conversion = {a,b,c,d,e,f};
        Object conversionSelector = JOptionPane.showInputDialog(null,
                "Elije una opción de conversión",
                "Conversor de Temperaturas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                conversion,
                conversion[0]);

        int selector = Arrays.asList(conversion).indexOf(conversionSelector);

        switch(selector) {
            case 0:
                // Celcius a Farenheit
                resultado = (valor * 9/5) + 32;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºC = " + numberFormat.format(resultado) + "ºF",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                // Celcius a Kelvin
                resultado = valor + 273.15;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºC = " + numberFormat.format(resultado) + "ªF",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                // Farenheit a Celcius
                resultado = (valor - 32) * 5/9;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºF = " +  numberFormat.format(resultado) + "ºC",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                // Farenheit a Kelvin
                resultado = (valor + 459.67) * 5/9;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºF = " + numberFormat.format(resultado) + "ºK",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                // Kelvin a Celcius
                resultado = valor - 273.15;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºK = "  + numberFormat.format(resultado) + "ºC",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            case 5:
                // Kelvin a Farenheit
                resultado = (valor * 9/5) - 459.67;
                JOptionPane.showMessageDialog(null,
                        numberFormat.format(valor) + "ºK = "  + numberFormat.format(resultado) + "ºF",
                        "Conversión",
                        JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }
}