package Principal;

import javax.swing.JOptionPane;

import ConversorMonedas.FuncionConversorDivisa;
import ConversorTemperatura.FuncionConversorTemperatura;
import ConversorLongitud.FuncionLongitud;

public class Principal {
    public static void main(String[] args) {

        FuncionConversorDivisa monedas = new FuncionConversorDivisa();
        FuncionConversorTemperatura temperatura = new FuncionConversorTemperatura();
        FuncionLongitud longitud = new FuncionLongitud();

        boolean salir = false;

        while (!salir) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de Divisas", "Conversor de Temperaturas", "Conversor de Longitud"},
                    "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Divisas":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (validarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertirMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (respuesta != JOptionPane.OK_OPTION) {
                            salir = true;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperaturas":
                    input = JOptionPane.showInputDialog("Introduzca el número de la temperatura que deseas convertir: ");
                    if (validarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if (respuesta != JOptionPane.OK_OPTION) {
                            salir = true;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Longitud":
                    input = JOptionPane.showInputDialog("Ingresa la longitud que deseas convertir: ");
                    if (validarNumero(input)) {
                        double Minput = Double.parseDouble(input);
                        longitud.ConvertirLongitud(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (respuesta != JOptionPane.OK_OPTION) {
                            salir = true;
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }
    }

    public static boolean validarNumero(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
