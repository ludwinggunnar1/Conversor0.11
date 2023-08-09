import javax.swing.JOptionPane; //JOptionPane.showInputDialog(COMPONENTE, MENSAJE, TITULO, TIPO DE MENSAJE, ICONO, ARREGLO, VALOR INICIAL);
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un valor", "Conversor", JOptionPane.PLAIN_MESSAGE));

        do {
            String conversor1 = (JOptionPane.showInputDialog(null, "Ingresa una opción:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new  Object[] {"Conversor de moneda", "Conversor de temperatura"},"Seleccione una opción de conversión")).toString();

            if (conversor1.equals("Conversor de moneda")){

                String conversor = (JOptionPane.showInputDialog(null, "Ingresa una opción:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new  Object[] {"Boliviano a Dólar", "Boliviano a Euro", "Boliviano a Libra Esterlina", "Boliviano a Yen Japonés", "Boliviano a Won sul-coreano", "Dólar a Boliviano", "Euros a Boliviano", "Libra Esterlina a Boliviano", "Yen Japonés a Boliviano", "Won sul-coreano a Boliviano"},"Seleccione una opción de conversión")).toString();
                Conversor conv = new Conversor(valor, conversor);

                switch (conversor){
                    case "Boliviano a Dólar":
                        conv.cPesoDolar();
                        break;
                    case "Boliviano a Euro":
                        conv.cPesoEuro();
                        break;
                    case "Boliviano a Libra Esterlina":
                        conv.cPesoLibra();
                        break;
                    case "Boliviano a Yen Japonés":
                        conv.cPesoYen();
                        break;
                    case "Boliviano a Won sul-coreano":
                        conv.cPesoWon();
                        break;

                    case "Dólar a Boliviano":
                        conv.cPesoDolar();
                        break;
                    case "Euros a Boliviano":
                        conv.cPesoEuro();
                        break;
                    case "Libra Esterlina a Boliviano":
                        conv.cPesoLibra();
                        break;
                    case "Yen Japonés a Boliviano":
                        conv.cPesoYen();
                        break;
                    case "Won sul-coreano a Boliviano":
                        conv.cPesoWon();
                        break;
                    default:
                        break;
                }

            } else if (conversor1.equals("Conversor de temperatura")) {

                String conversor = (JOptionPane.showInputDialog(null, "Ingresa una opción:", "Menu", JOptionPane.PLAIN_MESSAGE, null, new  Object[] {"Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit", "Kelvin a Celsius"},"Seleccione una opción de conversión")).toString();
                Temperatura temp = new Temperatura(valor, conversor);

                switch (conversor){
                    case "Celsius a Fahrenheit":
                        temp.cCelcFare();
                        break;
                    case "Fahrenheit a Celsius":
                        temp.cCelcFare();
                        break;
                    case "Celsius a Kelvin":
                        temp.cCelcKevl();
                        break;
                    case "Kelvin a Celsius":
                        temp.cCelcKevl();
                        break;
                    case "Fahrenheit a Kelvin":
                        temp.KelvFare();
                        break;
                    case "Kelvin a Fahrenheit":
                        temp.KelvFare();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Dato erroneo");
                        break;
                }
            }            //JOptionPane.showMessageDialog(null, "Prueba injection");
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un valor", "Conversor", JOptionPane.PLAIN_MESSAGE));
        }while (valor != 000);//JOptionPane.showMessageDialog(null, "El valor ingresado " + valor , "Conversor" , JOptionPane.PLAIN_MESSAGE);
    }
}