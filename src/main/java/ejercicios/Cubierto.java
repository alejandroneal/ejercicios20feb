/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author Alejandro
 */
public abstract class Cubierto {
    
    private String material;
    private boolean limpio;

    public Cubierto() {
    }

    public Cubierto(String material, boolean limpio) {
        this.material = material;
        this.limpio = limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }
    
    public abstract void limpiar();
}
