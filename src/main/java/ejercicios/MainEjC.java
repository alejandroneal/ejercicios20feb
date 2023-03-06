/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class MainEjC {
    public static void main(String[] args) {
        List<Cubierto> lista = new ArrayList<>();
        Cubierto t1 = new Tenedor(3, "acero", false);
        Cubierto t2 = new Tenedor(4, "plástico", true);
        Cubierto c1 = new Cuchillo("dentado", "acero", true);
        Cubierto c2 = new Cuchillo("liso", "plástico", false);
        Cubierto t3 = new Tenedor(4, "acero", false);
        Cubierto c3 = new Cuchillo("dentado", "metal", true);
        
        //Insertar los datos de las clases hijas en una lista de la clase padre es una conversión implícita
        lista.add(t1);
        lista.add(t2);
        lista.add(c1);
        lista.add(c2);
        lista.add(t3);
        lista.add(c3);
        
        for (Cubierto cubierto : lista) {
            System.out.println(cubierto.toString());
            cubierto.limpiar();
            if (cubierto instanceof Tenedor) { //Cconversión explícita
                ((Tenedor) cubierto).pinchar();
            }
            if (cubierto instanceof Cuchillo) { //Conversión explícita
                ((Cuchillo) cubierto).cortar();
            }
        }
        System.out.println("-------------------------------------------------------");
        Comparator<Cubierto> tipoMaterial = (cu1, cu2) -> cu1.getMaterial().compareToIgnoreCase(cu2.getMaterial());
        Collections.sort(lista, tipoMaterial);
        
        for (Cubierto cubierto : lista) {
            System.out.println(cubierto);
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Búsqueda binaria");
        int posicion = Collections.binarySearch(lista, c3,tipoMaterial);
        System.out.println("El cuchillo de plástico liso está en la posición: " + posicion);
    }
}
