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
public class Automovil extends VehiculoTerrestre {
    private String puertas,cambios,pedales,ventanas,retrovisores;

    public Automovil(String puertas, String cambios, String pedales, String ventanas, String retrovisores, String llantas, String baul, String escape, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(llantas, baul, escape, placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.puertas = puertas;
        this.cambios = cambios;
        this.pedales = pedales;
        this.ventanas = ventanas;
        this.retrovisores = retrovisores;
    }

    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getPedales() {
        return pedales;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(String retrovisores) {
        this.retrovisores = retrovisores;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
