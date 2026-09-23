package listasenlazadas21sep;

import java.util.LinkedList;

public class ListasEnlazadas21sep {

    public static void main(String[] args) {
        
        LinkedList<String> materias = new LinkedList<>();
        materias.add("ingles");
        materias.add("matematicas");
        materias.add("redes");
        materias.add("bases de datos");
        materias.add("programacion");
        
        materias.forEach(System.out::println);
        
        materias.addFirst("algoritmos");
        
        System.out.println("\n Se agrego algoritmos al inicio de la lista \n");
        
        materias.forEach(System.out::println);
        
        materias.addLast("inteligencia artificial");
        
        System.out.println("\n se agrego inteligencia artificial al final de la lista \n");
        
        materias.forEach(System.out::println);
        
        materias.add(2, "estructura de datos");
        
        System.out.println("\n se agrego estructura de datos en la posicion 2 \n");
        
        materias.forEach(System.out::println);
        
        System.out.println("\n la materia en la posicion 3 es:");
        System.out.println("\n" + materias.get(3));
        
        System.out.println("\n el primer elemento de la lista es:");
        System.out.println("\n" + materias.getFirst());
        
        System.out.println("\n el ultimo elemento de la lista es:");
        System.out.println("\n" + materias.getLast());
        
        if (materias.contains("ingles")){
            System.out.println("\n la lista si contiene la materia ingles");
        }
        else{
            System.out.println("\n la lista no contiena la materia ingles");
        }
        
        System.out.println("\n la materia bases de datos esta en la posicion: " + materias.indexOf("bases de datos"));
    }
}
