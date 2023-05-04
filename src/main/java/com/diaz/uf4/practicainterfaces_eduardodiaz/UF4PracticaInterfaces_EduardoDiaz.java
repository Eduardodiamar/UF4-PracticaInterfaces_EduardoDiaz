/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.diaz.uf4.practicainterfaces_eduardodiaz;

import com.diaz.uf4.practicainterfaces_eduardodiaz.clases.Cereales;
import com.diaz.uf4.practicainterfaces_eduardodiaz.clases.Detergente;
import com.diaz.uf4.practicainterfaces_eduardodiaz.clases.Vino;
import com.diaz.uf4.practicainterfaces_eduardodiaz.interfaces.EsAlimento;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author eduardodiamar
 */
public class UF4PracticaInterfaces_EduardoDiaz {

    public static void main(String[] args) {
        
        Detergente det = new Detergente("Ariel", 2.99);
        det.setVolumen(1.5);
        det.setTipoEnvase("Botella");
     

        
        Cereales cer = new Cereales("Kellogg's", 3.49, "trigo");
        cer.setCaducidad(LocalDate.of(2023, 9, 30));
        
        Cereales cer2 = new Cereales("Nestle", 3, "espelta");
        cer2.setCaducidad(LocalDate.of(2023, 8, 31));

        Vino vin = new Vino("Rioja", 8.99, "Tinto", 12.5);
        vin.setDescuento(0.15);
        
        
        ArrayList<EsAlimento> productos = new ArrayList<EsAlimento>();
        productos.add(cer);
        productos.add(cer2);
        productos.add(vin);

        int totalCalorias = 0;
        for (EsAlimento prod : productos) {
            totalCalorias += prod.getCalorias();
            System.out.println(prod.toString() +"\n");
        }
        System.out.println(det.toString());

        System.out.println("Total calorías: " + totalCalorias);
    }

}
