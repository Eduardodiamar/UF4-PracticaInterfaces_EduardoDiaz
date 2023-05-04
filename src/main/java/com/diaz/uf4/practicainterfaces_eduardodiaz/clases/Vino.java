/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diaz.uf4.practicainterfaces_eduardodiaz.clases;

import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.ConDescuento;
import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.EsAlimento;
import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.EsLiquido;
import java.time.LocalDate;

/**
 *
 * @author eduardodiamar
 */
public class Vino implements ConDescuento, EsLiquido, EsAlimento {

    // Atributos
    private String marca;
    private double precio;
    private String tipoVino;
    private double grados;
    private String tipoEnvase;
    private double volumen;
    private double descuento;
    private LocalDate caducidad;

    // Constructor
    public Vino() {
    }

    ;

    public Vino(String Marca, double Precio, String Tipo, double Grados) {
        this.marca = Marca;
        this.precio = Precio;
        this.tipoVino = Tipo;
        this.grados = Grados;
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
        return tipoVino;
    }

    public void setTipo(String Tipo) {
        this.tipoVino = Tipo;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double Grados) {
        this.grados = Grados;
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

    public int getCalorias() {
        return (int) (getGrados() * 10);
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public String toString() {
        return "Vino{" + "marca=" + marca + ", precio=" + precio + ", tipoVino=" + tipoVino + ", grados=" + grados + ", tipoEnvase=" + tipoEnvase + ", volumen=" + volumen + ", descuento=" + descuento + ", caducidad=" + caducidad + ", calorias"
                + "="+getCalorias()+ '}';
    }
    
    
}
