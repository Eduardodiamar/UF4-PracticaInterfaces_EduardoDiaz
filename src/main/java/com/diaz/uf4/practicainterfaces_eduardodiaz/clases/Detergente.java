/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.uf4.practicainterfaces_eduardodiaz.clases;

import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.ConDescuento;
import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.EsLiquido;

/**
 *
 * @author eduardodiamar
 */
public class Detergente implements ConDescuento, EsLiquido{

    // Atributos
    private String Marca;
    private double Precio;
    
    // Constructor
    public Detergente(){
    };
    
    public Detergente(String Marca, double Precio) {
        this.Marca = Marca;
        this.Precio = Precio;
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
    
    
    // Aux
    @Override
    public void setDescuento(double des) {
    }

    @Override
    public double getDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getPrecioDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setVolumen(double v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTipoEnvase(String env) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTipoEnvase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Detergente{" + "Marca=" + Marca + ", Precio=" + Precio + '}';
    }
    
    
}
