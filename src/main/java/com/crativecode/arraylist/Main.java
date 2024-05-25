package com.crativecode.arraylist;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.crativecode.arraylist.models.Persona;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        

        Scanner sc;
      /*   System.out.println("Ingrese un nombre :");
        nombres.add(sc.nextLine());
        System.out.println(nombres);

        System.out.println("Ingrese un nombre :");
        myPerson.setNombre(sc.nextLine());

        System.out.println("Ingrese el correo electronico :");
        myPerson.setEmail(sc.nextLine());

        System.out.println("Ingrese la edad :");
        myPerson.setEdad(sc.nextInt());

        personas.add(myPerson);*/

//         System.out.println(personas);

// /*         personas.forEach( persona -> {
//             System.out.println(String.format("Nombre: %s \nEmail: %s \nEdad: %d", persona.getNombre(), persona.getEmail(), persona.getEdad()));
//         }); */

//         personas.forEach( persona -> {
//             System.out.println(MessageFormat.format("Nombre: {0} \nEmail: {1} \nEdad: {2}", persona.getNombre(), persona.getEmail(), persona.getEdad()));
//         });

        while (JOptionPane.showConfirmDialog(null,"Desea Ingresar una persona", "Registro de personas", JOptionPane.YES_NO_OPTION) == 0 ) {
            sc= new Scanner(System.in);

            Persona myPerson = new Persona();
            System.out.println("Ingrese un nombre :");
            myPerson.setNombre(sc.nextLine());

            System.out.println("Ingrese el correo electronico :");
            myPerson.setEmail(sc.nextLine());
    
            System.out.println("Ingrese la edad :");
            myPerson.setEdad(sc.nextInt());

            personas.add(myPerson);
        }
        personas.forEach( persona -> {
            System.out.println(MessageFormat.format("Nombre: {0} \nEmail: {1} \nEdad: {2}", persona.getNombre(), persona.getEmail(), persona.getEdad()));
        }); 
    }
}