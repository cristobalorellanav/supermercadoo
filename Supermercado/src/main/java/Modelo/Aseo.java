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
public class Aseo extends Producto{
    private String fragancia;

    /**
     * Clase Aseo hija de Producto
     * @param codigo
     * @param descripcion
     * @param precio 
     */
    public Aseo(String codigo, String descripcion, double precio, String fragancia) {
        super(codigo, descripcion, precio);
        this.fragancia = fragancia;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }
    
}
