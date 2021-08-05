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
public class VehiculoTerrestre extends Vehiculo {
    private String llantas,baul,escape;

    public VehiculoTerrestre(String llantas, String baul, String escape, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.llantas = llantas;
        this.baul = baul;
        this.escape = escape;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getBaul() {
        return baul;
    }

    public void setBaul(String baul) {
        this.baul = baul;
    }

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}

}
