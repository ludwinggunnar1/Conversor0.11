import javax.swing.*;
import java.text.DecimalFormat;

public class Temperatura {
    public double valor;
    public String conversor;
    public Temperatura(double valor, String conversor) {
        this.valor = valor;
        this.conversor = conversor;
    }

    public void cCelcFare(){
        if (conversor != null) {
            if (conversor.equals("Celsius a Fahrenheit")) {
                this.valor = (valor * 9 / 5)+32;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Fahrenheit.");
            }
            else if (conversor.equals("Fahrenheit a Celsius")){
                this.valor = (valor -32) * 5 / 9;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Celsius.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void cCelcKevl(){
        if (conversor != null) {
            if (conversor.equals("Celsius a Kelvin")) {
                this.valor = valor + 273.15;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Kelvin.");
            }
            else if (conversor.equals("Kelvin a Celsius")){
                this.valor = valor - 273.15;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Celsius.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void KelvFare(){
        if (conversor != null) {
            if (conversor.equals("Fahrenheit a Kelvin")) {
                this.valor = (valor + 459.67) * 5 / 9;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Kelvin.");
            }
            else if (conversor.equals("Kelvin a Fahrenheit")){
                this.valor = (valor * 9 / 5) - 459.67;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Fahrenheit.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }
}