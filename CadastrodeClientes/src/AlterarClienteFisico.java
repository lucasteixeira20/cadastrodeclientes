
// * @author Lucas
 
public class AlterarClienteFisico extends javax.swing.JInternalFrame {

    private EventoAlterarFisico eventAF = new EventoAlterarFisico(this);
    public AlterarClienteFisico() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoconsultacpf = new javax.swing.JTextField();
        alterarclienteF = new javax.swing.JButton();
        cancelarconsultacpf = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Alterar Cliente Físico");

        jLabel1.setText("Insira o CPF do Cliente a ser alterado:");

        alterarclienteF.setText("Alterar");
        alterarclienteF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarclienteFActionPerformed(evt);
            }
        });
        alterarclienteF.addActionListener(eventAF);
        alterarclienteF.setActionCommand("alterar");

        cancelarconsultacpf.setText("Cancelar");
        cancelarconsultacpf.addActionListener(eventAF);
        cancelarconsultacpf.setActionCommand("cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoconsultacpf)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(alterarclienteF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(cancelarconsultacpf)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoconsultacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alterarclienteF)
                    .addComponent(cancelarconsultacpf))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alterarclienteFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarclienteFActionPerformed
     
    }//GEN-LAST:event_alterarclienteFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarclienteF;
    private javax.swing.JTextField campoconsultacpf;
    private javax.swing.JButton cancelarconsultacpf;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
