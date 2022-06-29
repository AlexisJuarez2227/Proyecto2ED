package com.upchiapas.proyecto.models;

import java.io.InputStream;
import java.util.Scanner;

public class Inventario {
    private Producto listaProducto[];
    private Producto producto = new Producto();
    Scanner entrada = new Scanner(System.in);
    public Inventario(InputStream in){

    }

    public void registrar() {
        listaProducto = new Producto[5];
        for (int i = 1; i < listaProducto.length; i++) {
            System.out.println("Favor de ingresar el nombre del producto: " + i);
            producto.setNombre(entrada.next());
            System.out.println("Favor de ingresar la id: ");
            producto.setId(entrada.nextInt());
            do {
                System.out.println("Favor de introducir el stock: ");
                producto.setStock(entrada.nextInt());
            }while (producto.getStock()<1000 || producto.getStock()>9999);
            listaProducto[i] = producto;
        }
    }

    public void ordenar(){
        Producto producto1 = new Producto();
        for ( int i=0 ; i<listaProducto.length; i++ )
        {
            for ( int j=0 ; j<listaProducto.length-1 ; j++ )
            {
                if ( listaProducto[j].getStock() > listaProducto[j+1].getStock() )
                {
                    producto1 = listaProducto[j];
                    listaProducto[j] = listaProducto[j+1];
                    listaProducto[j+1] = producto1;
                }
            }
        }
    }

    public void visualizar(){
        for(int i = 0; i < listaProducto.length; i++){
            System.out.println("Este es el nombre del producto: "+ listaProducto[i].getNombre()+ listaProducto[i].getId()+ listaProducto[i].getStock());

        }

    }
}
