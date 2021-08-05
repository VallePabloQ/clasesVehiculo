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
public class Helicoptero extends VehiculoAereo {
    private String helices,cabina;

    public Helicoptero(String helices, String cabina, String aerodinamica, String alas, String oxigeno, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(aerodinamica, alas, oxigeno, placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.helices = helices;
        this.cabina = cabina;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
