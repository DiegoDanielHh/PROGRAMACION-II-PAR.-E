/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareamenu;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante extends javax.swing.JFrame {

    public Estudiante() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnprestar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnmostrarprestamos = new javax.swing.JButton();
        btneliminarprestamos = new javax.swing.JButton();
        btnmodificarprestamo = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ESTUDIANTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Nombre: ");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Matricula: ");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Libro solicitado: ");

        btnprestar.setText("Registrar prestamo");
        btnprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprestarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnmostrarprestamos.setText("Mostrar Prestamos");
        btnmostrarprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarprestamosActionPerformed(evt);
            }
        });

        btneliminarprestamos.setText("Eliminar prestamos");
        btneliminarprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarprestamosActionPerformed(evt);
            }
        });

        btnmodificarprestamo.setText("Modificar");
        btnmodificarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarprestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnprestar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmostrarprestamos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminarprestamos)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificarprestamo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btncancelar)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprestar)
                    .addComponent(btnmostrarprestamos)
                    .addComponent(btneliminarprestamos)
                    .addComponent(btnmodificarprestamo))
                .addGap(18, 18, 18)
                .addComponent(btncancelar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprestarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        String matricula = jTextField2.getText();
        String libro = jTextField3.getText();

        if(nombre.isEmpty() || matricula.isEmpty() || libro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        } else {
            EstudianteInfo prestamo = new EstudianteInfo(nombre, matricula, libro);
            boolean guardado = JsonUtil.guardarPrestamo(prestamo);
            if (guardado) {
                JOptionPane.showMessageDialog(this, "Préstamo guardado.");
            } else {
                JOptionPane.showMessageDialog(this, "Ya existe un préstamo con esa matrícula.");
            }
        }
    }//GEN-LAST:event_btnprestarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnmostrarprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarprestamosActionPerformed
        // TODO add your handling code here:
        var prestamos = JsonUtil.leerPrestamos();
        if (prestamos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay préstamos.");
        } else {
            String texto = "";
            for (var p : prestamos) {
                texto += p.getNombreEstudiante() + " - " + p.getMatricula() + " - " + p.getLibroSolicitado() + "\n";
            }
            JOptionPane.showMessageDialog(this, texto);
        }
    }//GEN-LAST:event_btnmostrarprestamosActionPerformed

    private void btneliminarprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarprestamosActionPerformed
        // TODO add your handling code here:
        String matricula = JOptionPane.showInputDialog(this, "Ingrese la matrícula a eliminar:");
        if (matricula != null && !matricula.isEmpty()) {
            boolean eliminado = JsonUtil.eliminarPrestamo(matricula);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Préstamo eliminado.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el préstamo.");
            }
        }
    }//GEN-LAST:event_btneliminarprestamosActionPerformed

    private void btnmodificarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarprestamoActionPerformed
        // TODO add your handling code here:
        String matriculaBuscada = JOptionPane.showInputDialog(this, "Ingrese la matrícula del préstamo a modificar:");
        if (matriculaBuscada != null && !matriculaBuscada.isEmpty()) {
            String nuevoNombre = JOptionPane.showInputDialog(this, "Nuevo nombre:");
            String nuevaMatricula = JOptionPane.showInputDialog(this, "Nueva matrícula:");
            String nuevoLibro = JOptionPane.showInputDialog(this, "Nuevo libro solicitado:");

            boolean modificado = JsonUtil.modificarPrestamo(matriculaBuscada, nuevoNombre, nuevaMatricula, nuevoLibro);
            if (modificado) {
                JOptionPane.showMessageDialog(this, "Préstamo modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el préstamo.");
            }
        }
    }//GEN-LAST:event_btnmodificarprestamoActionPerformed

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
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminarprestamos;
    private javax.swing.JButton btnmodificarprestamo;
    private javax.swing.JButton btnmostrarprestamos;
    private javax.swing.JButton btnprestar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
