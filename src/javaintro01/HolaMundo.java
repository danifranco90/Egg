/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner (System.in);
        //se crea una variable cadena (String) que se utiliza para leer datos del usuario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next();
        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
        
        // TODO code application logic here
    }
    
}
