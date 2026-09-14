import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventarioFruteria {

    public static void main(String[] args) {
        
        List<String> inventarioBase = new ArrayList<>();
        inventarioBase.add("Manzana");
        inventarioBase.add("Banano");
        inventarioBase.add("Naranja");
        inventarioBase.add("Fresa");

        inventarioBase.add("mora");
        System.out.println("Inventario base: " + inventarioBase);

        String[] arregloProveedor = {"Mango", "Uva", "Papaya"};

        List<String> listaProveedor = Arrays.asList(arregloProveedor);
        System.out.println("Lista del proveedor: " + listaProveedor);

   
        List<String> inventarioFinal = new ArrayList<>();
        inventarioFinal.addAll(inventarioBase);
        inventarioFinal.addAll(listaProveedor);

        System.out.println("Inventario consolidado: " + inventarioFinal);
    }
}