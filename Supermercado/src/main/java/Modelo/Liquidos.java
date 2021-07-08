/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Liquidos extends Producto{
    private double mililitros;

    /**
     * Clase Liquido hija de Producto
     * @param codigo
     * @param descripcion
     * @param precio
     * @param mililitros 
     */
    public Liquidos(String codigo, String descripcion, double precio, double mililitros) {
        super(codigo, descripcion, precio);
        this.mililitros = mililitros;
    }

    public double getMililitros() {
        return mililitros;
    }

    public void setMililitros(double mililitros) {
        this.mililitros = mililitros;
    }
}
