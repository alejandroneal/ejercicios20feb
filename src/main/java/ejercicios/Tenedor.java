/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Alejandro
 */
public class Tenedor extends Cubierto {

    private int puntas;

    public Tenedor() {
    }

    public Tenedor(int puntas, String material, boolean limpio) {
        super(material, limpio);
        this.puntas = puntas;
    }

    @Override
    public String toString() {
        String tmp = super.toString();
        return tmp + ", puntas= " + this.puntas;
    }
    
    @Override
    public void limpiar() {
        setLimpio(true);
    }
    
    public void pinchar(){
    }
}
