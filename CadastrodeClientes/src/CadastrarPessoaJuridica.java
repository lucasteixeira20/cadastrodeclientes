import java.io.IOException;


public class CadastrarPessoaJuridica extends javax.swing.JInternalFrame {


    private CadastroJuridicoListener eventCJ = new CadastroJuridicoListener(this);
    
    public CadastrarPessoaJuridica() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoRazaoSocial = new javax.swing.JTextField();
        campocnpj = new javax.swing.JTextField();
        salvarjuridico = new javax.swing.JButton();
        cancelarjuridico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campotelefonej = new javax.swing.JTextField();
        campoemailj = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Cadastrar Pessoa Jurídica");

        jLabel1.setText("Razão social:");

        jLabel2.setText("CNPJ:");

        campoRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRazaoSocialActionPerformed(evt);
            }
        });
        campoRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoRazaoSocialKeyTyped(evt);
            }
        });

        campocnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campocnpjKeyTyped(evt);
            }
        });

        salvarjuridico.setText("Salvar");
        salvarjuridico.addActionListener(eventCJ);
        salvarjuridico.setActionCommand("salvar");
        salvarjuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjuridicoActionPerformed(evt);
            }
        });

        cancelarjuridico.setText("Cancelar");
        cancelarjuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjuridicoActionPerformed(evt);
            }
        });
        cancelarjuridico.addActionListener(eventCJ);
        cancelarjuridico.setActionCommand("cancelar");

        jLabel3.setText("Telefone:");

        campotelefonej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelefonejActionPerformed(evt);
            }
        });
        campotelefonej.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campotelefonejKeyTyped(evt);
            }
        });

        campoemailj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoemailjActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campotelefonej, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campocnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarjuridico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarjuridico))
                            .addComponent(campoemailj, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campocnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campotelefonej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoemailj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarjuridico)
                    .addComponent(salvarjuridico))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRazaoSocialActionPerformed

    private void cancelarjuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjuridicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarjuridicoActionPerformed

    private void campotelefonejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotelefonejActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotelefonejActionPerformed

    private void campoemailjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoemailjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoemailjActionPerformed

    private void salvarjuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjuridicoActionPerformed
        try {
            SalvaLogs.escrever("Cadastro Pessoa Jurídica", "C:\\Users\\comp1\\Desktop\\logs.txt", true);
        } catch (IOException ex) {
            System.out.println("Erro");
        }
        //Adiciona dados ao objeto
        ClienteJuridico CJ = new ClienteJuridico();
        CJ.setRazaoSocial(campoRazaoSocial.getText());
        CJ.setCNPJ(campocnpj.getText());
        CJ.setTelefone(campotelefonej.getText());
        CJ.setEmail(campoemailj.getText());
    }//GEN-LAST:event_salvarjuridicoActionPerformed

    private void campoRazaoSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRazaoSocialKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvwyxz ";// lista de caracters que devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o evento estiver não estiver na lista
            evt.consume();//aciona esse propriedade para eliminar a ação do evento
        }
    }//GEN-LAST:event_campoRazaoSocialKeyTyped

    private void campocnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campocnpjKeyTyped
        String caracteres = "0987654321";// lista de caracters que devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o evento estiver não estiver na lista
            evt.consume();//aciona esse propriedade para eliminar a ação do evento
        }
    }//GEN-LAST:event_campocnpjKeyTyped

    private void campotelefonejKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campotelefonejKeyTyped
        String caracteres = "0987654321";// lista de caracters que devem ser aceitos
        if (!caracteres.contains(evt.getKeyChar() + "")) {// se o caracter que gerou o evento estiver não estiver na lista
            evt.consume();//aciona esse propriedade para eliminar a ação do evento
        }
    }//GEN-LAST:event_campotelefonejKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoRazaoSocial;
    private javax.swing.JTextField campocnpj;
    private javax.swing.JTextField campoemailj;
    private javax.swing.JTextField campotelefonej;
    private javax.swing.JButton cancelarjuridico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton salvarjuridico;
    // End of variables declaration//GEN-END:variables
}
