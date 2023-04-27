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
    private String Marca;
    private double Precio;
    private String Tipo;

    // Constructor
    public Cereales() {
    }

    ;
    
    public Cereales(String Marca, double Precio, String Tipo) {
        this.Marca = Marca;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }

    // Getters & Setters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    

    // Aux
    @Override
    public void setCaducidad(LocalDate fc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LocalDate getCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getCalorias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
