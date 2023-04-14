package igu;

import javax.swing.JOptionPane;

public class ConversorMoneda extends javax.swing.JFrame {

    public ConversorMoneda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbSeleccionMoneda = new javax.swing.JComboBox<>();
        btnOkMoneda = new javax.swing.JButton();
        btnAtrasMoneda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Elige la conversion de moneda:");

        cmbSeleccionMoneda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbSeleccionMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De AR$ a Dolar", "De AR$ a Euro", "De AR$ a Yen", "De AR$ a Libras", "De Dolar a AR$", "De Euro a AR$", "De Yen a AR$", "De Libras a AR$" }));
        cmbSeleccionMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeleccionMonedaActionPerformed(evt);
            }
        });

        btnOkMoneda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOkMoneda.setText("OK");
        btnOkMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkMonedaActionPerformed(evt);
            }
        });

        btnAtrasMoneda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAtrasMoneda.setText("ATRAS");
        btnAtrasMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasMonedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtrasMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOkMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cmbSeleccionMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSeleccionMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnOkMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtrasMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("® Jony Escobar - 2023");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jony\\Downloads\\pngwing.com.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkMonedaActionPerformed
        double conv =0;
        String input = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir:");
    try {
        double cantidad = Double.parseDouble(input);
        switch (cmbSeleccionMoneda.getSelectedIndex()) {
            case 0:
                conv = cantidad / 400;
                JOptionPane.showMessageDialog(this, cantidad + " AR$ son: " + conv + " DOLARES", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                conv = cantidad * 0.0042;
                JOptionPane.showMessageDialog(this, cantidad + " AR$ son: " + conv + " EUROS", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                conv = cantidad * 0.62;
                JOptionPane.showMessageDialog(this, cantidad + " AR$ son: " + conv + " YENES", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                conv = cantidad * 0.0037;
                JOptionPane.showMessageDialog(this, cantidad + " AR$ son: " + conv + " LIBRAS", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                conv = cantidad * 400;
                JOptionPane.showMessageDialog(this, cantidad + " DOLARES son: " + conv + " AR$", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                conv = cantidad / 0.0042;
                JOptionPane.showMessageDialog(this, cantidad + " EUROS son: " + conv + " AR$", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                conv = cantidad / 0.62;
                JOptionPane.showMessageDialog(this, cantidad + " YENES son: " + conv + " AR$", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
                conv = cantidad / 0.0037;
                JOptionPane.showMessageDialog(this, cantidad + " LIBRAS son: " + conv + " AR$", "Resultado de la conversion", JOptionPane.INFORMATION_MESSAGE);
                break;
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnOkMonedaActionPerformed

    private void btnAtrasMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasMonedaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasMonedaActionPerformed

    private void cmbSeleccionMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeleccionMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSeleccionMonedaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasMoneda;
    private javax.swing.JButton btnOkMoneda;
    private javax.swing.JComboBox<String> cmbSeleccionMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
