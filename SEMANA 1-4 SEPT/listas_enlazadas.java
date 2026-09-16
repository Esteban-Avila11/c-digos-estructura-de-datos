package sesion.interfaz.list;

import java.util.ArrayList;
import java.util.List;

public class SesionInterfazList {

    public static void imprimirList(List<String> List) {
                
        for(int i = 0 ; i < List.size(); i++)
        {
            System.out.print(" imprimiendo elemento ");
            System.out.print(i);
            System.out.print(" ");
            System.out.print(List.get(i));
            System.out.print("\n");
        }  
    }
    
    public static void main(String[] args) {
        
        List<String> List = new ArrayList<>();
        List.add(" cadena1 ");
        List.add(" cadena2 ");
        List.add(" cadena3 ");
        List.add(" cadena4 ");
        List.add(" cadena5 ");
        
        imprimirList(List);
        
        List.addFirst(" string de prueba ");
        
        imprimirList(List);
        
        List.set(3, " cambiando strings ");
        
        imprimirList(List);
        
        List.remove(5);
        
        imprimirList(List);
        
        List.removeFirst();
        
        imprimirList(List);
    }    
    
    
    
}
