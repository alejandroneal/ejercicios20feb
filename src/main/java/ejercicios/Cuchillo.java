/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author alejandro
 */
public class Cuchillo extends Cubierto{

    private String tipoFilo;

    public Cuchillo() {
    }

    public Cuchillo(String tipoFilo, String material, boolean limpio) {
        super(material, limpio);
        this.tipoFilo = tipoFilo;
    }

    @Override
    public String toString() {
        String tmp = super.toString();
        return tmp + ", tipo de filo=" + this.tipoFilo;
    }
    
    public void cortar(){
    }
    
    @Override
    public void limpiar() {
        setLimpio(true);
    }
}
