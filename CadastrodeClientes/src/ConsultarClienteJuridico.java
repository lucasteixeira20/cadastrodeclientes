


import java.io.IOException;


public class ConsultarClienteJuridico extends javax.swing.JInternalFrame {

    private ConsultarJuridicoListener eventJ = new ConsultarJuridicoListener(this);
    public ConsultarClienteJuridico() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoconsultacnpj = new javax.swing.JTextField();
        consultarcnpj = new javax.swing.JButton();
        cancelarconsultajuridico = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Consultar Cliente Jurídico");

        jLabel1.setText("Insira o CNPJ do Cliente a ser consultado:");

        campoconsultacnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoconsultacnpjKeyTyped(evt);
            }
        });

        consultarcnpj.setText("Consultar");
        consultarcnpj.addActionListener(eventJ);
        consultarcnpj.setActionCommand("consultar");
        consultarcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarcnpjActionPerformed(evt);
            }
        });

        cancelarconsultajuridico.setText("Cancelar");
        cancelarconsultajuridico.addActionListener(eventJ);
        cancelarconsultajuridico.setActionCommand("cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoconsultacnpj)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(consultarcnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(cancelarconsultajuridico)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoconsultacnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarcnpj)
                    .addComponent(cancelarconsultajuridico))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarcnpjActionPerformed
        try {
            SalvaLogs.escrever("Consulta Cliente Jurídico", "C:\\Users\\comp1\\Desktop\\logs.txt", true);
        } catch (IOException ex) {
            System.out.println("Erro");
        }
    }//GEN-LAST:event_consultarcnpjActionPerformed

    private void campoconsultacnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoconsultacnpjKeyTyped
        String caracteres = "0987654321";// lista de caracters que devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o evento estiver não estiver na lista
            evt.consume();//aciona esse propriedade para eliminar a ação do evento
        }
    }//GEN-LAST:event_campoconsultacnpjKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoconsultacnpj;
    private javax.swing.JButton cancelarconsultajuridico;
    private javax.swing.JButton consultarcnpj;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
