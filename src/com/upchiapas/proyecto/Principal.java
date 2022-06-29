package com.upchiapas.proyecto;

import com.upchiapas.proyecto.models.Inventario;
import com.upchiapas.proyecto.models.Producto;

import java.util.Scanner;

public class Principal {
    private static Scanner teclado = new Scanner(System.in);
    private static Inventario inventario = new Inventario(System.in);


    public static void main(String[] args){
        byte opcion;
        do{
            System.out.println("Menu");
            System.out.println("1. Agregar productos");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            opcion = teclado.nextByte();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    inventario.registrar();
                    inventario.ordenar();
                    break;
                case 2:
                    inventario.visualizar();
                    break;
            }
            System.out.print("Presione una tecla para continuar...");
            teclado.nextLine();
        }while (opcion <3);

    }
}
