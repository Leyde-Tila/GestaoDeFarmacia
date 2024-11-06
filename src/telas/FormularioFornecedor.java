/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import DAO.GenericController;
import Model.Fornecedor;
//import Model.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import static telas.Validacao.usuario;

/**
 *
 * @author Leide
 */
public class FormularioFornecedor extends javax.swing.JPanel {

    private Object fornecedor;

    /**
     * Creates new form FormularioCadastroUsuario
     */
    public FormularioFornecedor() {
        initComponents();
        actualizarTabela();
        hint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfEndereço = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNuit = new javax.swing.JTextField();
        tfNib = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();

        btnEditar.setBackground(new java.awt.Color(255, 102, 51));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço");

        jLabel3.setText("Email");

        tfEndereço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEndereçoActionPerformed(evt);
            }
        });
        tfEndereço.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEndereçoKeyPressed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Morada"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel4.setText("NUIT");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(0, 102, 204));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lbNome.setText("Nome");

        jLabel5.setText("NIB");

        jLabel6.setText("Telefone");

        tfNuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNuitActionPerformed(evt);
            }
        });
        tfNuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNuitKeyPressed(evt);
            }
        });

        tfNib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNibActionPerformed(evt);
            }
        });
        tfNib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNibKeyPressed(evt);
            }
        });

        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });
        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereço))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNib)
                            .addComponent(tfNuit)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTelefone)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfNuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfNib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfEndereçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEndereçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEndereçoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        System.out.println("clicado");
        long id = (long) tabela.getValueAt(tabela.getSelectedRow(), 0);

        Fornecedor fornecedor = (Fornecedor) new GenericController().buscaId(Fornecedor.class, id);

        tfNome.setText(fornecedor.getNome());
        tfEndereço.setText(fornecedor.getEndereço());
        tfNib.setText(fornecedor.getNib());
        tfEmail.setText(fornecedor.getEmail());
        tfNuit.setText(fornecedor.getNuit());
        tfTelefone.setText(fornecedor.getTelefone());

    }//GEN-LAST:event_tabelaMouseClicked

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(tfNome.getText());
        fornecedor.setEmail(tfEmail.getText());
        fornecedor.setEndereço(tfEndereço.getText());
        fornecedor.setNib(tfNib.getText());
        fornecedor.setNuit(tfNuit.getText());
        fornecedor.setTelefone(tfTelefone.getText());
  
        
        new GenericController().add(fornecedor);

        actualizarTabela();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
   //     new GenericController().removeFisico(Fornecedor.class, fornecedor.getId());
        actualizarTabela();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
       Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(tfNome.getText());
        fornecedor.setEmail(tfEmail.getText());
        fornecedor.setEndereço(tfEndereço.getText());
        fornecedor.setNib(tfNib.getText());
        fornecedor.setNuit(tfNuit.getText());
        fornecedor.setTelefone(tfTelefone.getText());
  
        new GenericController().atualizarPorId(Fornecedor.class, fornecedor.getId(), fornecedor);

        actualizarTabela();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
        // TODO add your handling code here:
        Validacao.naoAceitarNumeros(evt, tfNome);
        Validacao.proximoFocu(evt, tfEndereço);
       // Validacao.verificarNomeCompleto(tfNome, lbNome);
    }//GEN-LAST:event_tfNomeKeyPressed

    private void tfEndereçoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEndereçoKeyPressed
        // TODO add your handling code here:
        Validacao.proximoFocu(evt, tfEmail);

    }//GEN-LAST:event_tfEndereçoKeyPressed

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailKeyPressed

    private void tfNuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNuitActionPerformed

    private void tfNuitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNuitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNuitKeyPressed

    private void tfNibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNibActionPerformed

    private void tfNibKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNibKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNibKeyPressed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void tfTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneKeyPressed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereço;
    private javax.swing.JTextField tfNib;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNuit;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabela() {

        List<Fornecedor> lista = (List<Fornecedor>) new GenericController().listar(Fornecedor.class);

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setColumnIdentifiers(new String[]{
            "ID", "Nome", "Email", "Endereço", "NUIT", "NIB", "Telefone"
        });
        model.setRowCount(0);

        // Adiciona cada cliente na tabela usando um loop 'for' tradicional
        for (Fornecedor fornecedor : lista) {
            model.addRow(new Object[]{
                fornecedor.getId(), // ID do cliente
                fornecedor.getNome(), // Nome do cliente
                fornecedor.getEmail(), // Telefone do cliente
                fornecedor.getEndereço(), // Telefone do cliente
                fornecedor.getNuit(), // Telefone do cliente
                fornecedor.getNib(), // Telefone do cliente
                fornecedor.getTelefone()// Morada do cliente (endereço)

            });
        }

        tabela.setModel(model);
    }

    private void hint() {
        Validacao.setarHint(tfNome, "ex: Leide Tila");
        Validacao.setarHint(tfEndereço, "ex: leide Tila");
        Validacao.setarHint(tfEmail, "ex: tila123@");

    }
}
