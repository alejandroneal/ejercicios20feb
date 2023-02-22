/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class EjercicioB {
    public static void main(String[] args) {
        
        String palabra = pedirPalabra();
        
        mostrarPalabrasYTamanio(palabra);
    }
    
    public static String pedirPalabra(){
        return JOptionPane.showInputDialog("Introduce una palabra");
    }
    
    public static void mostrarPalabrasYTamanio(String palabra){
        String texto = """
                       La palabra introducida es %s
                       Su tamaño es de %s letras
                       """.formatted(palabra, palabra.length());
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
}
