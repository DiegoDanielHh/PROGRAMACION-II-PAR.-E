/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareamenu;

/**
 *
 * @author HP AMD Ryzen 5
 */
import javax.swing.JOptionPane;
public class Libro extends javax.swing.JFrame {

    public Libro() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnmostrarlibro = new javax.swing.JButton();
        btneliminarlibro = new javax.swing.JButton();
        btnmodificarlibro = new javax.swing.JButton();

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("LIBRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("titulo");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("año");

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("autor");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnmostrarlibro.setText("Mostrar");
        btnmostrarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarlibroActionPerformed(evt);
            }
        });

        btneliminarlibro.setText("Eliminar");
        btneliminarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarlibroActionPerformed(evt);
            }
        });

        btnmodificarlibro.setText("Modificar");
        btnmodificarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarlibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmostrarlibro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificarlibro)
                        .addGap(14, 14, 14)
                        .addComponent(btneliminarlibro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(70, 70, 70))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnmostrarlibro)
                    .addComponent(btneliminarlibro)
                    .addComponent(btnmodificarlibro))
                .addGap(29, 29, 29))
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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String titulo = jTextField1.getText();
        String anioStr = jTextField2.getText();
        String autor = jTextField3.getText();

        if(titulo.isEmpty() || anioStr.isEmpty() || autor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
        } else {
            try {
                int anio = Integer.parseInt(anioStr);
                LibroInfo libro = new LibroInfo(titulo, anio, autor);
                boolean guardado = JsonUtil.guardarLibro(libro);
                if (guardado) {
                    JOptionPane.showMessageDialog(this, "Libro guardado.");
                } else {
                    JOptionPane.showMessageDialog(this, "El libro ya existe.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El año debe ser un número.");
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmostrarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarlibroActionPerformed
        // TODO add your handling code here:
        var libros = JsonUtil.leerLibros();
        if (libros.isEmpty()) {
            JOptionPane.showMessageDialog(this,"no hay libros.");
        } else {
            String texto ="";
            for (var l: libros) texto += l.getTitulo()+"-"+l.getAnio()+" - "+l.getAutor()+"\n";
            JOptionPane.showMessageDialog(this, texto);
        }
    }//GEN-LAST:event_btnmostrarlibroActionPerformed

    private void btneliminarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarlibroActionPerformed
        // TODO add your handling code here:
        String titulo = JOptionPane.showInputDialog(this, "Ingrese el título a eliminar:");
        if (titulo != null && !titulo.isEmpty()) {
            boolean eliminado = JsonUtil.eliminarLibro(titulo);
            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Libro eliminado.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el libro.");
            }
        }  
        
    }//GEN-LAST:event_btneliminarlibroActionPerformed

    private void btnmodificarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarlibroActionPerformed
        // TODO add your handling code here:
        String tituloBuscado = JOptionPane.showInputDialog(this, "Ingrese el título del libro a modificar:");
        if (tituloBuscado != null && !tituloBuscado.isEmpty()) {
            // Pedir nuevos valores (pueden ser vacíos si no quiere cambiar)
            String nuevoTitulo = JOptionPane.showInputDialog(this, "Nuevo título:");
            String anioStr = JOptionPane.showInputDialog(this, "Nuevo año:");
            String nuevoAutor = JOptionPane.showInputDialog(this, "Nuevo autor:");

            Integer nuevoAnio = null;
            if (anioStr != null && !anioStr.isEmpty()) {
                try {
                    nuevoAnio = Integer.parseInt(anioStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "El año debe ser un número.");
                    return;
                }
            }

            boolean modificado = JsonUtil.modificarLibro(tituloBuscado, nuevoTitulo, nuevoAnio, nuevoAutor);
            if (modificado) {
                JOptionPane.showMessageDialog(this, "Libro modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el libro.");
            }
        }
    }//GEN-LAST:event_btnmodificarlibroActionPerformed

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
            java.util.logging.Logger.getLogger(Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminarlibro;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificarlibro;
    private javax.swing.JButton btnmostrarlibro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}
