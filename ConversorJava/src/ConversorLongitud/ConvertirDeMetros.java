package ConversorLongitud;

import javax.swing.JOptionPane;

public class ConvertirDeMetros {

    

    public void convertirMetrosAKilometros(double metros) {
        double kilometros = metros / 1000;
        JOptionPane.showMessageDialog(null, metros + " metros es igual a " + kilometros + " kilómetros.");
    }

    public void convertirMetrosADecimetros(double metros) {
        double decimetros = metros * 10;
        JOptionPane.showMessageDialog(null, metros + " metros es igual a " + decimetros + " decímetros.");
    }

    public void convertirMetrosACentimetros(double metros) {
        double centimetros = metros * 100;
        JOptionPane.showMessageDialog(null, metros + " metros es igual a " + centimetros + " centímetros.");
    }

    public void convertirMetrosAMilimetros(double metros) {
        double milimetros = metros * 1000;
        JOptionPane.showMessageDialog(null, metros + " metros es igual a " + milimetros + " milímetros.");
    }

    
}
