package CalculosIva;

import javax.swing.JOptionPane;


public class calcluarIvaJoption {
    public static void main(String[] args) {

        String precio = JOptionPane.showInputDialog("Precio SIN Iva");

        double precioSinIva = Double.parseDouble(precio);
        double iva = 1.21;

        double precioConIva = precioSinIva * iva;

        System.out.println("El precio CON Iva es " + precioConIva);

    }
}
