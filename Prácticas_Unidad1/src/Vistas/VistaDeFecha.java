/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.FechaHora;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class VistaDeFecha extends javax.swing.JFrame {

    /**
     * Creates new form VistaDeFecha
     */
    public VistaDeFecha() {
        initComponents();
        inicializacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        btnFecha = new javax.swing.JButton();
        cmbFormato = new javax.swing.JComboBox<>();
        cmbTipoDeFechas = new javax.swing.JComboBox<>();
        lblDeFechas = new javax.swing.JLabel();
        cmbApm = new javax.swing.JComboBox<>();
        lblHora = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        lblHoras = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fecha y Hora.");

        txtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaFocusLost(evt);
            }
        });

        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMesFocusLost(evt);
            }
        });

        txtAño.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAñoFocusLost(evt);
            }
        });
        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAñoKeyPressed(evt);
            }
        });

        lblDia.setText("Dia");

        lblMes.setText("Mes");

        lblAño.setText("Año");

        btnFecha.setText("Click");
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });

        cmbFormato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge un formato:", "12 Horas", "24 Horas" }));
        cmbFormato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFormatoItemStateChanged(evt);
            }
        });
        cmbFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormatoActionPerformed(evt);
            }
        });

        cmbTipoDeFechas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger un tipo de Fecha:", "Fecha Larga", "Fecha Corta" }));
        cmbTipoDeFechas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoDeFechasItemStateChanged(evt);
            }
        });
        cmbTipoDeFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDeFechasActionPerformed(evt);
            }
        });

        cmbApm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Formato Hr", "AM", "PM" }));
        cmbApm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbApmItemStateChanged(evt);
            }
        });
        cmbApm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbApmFocusLost(evt);
            }
        });

        txtHoras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHorasFocusLost(evt);
            }
        });

        txtMinutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMinutosKeyPressed(evt);
            }
        });

        lblHoras.setText("Hora:");

        lblMinutos.setText("Min:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbApm, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAño)
                                .addComponent(lblMes)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDia))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbTipoDeFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHoras))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblMinutos)
                                            .addGap(40, 40, 40))
                                        .addComponent(txtMinutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinutos)
                            .addComponent(lblHoras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cmbApm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDia)
                                .addGap(18, 18, 18)
                                .addComponent(lblMes)
                                .addGap(26, 26, 26)
                                .addComponent(lblAño)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDeFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbTipoDeFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void formatoFecha() {
        FechaHora fechaFormato = new FechaHora();
        fechaFormato.setDia(Integer.parseInt(txtDia.getText()));
        fechaFormato.setMes(Integer.parseInt(txtMes.getText()));
        fechaFormato.setAño(Integer.parseInt(txtAño.getText()));
        fechaFormato.setHora(Integer.parseInt(txtHoras.getText()));
        fechaFormato.setMinuto(Integer.parseInt(txtMinutos.getText()));

        if ((cmbTipoDeFechas.getSelectedIndex() == 1) && (cmbFormato.getSelectedIndex() == 2)) {
            //Hora
            JOptionPane.showConfirmDialog(this, "L \n  24H");
            lblDeFechas.setText(fechaFormato.fechaLarga(fechaFormato.getDia(),
                    fechaFormato.getMes(), fechaFormato.getAño()));
            lblHora.setText(fechaFormato.formato24(fechaFormato.getHora(), fechaFormato.getMinuto()));
        }

        if ((cmbTipoDeFechas.getSelectedIndex() == 2) && (cmbFormato.getSelectedIndex() == 1)) {
            JOptionPane.showConfirmDialog(this, "C \n  12H");
            lblDeFechas.setText(fechaFormato.fechaCorta(fechaFormato.getDia(),
                    fechaFormato.getMes(), fechaFormato.getAño()));
            lblHora.setText(fechaFormato.formato12(fechaFormato.getHora(), fechaFormato.getMinuto()));
        }

        if ((cmbTipoDeFechas.getSelectedIndex() == 1) && (cmbFormato.getSelectedIndex() == 1)) {
            //Hora
            JOptionPane.showConfirmDialog(this, "L \n  12H");
            lblDeFechas.setText(fechaFormato.fechaLarga(fechaFormato.getDia(),
                    fechaFormato.getMes(), fechaFormato.getAño()));
            lblHora.setText(fechaFormato.formato12(fechaFormato.getHora(), fechaFormato.getMinuto()));
        }
        if ((cmbTipoDeFechas.getSelectedIndex() == 2) && (cmbFormato.getSelectedIndex() == 2)) {
            //Hora
            JOptionPane.showConfirmDialog(this, "C \n  24H");
            lblDeFechas.setText(fechaFormato.fechaCorta(fechaFormato.getDia(),
                    fechaFormato.getMes(), fechaFormato.getAño()));
            lblHora.setText(fechaFormato.formato24(fechaFormato.getHora(), fechaFormato.getMinuto()));
        }

    }
    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        // TODO add your handling code here:

        FechaHora fechaLargaFormato = new FechaHora();
        if ((txtMes.getText() == "08")) {
            fechaLargaFormato.setMes(8);
        }
        if ((txtMes.getText() == "09")) {
            fechaLargaFormato.setMes(9);
        }

        formatoFecha();


    }//GEN-LAST:event_btnFechaActionPerformed

    void inicializacion() {
        this.setLocationRelativeTo(null);
        lblHoras.setVisible(false);
        txtHoras.setVisible(false);
        lblMinutos.setVisible(false);
        txtMinutos.setVisible(false);
        cmbTipoDeFechas.setVisible(false);
        cmbFormato.setVisible(false);
        btnFecha.setVisible(false);
        txtDia.setVisible(false);
        txtMes.setVisible(false);
        txtAño.setVisible(false);
        lblDia.setVisible(false);
        lblMes.setVisible(false);
        lblAño.setVisible(false);
    }

    private boolean validacionesCorrectas() {
        if (txtDia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No deje en blanco el campo de texto dia");
            txtDia.setText("");
            txtDia.requestFocus();

            return false;
        }
        if (txtMes.getText() == "") {
            JOptionPane.showMessageDialog(this, "No deje en blanco el campo de texto Mes");
            txtMes.setText("");
            txtMes.requestFocus();
            return false;
        }
        if (txtAño.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No deje en blanco el campo de texto Año");
            txtAño.setText("");
            txtAño.requestFocus();
            return false;
        }

        try {//numeros
            if (Integer.parseInt(txtMes.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Los Mes no son Negativos.");
                txtMes.setText("");
                txtMes.requestFocus();
                return false;
            }
            if (Integer.parseInt(txtAño.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Los Año no son Negativos.");
                txtAño.setText("");
                txtAño.requestFocus();
                return false;
            }
            if (Integer.parseInt(txtDia.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Los dias no son Negativos.");
                txtDia.setText("");
                txtDia.requestFocus();
                return false;
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Solo se premiten número.");
            return false;
        }
        return true;
    }

    void condicionDecombos(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            switch (this.cmbTipoDeFechas.getSelectedIndex()) {
                case 0:
                    cmbFormato.setVisible(false);
                    break;
                case 1:
                    btnFecha.setText("Fecha Larga");
                    cmbFormato.setVisible(true);
                    break;
                case 2:
                    btnFecha.setText("Fecha Corta");
                    cmbFormato.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Item de tipo de fechas no válido");
            }
        }
    }
    private void cmbTipoDeFechasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoDeFechasItemStateChanged
        // TODO add your handling code here:
        condicionDecombos(evt);
    }//GEN-LAST:event_cmbTipoDeFechasItemStateChanged


    private void cmbFormatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFormatoItemStateChanged
        // TODO add your handling code here:
        condicionDecombos(evt);
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            switch (this.cmbFormato.getSelectedIndex()) {
                case 0:
                    yaTuvoElFoco(evt);
                    break;
                case 1:
                    txtDia.setVisible(true);
                    lblDia.setVisible(true);
                    txtMes.setVisible(true);
                    lblMes.setVisible(true);
                    txtAño.setVisible(true);
                    lblAño.setVisible(true);
                    cmbFormato.setFocusable(true);
                    break;
                case 2:
                    txtDia.setVisible(true);
                    lblDia.setVisible(true);
                    txtMes.setVisible(true);
                    lblMes.setVisible(true);
                    txtAño.setVisible(true);
                    lblAño.setVisible(true);
                    cmbFormato.setFocusable(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Item de tipo de fechas no válido");
            }
        }
    }//GEN-LAST:event_cmbFormatoItemStateChanged

    private void txtAñoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyPressed
        // TODO add your handling code here:
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if ((txtAño.getText().length() > 4)) {
                    JOptionPane.showMessageDialog(this, "No más de 4 caracteres.");
                    txtAño.setText("");
                    txtAño.requestFocus();
                }
                if (txtAño.getText().length() == 3 || (txtAño.getText().length() == 3)) {
                    JOptionPane.showMessageDialog(this, "El año es formato: 2020");
                    txtAño.setText("");
                    txtAño.requestFocus();
                }
                if (validacionesCorrectas()) {
                    btnFecha.setVisible(true);
                }
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Solo números");
            txtAño.setText("");
            txtAño.requestFocus();
        }
    }//GEN-LAST:event_txtAñoKeyPressed
    public void yaTuvoElFoco(ItemEvent e) {
        if (e.getSource() == this.cmbFormato) {
            if (cmbFormato.hasFocus()) {
                txtDia.setVisible(false);
                lblDia.setVisible(false);
                txtMes.setVisible(false);
                lblMes.setVisible(false);
                txtAño.setVisible(false);
                lblAño.setVisible(false);
            }
        }
    }
    private void cmbFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormatoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbFormatoActionPerformed
    private void diaFocus() {
        try {
            if (Integer.parseInt(txtDia.getText()) > 31) {
                JOptionPane.showMessageDialog(this, "No hay más días de 31");
                txtDia.setText("");
                txtDia.requestFocus();
            }
            if (Integer.parseInt(txtDia.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Los DIAS no son Negativos. P1");
                txtDia.setText("");
                txtDia.requestFocus();
            }
            if (txtDia.getText().length() > 2) {
                JOptionPane.showMessageDialog(this, "No más de 2 caracteres.");
                txtDia.setText("");
                txtDia.requestFocus();
            }
            if (txtDia.getText().length() < 2) {
                JOptionPane.showMessageDialog(this, "Formato DIA: 04 \no bien: 12");
                txtDia.setText("");
                txtDia.requestFocus();
            }
            if (txtDia.getText() == "00") {
                JOptionPane.showMessageDialog(this, "No se haga el gracioso ingrese bien el DIA.");
                txtDia.setText("");
                txtDia.requestFocus();
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Solo números.");
            txtDia.setText("");
            txtDia.requestFocus();
        }
    }
    private void txtDiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusLost
        // TODO add your handling code here:
        diaFocus();
    }//GEN-LAST:event_txtDiaFocusLost

    private void txtMesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusLost
        // TODO add your handling code here:
        try {
            if (txtMes.getText().length() > 2) {
                JOptionPane.showMessageDialog(this, "No más de 2 caracteres.");
                txtMes.setText("");
                txtMes.requestFocus();
            }
            if (txtMes.getText().length() < 2) {
                JOptionPane.showMessageDialog(this, "Formato Mes: 04 \no bien: 12");
                txtMes.setText("");
                txtMes.requestFocus();
            }
            if (Integer.parseInt(txtMes.getText()) > 12) {
                JOptionPane.showMessageDialog(this, "No hay más de 12 Meses en el año.");
                txtMes.setText("");
                txtMes.requestFocus();
            }
            if (txtMes.getText() == "00") {
                JOptionPane.showMessageDialog(this, "No se haga el gracioso ingrese bien el mes.");
                txtMes.setText("");
                txtMes.requestFocus();
            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Solo números en Mes");
            txtMes.setText("");
            txtMes.requestFocus();
        }
    }//GEN-LAST:event_txtMesFocusLost

    private void txtAñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAñoFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtAñoFocusLost

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

    private void cmbTipoDeFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDeFechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDeFechasActionPerformed
    private boolean validarHora() {
        try {
            if ((txtMinutos.getText().length() == 0)) {
                JOptionPane.showMessageDialog(this, "No dejes en blanco el campo de minutos.");
                txtMinutos.setText("");
                txtMinutos.requestFocus();

            }
            if (Integer.parseInt(txtMinutos.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "No existen minutos negativos.");
                txtMinutos.setText("");
                txtMinutos.requestFocus();
                return false;
            }
            if (Integer.parseInt(txtMinutos.getText()) > 60) {
                JOptionPane.showMessageDialog(this, "Solo hay 60 minutos en una hora.");
                txtMinutos.setText("");
                txtMinutos.requestFocus();
                return false;
            }
            if (txtMinutos.getText().length() > 2) {
                JOptionPane.showMessageDialog(this, "Los minutos solo tienen 2 digitos");
                txtMinutos.setText("");
                txtMinutos.requestFocus();
                return false;
            }

        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, "Solo digite números.");
            return false;
        }
        return true;
    }
    private void txtMinutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinutosKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validarHora();
            cmbTipoDeFechas.setVisible(true);

        }


    }//GEN-LAST:event_txtMinutosKeyPressed

    private void cmbApmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbApmFocusLost
        // TODO add your handling code here:
        if (cmbApm.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un formato de Hora.");
        }
    }//GEN-LAST:event_cmbApmFocusLost

    private void txtHorasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHorasFocusLost
        // TODO add your handling code here:
        try {
            if ((txtHoras.getText().length() == 0)) {
                JOptionPane.showMessageDialog(this, "No dejes en blanco el campo de las HORAS.");
                txtHoras.setText("");
                txtHoras.requestFocus();
            }
            if (Integer.parseInt(txtHoras.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "No existen Horas negativas.");
                txtHoras.setText("");
                txtHoras.requestFocus();
            }
            if (Integer.parseInt(txtHoras.getText()) > 24) {
                JOptionPane.showMessageDialog(this, "Solo hay 24 Horas en el día.");
                txtHoras.setText("");
                txtHoras.requestFocus();
            }
            if (txtHoras.getText().length() > 2) {
                JOptionPane.showMessageDialog(this, "Las Horas solo tienen 2 digitos");
                txtHoras.setText("");
                txtHoras.requestFocus();
            }

            if ((Integer.parseInt(txtHoras.getText()) > 12) && cmbApm.getSelectedIndex() == 1) {
                JOptionPane.showMessageDialog(this, "Las mañanas son de 1 a 12.");
                txtHoras.setText("");
                txtHoras.requestFocus();

            }
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(this, error);
            txtHoras.setText("");
            txtHoras.requestFocus();
            
        }
    }//GEN-LAST:event_txtHorasFocusLost
    void condicionDecombosHr(ItemEvent evt) {
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            switch (this.cmbApm.getSelectedIndex()) {
                case 0:
                    txtHoras.setVisible(false);
                    lblHoras.setVisible(false);
                    txtMinutos.setVisible(false);
                    lblMinutos.setVisible(false);
                    break;
                case 1:
                    txtHoras.setVisible(true);
                    lblHoras.setVisible(true);
                    txtMinutos.setVisible(true);
                    lblMinutos.setVisible(true);

                    break;
                case 2:
                    txtHoras.setVisible(true);
                    lblHoras.setVisible(true);
                    txtMinutos.setVisible(true);
                    lblMinutos.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Item de tipo de fechas no válido");
            }
        }
    }
    private void cmbApmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbApmItemStateChanged
        // TODO add your handling code here:
        condicionDecombosHr(evt);


    }//GEN-LAST:event_cmbApmItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDeFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDeFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDeFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDeFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDeFecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFecha;
    private javax.swing.JComboBox<String> cmbApm;
    private javax.swing.JComboBox<String> cmbFormato;
    private javax.swing.JComboBox<String> cmbTipoDeFechas;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblDeFechas;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinutos;
    // End of variables declaration//GEN-END:variables
}
