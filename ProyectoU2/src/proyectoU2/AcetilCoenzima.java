/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoU2;

import java.awt.Color;

/**
 *
 * @author 18PROGB0133
 */
public class AcetilCoenzima extends javax.swing.JFrame {

    /**
     * Creates new form AcetilCoenzima
     */
    public AcetilCoenzima() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtrás = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContenido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnSalir2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnMostrarpdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Acetil coenzima");
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);

        btnAtrás.setText("Atrás");
        btnAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrásActionPerformed(evt);
            }
        });

        txtContenido.setEditable(false);
        txtContenido.setColumns(20);
        txtContenido.setForeground(new java.awt.Color(0, 51, 255));
        txtContenido.setLineWrap(true);
        txtContenido.setRows(5);
        txtContenido.setText("La acetil coenzima A, abreviado como acetil CoA, es una molécula intermediaria crucial para diversas rutas metabólicas tanto de lípidos como de proteínas y carbohidratos. Entre sus funciones principales destaca entregar el grupo acetilo al ciclo de Krebs.\nEl origen de la molécula acetil coenzima A puede darse a través de distintas vías; esta molécula puede formarse dentro de la mitocondria o fuera de esta, dependiendo de cuánta glucosa se encuentre en el ambiente. Otra de las características de la acetil CoA es que con su oxidación se produce energía. Tal como se mencionó anteriormente, la formación de la acetil CoA  puede llevarse a cabo dentro o fuera de la mitocondria, y depende de los niveles de glucosa presentes en el medio.\nLa acetil coenzima A, abreviado como acetil CoA, es una molécula intermediaria crucial para diversas rutas metabólicas tanto de lípidos como de proteínas y carbohidratos. Entre sus funciones principales destaca entregar el grupo acetilo al ciclo de Krebs.\nEl origen de la molécula acetil coenzima A puede darse a través de distintas vías; esta molécula puede formarse dentro de la mitocondria o fuera de esta, dependiendo de cuánta glucosa se encuentre en el ambiente. Otra de las características de la acetil CoA es que con su oxidación se produce energía. Tal como se mencionó anteriormente, la formación de la acetil CoA  puede llevarse a cabo dentro o fuera de la mitocondria, y depende de los niveles de glucosa presentes en el medio.\n");
        jScrollPane1.setViewportView(txtContenido);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("             Acetil Coenzima");

        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen00.jpg"))); // NOI18N

        btnMostrarpdf.setText("Mostrar pdf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnMostrarpdf))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtrás, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAtrás)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir2)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarpdf)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 55, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("Acetil Coenzima");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrásActionPerformed
        dispose();  
    }//GEN-LAST:event_btnAtrásActionPerformed

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
            java.util.logging.Logger.getLogger(AcetilCoenzima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcetilCoenzima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcetilCoenzima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcetilCoenzima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcetilCoenzima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrás;
    private javax.swing.JButton btnMostrarpdf;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtContenido;
    // End of variables declaration//GEN-END:variables

    private void Dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}