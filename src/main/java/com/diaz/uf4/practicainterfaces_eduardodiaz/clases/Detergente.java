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
public class Detergente implements ConDescuento, EsLiquido {

    // Atributos
    private String marca;
    private double precio;
    private String tipoEnvase;
    private double volumen;
    private double descuento;

    // Constructor
    public Detergente() {
    }

    ;
    
    public Detergente(String Marca, double Precio) {
        this.marca = Marca;
        this.precio = Precio;
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

    // Aux
    @Override
    public void setDescuento(double des) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        double factorDescuento = (100 - this.descuento) / 100;
        return this.precio * factorDescuento;
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public String toString() {
        return "Detergente{" + "marca=" + marca + ", precio=" + precio + ", tipoEnvase=" + tipoEnvase + ", volumen=" + volumen + ", descuento=" + descuento + '}';
    }

  

}
