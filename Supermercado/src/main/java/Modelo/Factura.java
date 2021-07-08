/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Factura {
    private String cliente;
    private ArrayList<Producto> productos;

    /**
     * 
     * @param cliente
     * @param fecha 
     */
    public Factura() {
        productos = new ArrayList<>(); 
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public ArrayList<Producto> getProductos(){
        return productos;
    }
    public String toString(){
        String informacion = "Cliente: "+cliente+"\nDescripcion\t\tPrecio";
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio();
            informacion += "\n"+productos.get(i).toString();
        }
        informacion += "\n\t\tTOTAL = "+total;
        return informacion;
    }
    
}
