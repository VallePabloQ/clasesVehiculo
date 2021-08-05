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
public class VehiculoAereo extends Vehiculo {
    private String aerodinamica,alas,oxigeno;

    public VehiculoAereo(String aerodinamica, String alas, String oxigeno, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.aerodinamica = aerodinamica;
        this.alas = alas;
        this.oxigeno = oxigeno;
    }

    public String getAerodinamica() {
        return aerodinamica;
    }

    public void setAerodinamica(String aerodinamica) {
        this.aerodinamica = aerodinamica;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public String getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(String oxigeno) {
        this.oxigeno = oxigeno;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
    
}
