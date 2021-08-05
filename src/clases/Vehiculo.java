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
abstract class Vehiculo {
    private String placa,serie,motor,marca,modelo,asientos,timon,color,tamaño;  

    public Vehiculo(String placa, String serie, String motor, String marca, String modelo, String asientos, String timon, String color, String tamaño) {
        this.placa = placa;
        this.serie = serie;
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
        this.asientos = asientos;
        this.timon = timon;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getTimon() {
        return timon;
    }

    public void setTimon(String timon) {
        this.timon = timon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    protected void agregar(){}
    protected void eliminar(){}
    
}
