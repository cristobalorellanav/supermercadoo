/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 * 
 */
public class Congelados extends Producto{
    private double gradoRefrigeracion;

    /**
     * Clase Congelados que hereda de Producto
     * @param codigo
     * @param descripcion
     * @param precio
     * @param gradoRefrigeracion 
     */
    public Congelados(String codigo, String descripcion, double precio, double gradoRefrigeracion) {
        super(codigo, descripcion, precio);
        this.gradoRefrigeracion = gradoRefrigeracion;
    }

    public double getGradoRefrigeracion() {
        return gradoRefrigeracion;
    }

    public void setGradoRefrigeracion(double gradoRefrigeracion) {
        this.gradoRefrigeracion = gradoRefrigeracion;
    }
    
}
