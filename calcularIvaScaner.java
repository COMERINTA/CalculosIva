package CalculosIva;

import java.util.Scanner;

public class calcularIvaScaner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double precioSinIva = sc.nextDouble();
        double iva = 1.21;

        double precioConIva = (precioSinIva * iva);

        System.out.println("El precio con IVA es " + precioConIva);
    }
}
