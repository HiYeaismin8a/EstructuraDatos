/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class FechaHora {

    private int dia, mes, año, hora, minuto;

    public FechaHora(int dia, int mes, int año, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minuto = minuto;
    }

    public FechaHora() {
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String fechaLarga(int dia, int m, int año) {
        String unaFechaLarga = "";
        String diaDeFechaLarga, mesDeFechaLarga, añoDeFechaLarga;
        
        diaDeFechaLarga = Integer.toString(dia);
        if ((mes == 8) || mes == 9) {
            m = mes;
        }
        switch (m) {
            case 01:
                mesDeFechaLarga = "Enero";
                break;
            case 02:
                mesDeFechaLarga = "Febrero";
                break;
            case 03:
                mesDeFechaLarga = "Marzo";
                break;
            case 04:
                mesDeFechaLarga = "Abril";
                break;
            case 05:
                mesDeFechaLarga = "Mayo";
                break;
            case 06:
                mesDeFechaLarga = "Junio";
                break;
            case 07:
                mesDeFechaLarga = "Julio";
                break;
            //-------------------------------
            case 8:
                mesDeFechaLarga = "Agosto";
                break;
            case 9:
                mesDeFechaLarga = "Agosto";
                break;
            case 10:
                mesDeFechaLarga = "Octubre";
                break;
            case 11:
                mesDeFechaLarga = "Noviembre";
                break;
            case 12:
                mesDeFechaLarga = "Diciembre";
                break;
            default:
                mesDeFechaLarga = "Dia inválido";
                break;
        }
        añoDeFechaLarga = Integer.toString(año);
        String laFechaLarga = diaDeFechaLarga + " de " + mesDeFechaLarga + " de " + añoDeFechaLarga;
        return laFechaLarga;
    }

    public String fechaCorta(int d, int m, int a) {

        String fechaCorta,diaDeFechaCorta, mesDeFechaCorta, añoDeFechaCorta;
        diaDeFechaCorta = Integer.toString(d);
        mesDeFechaCorta = Integer.toString(m);
        añoDeFechaCorta = Integer.toString(a);
        
        fechaCorta = diaDeFechaCorta +"/ "+ mesDeFechaCorta +"/ "+ añoDeFechaCorta;
        JOptionPane.showMessageDialog(null, fechaCorta);
        return fechaCorta;
    }

    public String formato24(int hr, int min) {
        String horaFormato24 = "", horaF24, minutosF24;
        horaF24 = Integer.toString(hora);
        minutosF24 = Integer.toString(minuto);
        horaFormato24 = horaF24 +":"+ minutosF24;
        return horaFormato24;

    }

    public String formato12(int hr, int min) {
        // 13 (pm 2)- >1
        String horaFormato12 = "", horaF12, minutosF12;
        switch (hr) {
            //
            case 13:
                horaF12 = "1";
                break;
            case 14:
                horaF12 = "2";
                break;
            case 15:
                horaF12 = "3";
                break;
            case 16:
                horaF12 = "4";
                break;
            case 17:
                horaF12 = "5";
                break;

            case 18:
                horaF12 = "6";
                break;
            case 19:
                horaF12 = "7";
                break;

            case 20:
                horaF12 = "8";
                break;
            case 21:
                horaF12 = "9";
                break;
            case 22:
                horaF12 = "10";
                break;
            case 23:
                horaF12 = "11";
                break;
            case 24:
                horaF12 = "12";
                break;
        }
        horaF12 = Integer.toString(hora);
        minutosF12 = Integer.toString(minuto);
        horaFormato12 = horaF12 +" : "+minutosF12;
        return horaFormato12;
    }
}
