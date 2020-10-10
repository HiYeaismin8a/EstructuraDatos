/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class XMLBase {

    private Datos contenidoDelArchivo[], elNombreDelArchivo;
    private Datos dato;

    public XMLBase() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    //</editor-fold>
    public boolean insertar(Datos datos, int indice) {
        //insertar datos en el vector.
        if (indice > 0 && indice <= 100) {
            contenidoDelArchivo[indice] = datos;
            JOptionPane.showMessageDialog(null,contenidoDelArchivo );
            Arrays.toString(contenidoDelArchivo); 
            JOptionPane.showMessageDialog(null,contenidoDelArchivo );
            
            
            return true;
        } else {
            return false;
        }
    }

    public Datos buscar(int indice) {
        if (indice > 0 && indice <= 100) {
            return contenidoDelArchivo[indice];
        } else {
            return null;
        }
    }

    public boolean eliminar(int indice) {

        if (indice > 0 && indice <= 100) {
            dato = new Datos();
            dato = contenidoDelArchivo[indice];
            contenidoDelArchivo[indice] = new Datos();
            return true;
        } else {
            return false;
        }
    }

}
