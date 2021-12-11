package CalculosIva;

public class calcularIva {
    public static void main(String[] args) {

        double precioSinIVA = 100;
        double iva = 1.21;

        double precioConIva = precioSinIVA * iva;

        System.out.println("El precio con IVA es " + precioConIva);
    }
}
