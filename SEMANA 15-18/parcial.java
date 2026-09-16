import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Parcial_Esteban_Avila {

    public static void main(String[] args) {
        
        List<String> materiasbase = new ArrayList<>();
        materiasbase.add(" piloto ingles ");
        materiasbase.add(" calculo ");
        materiasbase.add(" fisica II ");
        materiasbase.add(" piloto estructura de datos");
        materiasbase.add(" piloto historia ");
        
        System.out.println("\n lista base de materias: " + materiasbase);
        
        String[] arregloProveedor = {" ingles II ", " piloto filosofia ", " emprendimiento "};
        
        List<String> listaProveedor = Arrays.asList(arregloProveedor);
        System.out.println("\n Lista del proveedor: " + listaProveedor);
        
        List<String> listaFinal = new ArrayList<>();
        listaFinal.addAll(materiasbase);
        listaFinal.addAll(listaProveedor);
        
        System.out.println("\n lista combinada : " + listaFinal);
        
        ListIterator<String> it = listaFinal.listIterator();
        while (it.hasNext()) {
            String lista = it.next();
            
            if (lista.startsWith(" piloto ")) {
                it.remove(); 
                System.out.println("\n  -> Eliminada (materia piloto descontinuada)");
            }        
        }        
        
        System.out.println("\n Lista final: " + listaFinal);
        
    }
} 
