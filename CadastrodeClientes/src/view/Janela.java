package view;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class Janela extends javax.swing.JFrame {

    private static JDesktopPane desktop = new JDesktopPane();
    
    public Janela() {
        initComponents();
        setLocationRelativeTo(null);
        setContentPane(desktop);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menucadastro = new javax.swing.JMenu();
        menupessoafisica = new javax.swing.JMenuItem();
        menuclientes = new javax.swing.JMenu();
        cadastraProduto = new javax.swing.JMenuItem();
        consultaProduto = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Clientes");

        menucadastro.setText("Clientes");

        menupessoafisica.setText("Cadastrar Cliente");
        menupessoafisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupessoafisicaActionPerformed(evt);
            }
        });
        menucadastro.add(menupessoafisica);

        jMenuBar1.add(menucadastro);

        menuclientes.setText("Produtos");

        cadastraProduto.setText("Cadastrar Produto");
        cadastraProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraProdutoActionPerformed(evt);
            }
        });
        menuclientes.add(cadastraProduto);

        consultaProduto.setText("Consultar Produto");
        consultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdutoActionPerformed(evt);
            }
        });
        menuclientes.add(consultaProduto);

        jMenuBar1.add(menuclientes);

        sobre.setText("Sobre");
        jMenuBar1.add(sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void gerarJIF(JInternalFrame janela){
        desktop.add(janela);
        janela.setLocation(desktop.getWidth() / 2 - janela.getWidth() / 2, desktop.getHeight() / 2 - janela.getHeight() / 2);
        janela.setVisible(true);
    }
    
    private void menupessoafisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupessoafisicaActionPerformed
        CadastrarClienteJIF cadastrarPF = new CadastrarClienteJIF();
        gerarJIF(cadastrarPF);
    }//GEN-LAST:event_menupessoafisicaActionPerformed

    private void cadastraProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraProdutoActionPerformed
        CadastrarProdutoJIF cadastraP = new CadastrarProdutoJIF();
        gerarJIF(cadastraP);
    }//GEN-LAST:event_cadastraProdutoActionPerformed

    private void consultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdutoActionPerformed
        ConsultarProdutoJIF consultaP = new ConsultarProdutoJIF();
        gerarJIF(consultaP);
    }//GEN-LAST:event_consultaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastraProduto;
    private javax.swing.JMenuItem consultaProduto;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menucadastro;
    private javax.swing.JMenu menuclientes;
    private javax.swing.JMenuItem menupessoafisica;
    private javax.swing.JMenu sobre;
    // End of variables declaration//GEN-END:variables
}
