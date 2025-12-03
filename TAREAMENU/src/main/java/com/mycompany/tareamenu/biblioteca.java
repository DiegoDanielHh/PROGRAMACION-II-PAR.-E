/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareamenu;
import javax.swing.JOptionPane;
import com.google.gson.Gson;

/**
 *
 * @author HP AMD Ryzen 5
 */
public class biblioteca extends javax.swing.JFrame {

    /**
     * Creates new form biblioteca
     */
    public biblioteca() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        btncancelar = new javax.swing.JButton();
        btnmostrarlibros = new javax.swing.JButton();
        btnmostrarautores = new javax.swing.JButton();
        btnmostrarprestamos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Biblioteca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnmostrarlibros.setText("Mostrar libros");
        btnmostrarlibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarlibrosActionPerformed(evt);
            }
        });

        btnmostrarautores.setText("Mostrar autores");
        btnmostrarautores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarautoresActionPerformed(evt);
            }
        });

        btnmostrarprestamos.setText("Mostrar prestamos");
        btnmostrarprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarprestamosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btncancelar))
                    .addComponent(btnmostrarprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmostrarlibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmostrarautores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnmostrarlibros)
                .addGap(18, 18, 18)
                .addComponent(btnmostrarautores)
                .addGap(18, 18, 18)
                .addComponent(btnmostrarprestamos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btncancelar)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        dispose(); // cierra solo la ventana de biblioteca
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnmostrarlibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarlibrosActionPerformed
        // TODO add your handling code here:
        var libros = JsonUtil.leerLibros();
        if (libros.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay libros.");
        } else {
            String texto = "";
            for (var l : libros) texto += l.getTitulo()+" - "+l.getAnio()+" - "+l.getAutor()+"\n";
            JOptionPane.showMessageDialog(this, texto);
        }
    }//GEN-LAST:event_btnmostrarlibrosActionPerformed

    private void btnmostrarautoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarautoresActionPerformed
        // TODO add your handling code here:
        var autores = JsonUtil.leerAutores();
        if (autores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay autores.");
        } else {
            String texto = "";
            for (var a : autores) texto += a.getNombre()+" - "+a.getNacionalidad()+" - "+a.getFechaNacimiento()+"\n";
            JOptionPane.showMessageDialog(this, texto);
        }
    }//GEN-LAST:event_btnmostrarautoresActionPerformed

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
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnmostrarautores;
    private javax.swing.JButton btnmostrarlibros;
    private javax.swing.JButton btnmostrarprestamos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
