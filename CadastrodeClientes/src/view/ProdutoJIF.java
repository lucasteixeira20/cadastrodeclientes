package view;

import bean.Produto;
import listener.ProdutoListener;
import validacoes.ImpedirCaracteres;

public class ProdutoJIF extends javax.swing.JInternalFrame {

    private ProdutoListener eventP = new ProdutoListener(this);

    public ProdutoJIF() {
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
        jLabel2 = new javax.swing.JLabel();
        campoEAN = new javax.swing.JTextField();
        camponomeProduto = new javax.swing.JTextField();
        cadastraProduto = new javax.swing.JButton();
        cancelarProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campovalor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoqntProduto = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setTitle("Produto");
        setToolTipText("");

        jLabel1.setText("Código EAN:");

        jLabel2.setText("Nome:");

        campoEAN.setEnabled(false);
        campoEAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEANKeyTyped(evt);
            }
        });

        camponomeProduto.setEnabled(false);
        camponomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                camponomeProdutoKeyTyped(evt);
            }
        });

        cadastraProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Checked-16.png"))); // NOI18N
        cadastraProduto.setText("Salvar");
        cadastraProduto.addActionListener(eventP);
        cadastraProduto.setActionCommand("salvar");

        cancelarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cancel-16.png"))); // NOI18N
        cancelarProduto.setText("Cancelar");
        cancelarProduto.addActionListener(eventP);
        cancelarProduto.setActionCommand("cancelar");

        jLabel3.setText("Valor:");

        campovalor.setEnabled(false);
        campovalor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campovalorKeyTyped(evt);
            }
        });

        jLabel4.setText("Estoque:");

        campoqntProduto.setEnabled(false);
        campoqntProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoqntProdutoKeyTyped(evt);
            }
        });

        jButton4.setText("Habilitar Alteração ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoEAN, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(camponomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(35, 35, 35))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campovalor)
                                        .addComponent(campoqntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton4)))
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jSeparator1)
                            .addContainerGap()))))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(cadastraProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarProduto)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoEAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campovalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoqntProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarProduto)
                    .addComponent(cadastraProduto))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEANKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEANKeyTyped
        ImpedirCaracteres.bloquearCaracteres(true, false, null, evt);
    }//GEN-LAST:event_campoEANKeyTyped

    private void campovalorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campovalorKeyTyped
        ImpedirCaracteres.bloquearCaracteres(true, false, ".", evt);
    }//GEN-LAST:event_campovalorKeyTyped

    private void camponomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_camponomeProdutoKeyTyped
        ImpedirCaracteres.bloquearCaracteres(false, true, null, evt);
    }//GEN-LAST:event_camponomeProdutoKeyTyped

    private void campoqntProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoqntProdutoKeyTyped
        ImpedirCaracteres.bloquearCaracteres(true, false, null, evt);
    }//GEN-LAST:event_campoqntProdutoKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        campoEAN.setEnabled(true);
        camponomeProduto.setEnabled(true);
        campovalor.setEnabled(true);
        campoqntProduto.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastraProduto;
    public javax.swing.JTextField campoEAN;
    public javax.swing.JTextField camponomeProduto;
    public javax.swing.JTextField campoqntProduto;
    public javax.swing.JTextField campovalor;
    private javax.swing.JButton cancelarProduto;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void setProduto(Produto p) {
        campoEAN.setText(p.getCodEAN());
        camponomeProduto.setText(p.getNome());
        campovalor.setText(String.valueOf(p.getValor()));
        campoqntProduto.setText(Integer.toString(p.getQuantidade()));
        eventP.setProduto(p);
    }
}
