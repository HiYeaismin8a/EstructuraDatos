/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author HiYeaismin 8a
 */
public class PotenciaC {

    int resultado;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int numeroALaPontencia(int x, int y) {
        if (y == 0) {
            return resultado = 1;
        } else {
            return resultado = x * numeroALaPontencia(x, y - 1);
        }

    }

}
