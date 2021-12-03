/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.refuerzo.pkg8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TallerRefuerzo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Cliente con Ana Gomez, con cédula 11001111, compra 1 computadoras 
        con precio individual $1000. Total a pagar $1000 Cliente con Pedro 
        Huertas, con cédula 21001111, compra 2 computadoras con precio 
        individual $900. Total a pagar $1800

        Total venta de computadoras: $2800*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo_cliente;
        int tipo_computadora;
        int cedula;
        double precio_computadora = 0;
        double total = 0;
        String salida;
        boolean bandera = true;
        String cadena = "";
        int numero_computadora;
        double total_computadora = 0;
        double total_ventas = 0;
        double descuento;

        double porcentaje1 = 1;
        double porcentaje2 = 5;
        double porcentaje3 = 10;
        double porcentaje4 = 15;

        while (bandera) {

            System.out.println("ingrese el nombre del cliente");
            nombre = entrada.nextLine();

            System.out.println("ingrese la cedula del cliente");
            cedula = entrada.nextInt();

            System.out.println("ingrese el tipo de cliente");
            tipo_cliente = entrada.nextInt();

            System.out.println("ingrese el tipo de computadora");
            tipo_computadora = entrada.nextInt();
            
            System.out.println("ingrese el numero de computadoras que desea"
                    + " llevar");
            numero_computadora = entrada.nextInt();

            // precio de las computadoras
            if (tipo_computadora == 1) {
                precio_computadora = 1000;
            } else {
                if (tipo_computadora == 2) {
                    precio_computadora = 1100;
                } else {
                    if (tipo_computadora == 3) {
                        precio_computadora = 900;
                    } else {
                        System.out.println("el tipo de computador es incorrecto");
                    }
                }
            }

            total_computadora = precio_computadora * numero_computadora;
            
            // descueto realizado por el tipo de cliente
            if (tipo_cliente == 1) {
                descuento = total_computadora * porcentaje1 / 100;
                total = total_computadora - descuento;
            } else {
                if (tipo_cliente == 2) {
                    descuento = total_computadora * porcentaje2 / 100;
                    total = total_computadora - descuento;
                } else {
                    if (tipo_cliente == 3) {
                        descuento = total_computadora * porcentaje3 / 100;
                        total = total_computadora - descuento;
                    } else {
                        if (tipo_cliente == 4) {
                            descuento = total_computadora * porcentaje4 / 100;
                            total = total_computadora - descuento;
                        } else {
                            System.out.println("el tipo de empleado es "
                                    + "incorrecto");
                        }
                    }
                }

            }
            
            
            cadena = String.format(cadena + "cliente %s, con cedula %s compra"
                    + " %s computadora(s) con precio individual %s y su total a "
                    + "pagar es %s\n", nombre, cedula, numero_computadora,
                    precio_computadora, total);
            
            total_ventas = total_ventas + total;
                    
            
            
            System.out.println("Ingrese si para salir del proceso");
            salida = entrada.nextLine();

            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
        }
        
        System.out.println(cadena);
        System.out.printf("el total de las ventas es de %s", total_ventas);

    }
}
