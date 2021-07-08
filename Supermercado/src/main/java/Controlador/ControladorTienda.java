/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ControladorTienda {
    static ArrayList<Producto> inventario = new ArrayList<>();
    public static boolean agregarProducto(Producto p){
        if (p.getCodigo().length() != 4) {
            JOptionPane.showMessageDialog(null, "El codigo debe tener 4 digitos");
            return false;
        }
        else if(p.getPrecio() <= 0){
            JOptionPane.showMessageDialog(null, "El precio debe ser mayor a 0");
            return false;
        }
        inventario.add(p);
        JOptionPane.showMessageDialog(null, "Ingresado con exito");
        System.out.println(inventario.get(inventario.size()-1).toString());
        return true;
    }
    
    public static void mostrarProductos(JComboBox<String> combo){
        for (int i = 0; i < inventario.size(); i++) {
            combo.addItem(inventario.get(i).getDescripcion());            
        }
    }
    
    public static Producto encontrar(String descrp){
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getDescripcion().equals(descrp)) {
                return inventario.get(i);
            }
            
        }
        return null;
    }
}