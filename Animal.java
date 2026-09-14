package com.mycompany.sesionpoo_animal;

/**
 *
 * @author Esteban Avila
 */
public class Animal {
    
    String nombre;
    String especie;
    int edad;
    String sonido;
    Animal siguiente;
    
    public Animal (String nombre, String especie, int edad, String sonido) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sonido = sonido; 
    }
    
    void mostrarInfo(){
        System.out.println(" nombre: " + nombre + " | especie: " + especie + " | edad: " + edad + " | sonido: " + sonido);   
    }
   
    void mostrarSonido () {
        System.out.println(" el nombre es: " + nombre + " y su sonido es " + sonido + " su edad es: " + edad + " y pertenece a la especie " + especie);
    }
}