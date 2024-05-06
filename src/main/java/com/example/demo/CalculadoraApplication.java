package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SpringApplication.run(CalculadoraApplication.class, args);
        int tablaDeMultiplicar = 0;
        int menu = 0;

        System.out.println("ingrese el numero de la opcion que desea realizar: \n");
        System.out.println("1: mostrar una tabla");
        System.out.println("2: mostrar las tablas del nuero 2 al 5");
        System.out.println("3: salir");
        menu = teclado.nextInt();

        switch (menu) {
            case 1:
                System.out.println("ingrese el numero de la tabla de multiplicar que desea ver:");
                tablaDeMultiplicar = teclado.nextInt();
                tablaMultiplicar(tablaDeMultiplicar);
                break;
            case 2:
                System.out.println("mostrando las tablas de multiplicar del 2 al 5...\n");
                tablaMultiplicar(2);
                tablaMultiplicar(3);
                tablaMultiplicar(4);
                tablaMultiplicar(5);

                break;
            case 3:
				System.out.println("gracias por usar esta calculadora :)");
                return;
            default:
                throw new AssertionError();
        }
    }

    public static void tablaMultiplicar(int numero) {
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(" " + numero + " X " + i + " =" + " " + resultado);
        }
	System.out.println("\n");
    }

}
