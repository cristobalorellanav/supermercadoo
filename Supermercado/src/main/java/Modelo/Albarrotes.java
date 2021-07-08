/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author User
 */
public class Albarrotes extends Producto{
    private String fechaCaducidad;

    /**
     * Clase Albarrote que hereda de Producto
     * @param codigo
     * @param descripcion
     * @param precio 
     */
    public Albarrotes(String codigo, String descripcion, double precio, String fechaCaducidad) {
        super(codigo, descripcion, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
