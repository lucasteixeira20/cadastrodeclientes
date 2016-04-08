
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class Janela extends javax.swing.JFrame {

    private JDesktopPane desktop = new JDesktopPane();
    private CadastrarPessoaFisica cadastrarPF = new CadastrarPessoaFisica();
    private CadastrarPessoaJuridica cadastrarPJ = new CadastrarPessoaJuridica();
    private ExcluirClienteJuridico excluirPJ = new ExcluirClienteJuridico();
    private ExcluirClienteFisico excluirPF = new ExcluirClienteFisico();
    private ConsultarClienteFisico consultaPF = new ConsultarClienteFisico();
    private ConsultarClienteJuridico consultaPJ = new ConsultarClienteJuridico();
    public Janela() {
        initComponents();
        setLocationRelativeTo(null);
        setContentPane(desktop);
        
        // Instanciado classe de eventos
        EventosJanela events = new EventosJanela(this);
        menupessoafisica.addActionListener(events);
        menupessoajuridica.addActionListener(events);
        menuconsultarfisico.addActionListener(events);
        menuconsultarjuridico.addActionListener(events);
        menuexcluirclienteFi.addActionListener(events);
        menuexcluirclienteJu.addActionListener(events);
        
        // Adiciona janelas internas ao desktoppane
        desktop.add(cadastrarPF);
        desktop.add(cadastrarPJ);
        desktop.add(excluirPJ);
        desktop.add(excluirPF);
        desktop.add(consultaPF);
        desktop.add(consultaPJ);
    }
    
    public CadastrarPessoaFisica getcadastrarPF(){
        return cadastrarPF;
    }
    public CadastrarPessoaJuridica getcadastrarPJ(){
        return cadastrarPJ;
    }
    public ConsultarClienteFisico getconsultaPF(){
        return consultaPF;
    }
    public ConsultarClienteJuridico getconsultaPJ(){
        return consultaPJ;
    }
    public ExcluirClienteFisico getexcluirPF(){
        return excluirPF;
    }
    public ExcluirClienteJuridico getexcluirPJ(){
        return excluirPJ;
    }
    public JMenuItem getmenupessoafisica(){
        return menupessoafisica;
    }
    public JMenuItem getmenupessoajuridica(){
        return menupessoajuridica;
    }
    public JMenuItem getmenuconsultarfisico(){
        return menuconsultarfisico;
    }
    public JMenuItem getmenuconsultarjuridico(){
        return menuconsultarjuridico;
    }
    public JMenuItem getmenuexcluirclienteFi(){
        return menuexcluirclienteFi;
    }
    public JMenuItem getmenuexcluirclienteJu(){
        return menuexcluirclienteJu;
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
        menuexcluirclienteFi = new javax.swing.JMenuItem();
        menuexcluirclienteJu = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Clientes");

        menucadastro.setText("Cadastro");

        menupessoafisica.setText("Pessoa Fisica");
        menucadastro.add(menupessoafisica);

        menupessoajuridica.setText("Pessoa Juridica");
        menucadastro.add(menupessoajuridica);

        jMenuBar1.add(menucadastro);

        menuclientes.setText("Clientes");

        menuconsultarfisico.setText("Consultar Cliente Fisico");
        menuclientes.add(menuconsultarfisico);

        menuconsultarjuridico.setText("Consultar Cliente Juridico");
        menuclientes.add(menuconsultarjuridico);

        menuexcluirclienteFi.setText("Excluir Cliente Fisico");
        menuclientes.add(menuexcluirclienteFi);

        menuexcluirclienteJu.setText("Excluir Cliente Juridico");
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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
