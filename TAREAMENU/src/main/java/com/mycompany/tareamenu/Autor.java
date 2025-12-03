/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareamenu;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Autor extends javax.swing.JFrame {
    public static ArrayList<AutorInfo> listaAutores = new ArrayList<>();

    public Autor() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnmostrarautor = new javax.swing.JButton();
        btneliminarautor = new javax.swing.JButton();
        btnmodificarautor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("AUTOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Nombre: ");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Nacionalidad: ");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Fecha de nacimiento: ");

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnmostrarautor.setText("Mostrar");
        btnmostrarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarautorActionPerformed(evt);
            }
        });

        btneliminarautor.setText("Eliminar");
        btneliminarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarautorActionPerformed(evt);
            }
        });

        btnmodificarautor.setText("Modificar");
        btnmodificarautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarautorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnregistrar)
                        .addGap(33, 33, 33)
                        .addComponent(btnbuscar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnmostrarautor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmodificarautor)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminarautor)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar)
                    .addComponent(btnbuscar)
                    .addComponent(btnmostrarautor)
                    .addComponent(btneliminarautor)
                    .addComponent(btnmodificarautor))
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        String nombre = jTextField1.getText();
        String nacionalidad = jTextField2.getText();
        String fecha = jTextField3.getText();

        if(nombre.isEmpty() || nacionalidad.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        } else {
            AutorInfo autor = new AutorInfo(nombre, nacionalidad, fecha);
            boolean guardado = JsonUtil.guardarAutor(autor);
            if (guardado) {
                JOptionPane.showMessageDialog(this, "Autor guardado.");
            } else {
                JOptionPane.showMessageDialog(this, "El autor ya existe.");
            }
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String nombreBuscado = jTextField1.getText();
        boolean encontrado = false;

        var autores = JsonUtil.leerAutores(); // leer desde el archivo

        for(AutorInfo autor : autores) {
            if(autor.getNombre().equalsIgnoreCase(nombreBuscado)) {
                JOptionPane.showMessageDialog(this, 
                    "Autor encontrado:\nNombre: " + autor.getNombre() +
                    "\nNacionalidad: " + autor.getNacionalidad() +
                    "\nFecha de nacimiento: " + autor.getFechaNacimiento());
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            JOptionPane.showMessageDialog(this, "Autor no registrado.");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarautorActionPerformed
        // TODO add your handling code here:
        var autores = JsonUtil.leerAutores();
        if (autores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay autores.");
        } else {
            String texto = "";
            for (var a : autores) texto += a.getNombre()+" - "+a.getNacionalidad()+" - "+a.getFechaNacimiento()+"\n";
            JOptionPane.showMessageDialog(this, texto);
        }
    }//GEN-LAST:event_btnmostrarautorActionPerformed

    private void btneliminarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarautorActionPerformed
        // TODO add your handling code here:
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre a eliminar:");
        if (nombre != null && !nombre.isEmpty()) {
            boolean eliminado = JsonUtil.eliminarAutor(nombre);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Autor eliminado.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el autor.");
            }
        }
    }//GEN-LAST:event_btneliminarautorActionPerformed

    private void btnmodificarautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarautorActionPerformed
        // TODO add your handling code here:
        String nombreBuscado = JOptionPane.showInputDialog(this, "Ingrese el nombre del autor a modificar:");
        if (nombreBuscado != null && !nombreBuscado.isEmpty()) {
            String nuevoNombre = JOptionPane.showInputDialog(this, "Nuevo nombre:");
            String nuevaNacionalidad = JOptionPane.showInputDialog(this, "Nueva nacionalidad:");
            String nuevaFecha = JOptionPane.showInputDialog(this, "Nueva fecha de nacimiento:");

            boolean modificado = JsonUtil.modificarAutor(nombreBuscado, nuevoNombre, nuevaNacionalidad, nuevaFecha);
            if (modificado) {
                JOptionPane.showMessageDialog(this, "Autor modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el autor.");
            }
        }
    }//GEN-LAST:event_btnmodificarautorActionPerformed

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
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminarautor;
    private javax.swing.JButton btnmodificarautor;
    private javax.swing.JButton btnmostrarautor;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}
