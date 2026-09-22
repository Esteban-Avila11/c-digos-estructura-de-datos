package listasenlazadas21sep;

import java.util.LinkedList;

public class ListasEnlazadas21sep {

    public static void main(String[] args) {
        
        LinkedList<String> materias = new LinkedList<>();
        materias.add("matematicas");
        materias.add("ingles");
        materias.add("redes");
        materias.add("bases de datos");
        materias.add("programacion");
        
        materias.forEach(System.out::println);
        
        materias.addFirst("algoritmos");
        materias.addLast("inteligencia artificial");
        
        System.out.println("\n Se agrego algoritmos al inicio de la lista e inteligencia artificial al final");
        
        materias.forEach(System.out::println);
    }
}

