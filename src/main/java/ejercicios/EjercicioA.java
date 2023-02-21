/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import javax.swing.JOptionPane;

/**
 * Leer un nº con JOption
 * Controlar entradas por teclado
 * Convertir nº leido en array de char
 * Método recursivo indica si array contiene nº capicúa
 */
public class EjercicioA {
    public static void main(String[] args) {
        
        //Pedimos un nº por teclado
        int numero = pedirNumero();
        
        //Introducimos el nº en un array de char
        char[] array = meterNumeroEnArray(numero);
        
        //Comprovamos si el nº es introducido en el array es capicúo
        boolean capicuo = comprobarCapicuo(array, 0, array.length - 1);
        JOptionPane.showMessageDialog(null, "¿El número " + numero + " es capicúo?: " + capicuo);
    }
    
    public static int pedirNumero(){
        int numero;
        
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
                return numero;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "No se admiten caracteres no numéricos");
            }
        } while(true);
    }
    
    public static char [] meterNumeroEnArray(int numero){
        String numeroString = String.valueOf(numero);
        char[] array = new char[numeroString.length()];
        
        for (int i = 0; i < numeroString.length(); i++) {
            array[i] = numeroString.charAt(i);
        }
        
        return array;
    }
    
    public static boolean comprobarCapicuo(char [] array, int posicionInicio, int posicionFinal){
        if (posicionInicio != 0 || posicionFinal != array.length - 1 || array[posicionInicio] != array[posicionFinal]) {
            return false;
        }
        
        if (posicionInicio <= posicionFinal) {
            if (array[posicionFinal] == array[posicionInicio]) {
                return true;
            } else {
                return comprobarCapicuo(array, posicionInicio++, posicionFinal--);
            }
        } 
        return false;
    }
}
