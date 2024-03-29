                                                                                                                                            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ControllerUsuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;
import util.Formatador;

/**
 *
 * @author Cliente
 */
public class viewUsuario extends javax.swing.JFrame {

    ArrayList<ModelUsuario> listaModelUsuario = new ArrayList<>();

    ControllerUsuario controllerModelUsuario = new ControllerUsuario();

    ModelUsuario modelUsuario = new ModelUsuario();
    String salvarAlterar = "salvar";
    Formatador formatador = new Formatador();

    /**
     * Creates new form viewUsuario
     */
    public viewUsuario() {
        initComponents();
        carregarNaTabelaNome();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario_codigo = new javax.swing.JTextField();
        usuario_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usuario_login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usuario_senha = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_usuario = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        usuario_senha_confirmar = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        usuario_codigo.setEnabled(false);

        usuario_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_nomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Login:");

        jLabel4.setText("Senha:");

        tabela_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_usuario);
        if (tabela_usuario.getColumnModel().getColumnCount() > 0) {
            tabela_usuario.getColumnModel().getColumn(0).setMinWidth(60);
            tabela_usuario.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabela_usuario.getColumnModel().getColumn(0).setMaxWidth(60);
            tabela_usuario.getColumnModel().getColumn(1).setMinWidth(220);
            tabela_usuario.getColumnModel().getColumn(1).setPreferredWidth(220);
            tabela_usuario.getColumnModel().getColumn(1).setMaxWidth(220);
        }

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\vendas\\src\\imagens\\cancel.png")); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\vendas\\src\\imagens\\delete1.png")); // NOI18N
        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\vendas\\src\\imagens\\ediit.png")); // NOI18N
        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\vendas\\src\\imagens\\upload.png")); // NOI18N
        jButton7.setText("Novo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\vendas\\src\\imagens\\save.png")); // NOI18N
        jButton9.setText("Salvar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirmar Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuario_senha_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(usuario_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usuario_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(usuario_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_senha_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_nomeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitar(false);
        this.limparTela();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        modelUsuario = new ModelUsuario();
        int linha = tabela_usuario.getSelectedRow();

        if (linha < 0) {
            JOptionPane.showMessageDialog(this, "Selecione algum nome na tabela", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {

            int certeza = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o usuário?");
            if (certeza == JOptionPane.OK_OPTION) {

                int codigo = (int) tabela_usuario.getValueAt(linha, 0);
                controllerModelUsuario.excluirUsuarioController(codigo);
                JOptionPane.showMessageDialog(this, "Excluido com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }
            this.carregarNaTabelaNome();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        salvarAlterar = "alterar";
        habilitarDesabilitar(true);
        // TODO add your handling code here:
        int linha = this.tabela_usuario.getSelectedRow();

        try {
            int codigo = (int) tabela_usuario.getValueAt(linha, 0);
            modelUsuario = controllerModelUsuario.getUsuarioController(codigo);
            usuario_codigo.setText(String.valueOf(modelUsuario.getIdUsuario()));
            usuario_nome.setText(modelUsuario.getUsuNome());
            usuario_login.setText(String.valueOf(modelUsuario.getUsoLogin()));
            usuario_senha.setText(String.valueOf(modelUsuario.getUsoSenha()));
            usuario_senha_confirmar.setText(String.valueOf(modelUsuario.getUsoSenha()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nem um registro selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.habilitarDesabilitar(true);
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        if (new String(usuario_senha.getPassword()).equals(new String(usuario_senha_confirmar.getPassword()))) {
            if (salvarAlterar.equals("salvar")) {
                salvarUsuario();
            } else if (salvarAlterar.equals("alterar")) {
                alterarUsuario();
            }
        } else {
            JOptionPane.showMessageDialog(this, "As senhas são diferentes, Tente novamento!", "Aviso", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_usuario;
    private javax.swing.JTextField usuario_codigo;
    private javax.swing.JTextField usuario_login;
    private javax.swing.JTextField usuario_nome;
    private javax.swing.JPasswordField usuario_senha;
    private javax.swing.JPasswordField usuario_senha_confirmar;
    // End of variables declaration//GEN-END:variables

    private void habilitarDesabilitar(boolean codicao) {
        usuario_nome.setEnabled(codicao);
        usuario_login.setEnabled(codicao);
        usuario_senha.setEnabled(codicao);

    }

    private void limparTela() {
        usuario_codigo.setText("");
        usuario_nome.setText("");
        usuario_login.setText("");
        usuario_senha.setText("");
        usuario_senha_confirmar.setText("");
    }

    private void salvarUsuario() {
        modelUsuario.setUsuNome(this.usuario_nome.getText());
        modelUsuario.setUsoLogin(this.usuario_login.getText());
        modelUsuario.setUsoSenha(new String(this.usuario_senha.getPassword()));

        if (controllerModelUsuario.salvarUsuarioController(modelUsuario) > 0) {
            JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            this.carregarNaTabelaNome();
            this.limparTela();
            this.habilitarDesabilitar(false);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void alterarUsuario() {
        try {
            modelUsuario.setIdUsuario(Integer.valueOf(this.usuario_codigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelUsuario.setUsuNome(this.usuario_nome.getText());
        modelUsuario.setUsoLogin(this.usuario_login.getText());
        modelUsuario.setUsoSenha(new String(this.usuario_senha.getPassword()));

        if (controllerModelUsuario.atualizarUsuarioController(modelUsuario)) {
            JOptionPane.showMessageDialog(this, "Usuário Alterado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            this.carregarNaTabelaNome();
            this.limparTela();
            this.habilitarDesabilitar(false);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar o usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void carregarNaTabelaNome() {
        listaModelUsuario = new ArrayList<ModelUsuario>();
        modelUsuario = new ModelUsuario();
        listaModelUsuario = controllerModelUsuario.getListaUsuarioController();

        // modelo para tabela
        DefaultTableModel model = (DefaultTableModel) tabela_usuario.getModel();
        model.setRowCount(0);

        for (int i = 0; i < listaModelUsuario.size(); i++) {
            model.addRow(new Object[]{listaModelUsuario.get(i).getIdUsuario(),
                listaModelUsuario.get(i).getUsuNome(),
                listaModelUsuario.get(i).getUsoLogin()

            });
        }
    }
}
