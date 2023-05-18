package ConversorLongitud;

import javax.swing.JOptionPane;

public class ConvertirAMetros {

    // Métodos de conversión

    public void convertirKilometrosAMetros(double valor) {
        double metros = valor * 1000;
        metros = (double) Math.round(metros);
        JOptionPane.showMessageDialog(null, "Tienes " + metros + " metros.");
    }

    public void convertirDecimetrosAMetros(double valor) {
        double metros = valor / 10;
        metros = (double) Math.round(metros);
        JOptionPane.showMessageDialog(null, "Tienes " + metros + " metros.");
    }

    public void convertirCentimetrosAMetros(double valor) {
        double metros = valor / 100;
        metros = (double) Math.round(metros);
        JOptionPane.showMessageDialog(null, "Tienes " + metros + " metros.");
    }

    public void convertirMilimetrosAMetros(double valor) {
        double metros = valor / 1000;
        metros = (double) Math.round(metros);
        JOptionPane.showMessageDialog(null, "Tienes " + metros + " metros.");
    }
    
}
