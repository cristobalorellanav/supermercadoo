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
public abstract class Producto {
    private String codigo; 
    private String descripcion;
    private double precio;

    /**
     * Contructor del Producto
     * @param codigo
     * @param descripcion
     * @param precio 
     */
    public Producto(String codigo, String descripcion, double precio) {
        this.setCodigo(codigo);
        this.descripcion = descripcion;
        this.precio = precio;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return descripcion+"\t\t"+precio;
    }
    
    
}
