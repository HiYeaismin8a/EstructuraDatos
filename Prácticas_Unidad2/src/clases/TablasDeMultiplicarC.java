/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class TablasDeMultiplicarC {

    int resultado, recuperarVuelta;

    public int getResultado() {
        return resultado;
    }

    public int getRecuperarVuelta() {
        return recuperarVuelta;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public static String sumaRecursiva(int hasta, int laTabla) {
        String cadena = "";
        if (hasta == 1) {
            cadena = (laTabla + " x " + (1) + " = " + laTabla);
            return cadena;
        } else {
            return sumaRecursiva(hasta-1,laTabla)+"\n"+laTabla+"x" +hasta+ " = " + (hasta * laTabla);
        }

    }
}
