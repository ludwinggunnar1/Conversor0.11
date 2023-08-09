import javax.swing.*;
import java.text.DecimalFormat;
public class Conversor {
    public double valor;
    public String conversor;
    public Conversor(double valor, String conversor) {
        this.valor = valor;
        this.conversor = conversor;
    }
    public void cPesoDolar(){
        if (conversor != null) {
            if (conversor.equals("Boliviano a Dólar")) {
                this.valor = valor / 6.91;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Dolares.");
            }
            else if (conversor.equals("Dólar a Boliviano")){
                this.valor = valor / 0.1448;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Bolivianos.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void cPesoEuro(){
        if (conversor != null) {
            if (conversor.equals("Boliviano a Euro")) {
                this.valor = valor / 7.58;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Euros.");
            }
            else if (conversor.equals("Euros a Boliviano")){
                this.valor = valor / 0.132;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Bolivianos.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void cPesoLibra(){
        if (conversor != null) {
            if (conversor.equals("Boliviano a Libra Esterlina")) {
                this.valor = valor / 8.87;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Libras Esterlinas.");
            }
            else if (conversor.equals("Libra Esterlina a Boliviano")){
                this.valor = valor / 0.1128;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Bolivianos.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void cPesoYen(){
        if (conversor != null) {
            if (conversor.equals("Boliviano a Yen Japonés")) {
                this.valor = valor / 0.049;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Yen Japones.");
            }
            else if (conversor.equals("Yen Japonés a Boliviano")){
                this.valor = valor / 20.57829;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Bolivianos.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }

    public void cPesoWon(){
        if (conversor != null) {
            if (conversor.equals("Boliviano a Won sul-coreano")) {
                this.valor = valor / 0.0053;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Won sul-coreano.");
            }
            else if (conversor.equals("Won sul-coreano a Boliviano")){
                this.valor = valor / 188.052;
                DecimalFormat df = new DecimalFormat("#.##");
                String res = df.format(this.valor);
                JOptionPane.showMessageDialog(null, res + " Bolivianos.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Error de valor ingresado");
        }
    }
}