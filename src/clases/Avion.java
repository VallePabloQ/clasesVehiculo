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
public class Avion extends VehiculoAereo {
    private String turbinas,alerones;

    public Avion(String turbinas, String alerones, String aerodinamica, String alas, String oxigeno, String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        super(aerodinamica, alas, oxigeno, placa, serie, motor, marca, modelo, asientos, timon, color, tamaño);
        this.turbinas = turbinas;
        this.alerones = alerones;
    }

    public String getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(String turbinas) {
        this.turbinas = turbinas;
    }

    public String getAlerones() {
        return alerones;
    }

    public void setAlerones(String alerones) {
        this.alerones = alerones;
    }
    
    @Override
    public void agregar(){}
    @Override
    public void eliminar(){}
}
