/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Oferta {
    private ArrayList<Producto> productos;
    private double descuento;
    
    /**
     * Constructor con los siguientes parametros
     * @param descuento 
     */
    public Oferta(double descuento){
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    /**
     * Retorna true si el producto es ingreso caso contrario false
     * @param producto
     * @return 
     */
    public boolean agregarProducto(Producto producto){
        if(productos.indexOf(producto) == -1){
            productos.add(producto);
            return true;
        }
        return false;
    }
    
    /**
     * Retorna el descuento del producto si esta en oferta
     * @param codigo
     * @return 
     */
    public double descuentoProducto(String codigo){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo().equals(codigo)) {
                return productos.get(i).getPrecio() * descuento / 100;
            }
        }
        return 0;
    }
    
}
