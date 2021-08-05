/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Lenovo FX
 */
public class Moto extends VehiculoTerrestre {
    private String arrangeEnFrio,pata,arranquePatada;

    public Moto(String arrangeEnFrio, String pata, String arranquePatada, String llantas, String baul, String escape, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(llantas, baul, escape, placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.arrangeEnFrio = arrangeEnFrio;
        this.pata = pata;
        this.arranquePatada = arranquePatada;
    }

    public String getArrangeEnFrio() {
        return arrangeEnFrio;
    }

    public void setArrangeEnFrio(String arrangeEnFrio) {
        this.arrangeEnFrio = arrangeEnFrio;
    }

    public String getPata() {
        return pata;
    }

    public void setPata(String pata) {
        this.pata = pata;
    }

    public String getArranquePatada() {
        return arranquePatada;
    }

    public void setArranquePatada(String arranquePatada) {
        this.arranquePatada = arranquePatada;
    }
    
    
}
