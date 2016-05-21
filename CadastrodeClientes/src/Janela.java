


import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class Janela extends javax.swing.JFrame {

    private JDesktopPane desktop = new JDesktopPane();

    public Janela() {
        initComponents();
        setLocationRelativeTo(null);
        setContentPane(desktop);

        // Adiciona janelas internas ao desktoppane
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        menucadastro = new javax.swing.JMenu();
        menupessoafisica = new javax.swing.JMenuItem();
        menupessoajuridica = new javax.swing.JMenuItem();
        menuclientes = new javax.swing.JMenu();
        menuconsultarfisico = new javax.swing.JMenuItem();
        menuconsultarjuridico = new javax.swing.JMenuItem();
        alterarFisico = new javax.swing.JMenuItem();
        AlterarJuridico = new javax.swing.JMenuItem();
        menuexcluirclienteFi = new javax.swing.JMenuItem();
        menuexcluirclienteJu = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Clientes");

        menucadastro.setText("Cadastro");

        menupessoafisica.setText("Pessoa Fisica");
        menupessoafisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupessoafisicaActionPerformed(evt);
            }
        });
        menucadastro.add(menupessoafisica);

        menupessoajuridica.setText("Pessoa Juridica");
        menupessoajuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupessoajuridicaActionPerformed(evt);
            }
        });
        menucadastro.add(menupessoajuridica);

        jMenuBar1.add(menucadastro);

        menuclientes.setText("Clientes");

        menuconsultarfisico.setText("Consultar Cliente Fisico");
        menuconsultarfisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuconsultarfisicoActionPerformed(evt);
            }
        });
        menuclientes.add(menuconsultarfisico);

        menuconsultarjuridico.setText("Consultar Cliente Juridico");
        menuconsultarjuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuconsultarjuridicoActionPerformed(evt);
            }
        });
        menuclientes.add(menuconsultarjuridico);

        alterarFisico.setText("Alterar Dados Cliente Fisico");
        alterarFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFisicoActionPerformed(evt);
            }
        });
        menuclientes.add(alterarFisico);

        AlterarJuridico.setText("Alterar Dados Clientes Juridico");
        AlterarJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarJuridicoActionPerformed(evt);
            }
        });
        menuclientes.add(AlterarJuridico);

        menuexcluirclienteFi.setText("Excluir Cliente Fisico");
        menuexcluirclienteFi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexcluirclienteFiActionPerformed(evt);
            }
        });
        menuclientes.add(menuexcluirclienteFi);

        menuexcluirclienteJu.setText("Excluir Cliente Juridico");
        menuexcluirclienteJu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuexcluirclienteJuActionPerformed(evt);
            }
        });
        menuclientes.add(menuexcluirclienteJu);

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
            .addGap(0, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuconsultarfisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuconsultarfisicoActionPerformed
        ConsultarClienteFisico consultaPF = new ConsultarClienteFisico();
        desktop.add(consultaPF);
// Centralizar janela
        consultaPF.setLocation(getWidth() / 2 - consultaPF.getWidth() / 2, getHeight() / 2 - consultaPF.getHeight() / 2);
        // Tornar janela visível
        consultaPF.setVisible(true);
    }//GEN-LAST:event_menuconsultarfisicoActionPerformed

    private void menupessoafisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupessoafisicaActionPerformed
        CadastrarPessoaFisica cadastrarPF = new CadastrarPessoaFisica();
        desktop.add(cadastrarPF);
        // Centralizar janela
        cadastrarPF.setLocation(getWidth() / 2 - cadastrarPF.getWidth() / 2, getHeight() / 2 - cadastrarPF.getHeight() / 2);
        // Tornar janela visível
        cadastrarPF.setVisible(true);
    }//GEN-LAST:event_menupessoafisicaActionPerformed

    private void menupessoajuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupessoajuridicaActionPerformed
        CadastrarPessoaJuridica cadastrarPJ = new CadastrarPessoaJuridica();
        // Centralizar janela
        desktop.add(cadastrarPJ);
        cadastrarPJ.setLocation(getWidth() / 2 - cadastrarPJ.getWidth() / 2, getHeight() / 2 - cadastrarPJ.getHeight() / 2);
        // Tornar janela visível
        cadastrarPJ.setVisible(true);
    }//GEN-LAST:event_menupessoajuridicaActionPerformed

    private void menuconsultarjuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuconsultarjuridicoActionPerformed
        ConsultarClienteJuridico consultaPJ = new ConsultarClienteJuridico();
        desktop.add(consultaPJ);
        // Centralizar janela
        consultaPJ.setLocation(getWidth() / 2 - consultaPJ.getWidth() / 2, getHeight() / 2 - consultaPJ.getHeight() / 2);
        // Tornar janela visível
        consultaPJ.setVisible(true);
    }//GEN-LAST:event_menuconsultarjuridicoActionPerformed

    private void alterarFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFisicoActionPerformed

        AlterarClienteFisico alterarPF = new AlterarClienteFisico();
        desktop.add(alterarPF);
// Centralizar janela
        alterarPF.setLocation(getWidth() / 2 - alterarPF.getWidth() / 2, getHeight() / 2 - alterarPF.getHeight() / 2);
        // Tornar janela visível
        alterarPF.setVisible(true);
    }//GEN-LAST:event_alterarFisicoActionPerformed

    private void menuexcluirclienteFiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexcluirclienteFiActionPerformed
        ExcluirClienteFisico excluirPF = new ExcluirClienteFisico();
        desktop.add(excluirPF);
        // Centralizar janela
        excluirPF.setLocation(getWidth() / 2 - excluirPF.getWidth() / 2, getHeight() / 2 - excluirPF.getHeight() / 2);
        // Tornar janela visível
        excluirPF.setVisible(true);
    }//GEN-LAST:event_menuexcluirclienteFiActionPerformed

    private void menuexcluirclienteJuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuexcluirclienteJuActionPerformed
        ExcluirClienteJuridico excluirPJ = new ExcluirClienteJuridico();
        desktop.add(excluirPJ);
        //Centralizar janela
        excluirPJ.setLocation(getWidth() / 2 - excluirPJ.getWidth() / 2, getHeight() / 2 - excluirPJ.getHeight() / 2);
        // Tornar janela visível
        excluirPJ.setVisible(true);
    }//GEN-LAST:event_menuexcluirclienteJuActionPerformed

    private void AlterarJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarJuridicoActionPerformed
        AlterarClienteJuridico alterarPJ = new AlterarClienteJuridico();
        desktop.add(alterarPJ);
        // Centralizar janela
        alterarPJ.setLocation(getWidth() / 2 - alterarPJ.getWidth() / 2, getHeight() / 2 - alterarPJ.getHeight() / 2);
        // Tornar janela visível
        alterarPJ.setVisible(true);
    }//GEN-LAST:event_AlterarJuridicoActionPerformed

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
    private javax.swing.JMenuItem AlterarJuridico;
    private javax.swing.JMenuItem alterarFisico;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menucadastro;
    private javax.swing.JMenu menuclientes;
    private javax.swing.JMenuItem menuconsultarfisico;
    private javax.swing.JMenuItem menuconsultarjuridico;
    private javax.swing.JMenuItem menuexcluirclienteFi;
    private javax.swing.JMenuItem menuexcluirclienteJu;
    private javax.swing.JMenuItem menupessoafisica;
    private javax.swing.JMenuItem menupessoajuridica;
    private javax.swing.JMenu sobre;
    // End of variables declaration//GEN-END:variables
}
