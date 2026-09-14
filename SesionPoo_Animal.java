package com.mycompany.sesionpoo_animal;

/**
 *
 * @author Esteban Avila
 */
public class SesionPoo_Animal {

    public static void main(String[] args) {
        
        Animal a1 = new Animal (" manchas ", " perro ", 4, " ladrido ");
        Animal a2 = new Animal (" juan ", " caballo ", 12, " relinchido ");
        Animal a3 = new Animal (" alas ", " cuervo ", 8, " graznido ");
        Animal a4 = new Animal (" claudio ", " gallo ", 3, " cacareo ");
        Animal a5 = new Animal (" bigotes ", " gato ", 10, " maullido ");
        
       a1.mostrarInfo(); 
       a2.mostrarInfo(); 
       a3.mostrarInfo(); 
       a4.mostrarInfo(); 
       a5.mostrarInfo(); 
       
       a1.mostrarSonido(); 
       a2.mostrarSonido(); 
       a3.mostrarSonido(); 
       a4.mostrarSonido(); 
       a5.mostrarSonido(); 
    }
}