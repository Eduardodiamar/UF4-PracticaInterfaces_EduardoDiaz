/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.uf4.practicainterfaces_eduardodiaz.clases;

import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.EsAlimento;
import java.time.LocalDate;

/**
 *
 * @author eduardodiamar
 */
public class Cereales implements EsAlimento {

    // Atributos
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;

    // Constructor
    public Cereales() {
    }

    ;
    
    public Cereales(String Marca, double Precio, String Tipo) {
        this.marca = Marca;
        this.precio = Precio;
        this.tipoCereal = Tipo;
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double Precio) {
        this.precio = Precio;
    }

    public String getTipo() {
        return tipoCereal;
    }

    public void setTipo(String Tipo) {
        this.tipoCereal = Tipo;
    }

    // Aux
    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        switch (getTipo().toLowerCase()) {
            case "espelta":
                return 5;
            case "maíz":
                return 12;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", precio=" + precio + ", tipoCereal=" + tipoCereal + ", caducidad=" + caducidad +" calorías="+getCalorias()+  '}';
    }

}
