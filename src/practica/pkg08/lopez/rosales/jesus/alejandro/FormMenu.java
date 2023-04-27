/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg08.lopez.rosales.jesus.alejandro;

public class FormMenu extends javax.swing.JFrame {

    private Pila pila;
    private Cola cola;
    
    public FormMenu() {
        initComponents();
        pila = new Pila();
        cola = new Cola();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuPila = new javax.swing.JMenu();
        itemPush = new javax.swing.JMenuItem();
        itemRecorrerPila = new javax.swing.JMenuItem();
        itemPop = new javax.swing.JMenuItem();
        menuCola = new javax.swing.JMenu();
        itemEncolar = new javax.swing.JMenuItem();
        itemRecorrerCola = new javax.swing.JMenuItem();
        itemDesencolar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Menú de opciones");

        menu.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        menuPila.setText("Pila");
        menuPila.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        itemPush.setText("Push");
        itemPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPushActionPerformed(evt);
            }
        });
        menuPila.add(itemPush);

        itemRecorrerPila.setText("Recorrer");
        itemRecorrerPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecorrerPilaActionPerformed(evt);
            }
        });
        menuPila.add(itemRecorrerPila);

        itemPop.setText("Pop");
        itemPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPopActionPerformed(evt);
            }
        });
        menuPila.add(itemPop);

        menu.add(menuPila);

        menuCola.setText("Cola");
        menuCola.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N

        itemEncolar.setText("Encolar");
        itemEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEncolarActionPerformed(evt);
            }
        });
        menuCola.add(itemEncolar);

        itemRecorrerCola.setText("Recorrer");
        itemRecorrerCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecorrerColaActionPerformed(evt);
            }
        });
        menuCola.add(itemRecorrerCola);

        itemDesencolar.setText("Desencolar");
        itemDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDesencolarActionPerformed(evt);
            }
        });
        menuCola.add(itemDesencolar);

        menu.add(menuCola);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPushActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemPushActionPerformed

    private void itemRecorrerPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecorrerPilaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemRecorrerPilaActionPerformed

    private void itemPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPopActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemPopActionPerformed

    private void itemEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEncolarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemEncolarActionPerformed

    private void itemRecorrerColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecorrerColaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemRecorrerColaActionPerformed

    private void itemDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesencolarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_itemDesencolarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemDesencolar;
    private javax.swing.JMenuItem itemEncolar;
    private javax.swing.JMenuItem itemPop;
    private javax.swing.JMenuItem itemPush;
    private javax.swing.JMenuItem itemRecorrerCola;
    private javax.swing.JMenuItem itemRecorrerPila;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuCola;
    private javax.swing.JMenu menuPila;
    // End of variables declaration//GEN-END:variables
}
