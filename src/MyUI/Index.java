package MyUI;
import java.util.ArrayList;

public class Index extends javax.swing.JFrame {

    Banco banco = new Banco();
    
    public Index() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelP = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        txt_Dinheiro = new javax.swing.JLabel();
        txt_DinheiroMes = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        bt_Salvar = new javax.swing.JMenuItem();
        bt_Carregar = new javax.swing.JMenuItem();
        bt_Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bt_Jogadores = new javax.swing.JMenuItem();
        bt_FolhadePagamento = new javax.swing.JMenuItem();
        bt_DemitirJogador = new javax.swing.JMenuItem();
        bt_Financeiro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bt_CompradeJogadores = new javax.swing.JMenuItem();
        bt_VendadeJogadores = new javax.swing.JMenuItem();
        bt_CadastrodeJogadores = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelP.setBackground(new java.awt.Color(204, 255, 255));
        PainelP.setToolTipText("");

        txt_Dinheiro.setText("Dinheiro:");

        txt_DinheiroMes.setText("+/Mês:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Dinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_DinheiroMes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_Dinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_DinheiroMes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelP.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelPLayout = new javax.swing.GroupLayout(PainelP);
        PainelP.setLayout(PainelPLayout);
        PainelPLayout.setHorizontalGroup(
            PainelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPLayout.createSequentialGroup()
                .addGap(0, 610, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelPLayout.setVerticalGroup(
            PainelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUI/Imagens/icons8-abrir-pasta-50.png"))); // NOI18N
        jMenu1.setText("Arquivo");
        jMenu1.setMaximumSize(new java.awt.Dimension(100, 200));
        jMenu1.setPreferredSize(new java.awt.Dimension(120, 50));

        bt_Salvar.setText("Salvar");
        bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalvarActionPerformed(evt);
            }
        });
        jMenu1.add(bt_Salvar);

        bt_Carregar.setText("Carregar");
        jMenu1.add(bt_Carregar);

        bt_Sair.setText("Sair");
        bt_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SairActionPerformed(evt);
            }
        });
        jMenu1.add(bt_Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUI/Imagens/icons8-futebol-50 (1).png"))); // NOI18N
        jMenu2.setText("Clube");
        jMenu2.setRequestFocusEnabled(false);
        jMenu2.setRolloverEnabled(false);

        bt_Jogadores.setText("Jogadores");
        bt_Jogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_JogadoresActionPerformed(evt);
            }
        });
        jMenu2.add(bt_Jogadores);

        bt_FolhadePagamento.setText("Folha de Pagamento");
        bt_FolhadePagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FolhadePagamentoActionPerformed(evt);
            }
        });
        jMenu2.add(bt_FolhadePagamento);

        bt_DemitirJogador.setText("Demitir Jogador");
        bt_DemitirJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DemitirJogadorActionPerformed(evt);
            }
        });
        jMenu2.add(bt_DemitirJogador);

        bt_Financeiro.setText("Financeiro");
        bt_Financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FinanceiroActionPerformed(evt);
            }
        });
        jMenu2.add(bt_Financeiro);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUI/Imagens/icons8-vender-estoque-50.png"))); // NOI18N
        jMenu3.setText("Mercado");

        bt_CompradeJogadores.setText("Comprar Jogadores");
        bt_CompradeJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CompradeJogadoresActionPerformed(evt);
            }
        });
        jMenu3.add(bt_CompradeJogadores);

        bt_VendadeJogadores.setText("Vender Jogadores");
        bt_VendadeJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_VendadeJogadoresActionPerformed(evt);
            }
        });
        jMenu3.add(bt_VendadeJogadores);

        jMenuBar1.add(jMenu3);

        bt_CadastrodeJogadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MyUI/Imagens/icons8-adicionar-usuário-masculino-50.png"))); // NOI18N
        bt_CadastrodeJogadores.setText("Cadastro");

        jMenuItem5.setText("Cadastro de Jogadores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        bt_CadastrodeJogadores.add(jMenuItem5);

        jMenuBar1.add(bt_CadastrodeJogadores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelP)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelP)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SalvarActionPerformed

    private void bt_FolhadePagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FolhadePagamentoActionPerformed
        Clube_FolhaDePagamento temp = new Clube_FolhaDePagamento();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_bt_FolhadePagamentoActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Cadastro_CadastroDeJogadores temp = new Cadastro_CadastroDeJogadores();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void bt_CompradeJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CompradeJogadoresActionPerformed
        Mercado_ComprarJogadores temp = new Mercado_ComprarJogadores();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_bt_CompradeJogadoresActionPerformed

    private void bt_VendadeJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_VendadeJogadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_VendadeJogadoresActionPerformed

    private void bt_DemitirJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DemitirJogadorActionPerformed
        Clube_DemitirJogador temp = new Clube_DemitirJogador();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_bt_DemitirJogadorActionPerformed

    private void bt_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SairActionPerformed

    private void bt_JogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_JogadoresActionPerformed
        Clube_Jogadores temp = new Clube_Jogadores();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_bt_JogadoresActionPerformed

    private void bt_FinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FinanceiroActionPerformed
        Clube_Financeiro temp = new Clube_Financeiro();
        PainelP.add(temp);
        temp.setVisible(true);
    }//GEN-LAST:event_bt_FinanceiroActionPerformed

    public static void main(String args[]) {
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PainelP;
    private javax.swing.JMenu bt_CadastrodeJogadores;
    private javax.swing.JMenuItem bt_Carregar;
    private javax.swing.JMenuItem bt_CompradeJogadores;
    private javax.swing.JMenuItem bt_DemitirJogador;
    private javax.swing.JMenuItem bt_Financeiro;
    private javax.swing.JMenuItem bt_FolhadePagamento;
    private javax.swing.JMenuItem bt_Jogadores;
    private javax.swing.JMenuItem bt_Sair;
    private javax.swing.JMenuItem bt_Salvar;
    private javax.swing.JMenuItem bt_VendadeJogadores;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_Dinheiro;
    private javax.swing.JLabel txt_DinheiroMes;
    // End of variables declaration//GEN-END:variables
}
