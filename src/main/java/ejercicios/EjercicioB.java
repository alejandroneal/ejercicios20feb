/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class EjercicioB {
    public static void main(String[] args) {
        
        String palabra = pedirPalabra();
        
        mostrarPalabrasYTamanio(palabra);
        
        char letra = pedirChar();
        
        mostrarPosicionLetra(letra, palabra);
        
        List<Integer> posiciones = posicionesChar(letra, palabra);
        System.out.println("El char " + letra + " se encuentra en las posiciones:");
        for (Integer posicion : posiciones) {
            System.out.print (posicion + " ");
        }
        System.out.println("");
    }
    
    public static String pedirPalabra(){
        return JOptionPane.showInputDialog("Introduce una palabra");
    }
    
    public static void mostrarPalabrasYTamanio(String palabra){
        String texto = """
                       La palabra introducida es "%s"
                       Su tamaño es de %s letras
                       """.formatted(palabra, palabra.length());
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static char pedirChar(){
        return JOptionPane.showInputDialog("Introduce un caracter (solo se tomará en cuenta el primer caracter introducido)").charAt(0);
    }
    
    public static int buscarLetra(String palabra, char letra){
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                //Devuelve la primera coincidencia que encuentra
                return i + 1;
            }
        }
        return -1;
    }
    
    public static void mostrarPosicionLetra(char letra, String palabra){
        int posicion = buscarLetra(palabra, letra);
        
        String texto = """
                       El caracter "%s" en la palabra "%s" 
                       se encuentra en la posición: %s
                       """.formatted(letra, palabra, posicion);
        JOptionPane.showMessageDialog(null, texto);
    }
    
    //Devolver un array con las posiciones en las cuales se encuentren 
    //el char introducido como parámetro
    public static List<Integer> posicionesChar(char letra, String palabra){
        List<Integer> posiciones = new ArrayList<>();
        
        for (int i = 0; i < palabra.length(); i++) {
            if (letra == palabra.charAt(i)) {
                posiciones.add(i + 1);
            }
        }
        
        return  posiciones;
    }
    
    public static void valoresUnicode(String palabra){
        
    }
}
