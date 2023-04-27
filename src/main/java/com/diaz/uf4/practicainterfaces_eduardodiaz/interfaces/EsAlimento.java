/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces;

import java.time.LocalDate;

/**
 *
 * @author eduardodiamar
 */
public interface EsAlimento {

    public void setCaducidad(LocalDate fc);

    public LocalDate getCaducidad();

    public int getCalorias();
}
