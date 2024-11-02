/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import DAO.GenericController;
import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import Model.Venda;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leidetila
 */
public class FormularioVendas extends javax.swing.JPanel {

    List<Produto> produtosSelecionados = new ArrayList<Produto>();

    Cliente selectedCliente;

    /**
     * Creates new form FormularioVendas
     */
    public FormularioVendas() {
        initComponents();
        actualizarTabelaProduto();
        actualizarTabelaCliente();
        actualizarTabelaProdutosSelecionados();

        placeHolder();
    }

    private void placeHolder() {
        Validacao.setarHint(tfPesquisarCliente, "Pesquisar Cliente");
        Validacao.setarHint(tfPesquisarProduto, "Pesquisar Produto");

    }

    private void actualizarTabelaProduto() {

        List<Produto> lista = (List<Produto>) new GenericController().listar(Produto.class);

        DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
        model.setColumnIdentifiers(new String[]{
            "ID", "Nome", "Categoria", "Quantidade", "Fornecedor", "Data Entrada", "Data Vencimento", "Preço"
        });
        model.setRowCount(0);

        // Adiciona cada cliente na tabela usando um loop 'for' tradicional
        for (Produto produto : lista) {
            if (produto.getNome().toLowerCase().startsWith(tfPesquisarProduto.getText().toLowerCase())
                    || tfPesquisarProduto.getText().equalsIgnoreCase("Pesquisar Produto")) {
                model.addRow(new Object[]{
                    produto.getId(), // ID do cliente
                    produto.getNome(), // Nome do cliente
                    produto.getCategoria(),
                    produto.getQuantidade(), // Telefone do cliente
                    produto.getFornecedor(), // Morada do cliente (endereço)
                    produto.getDataDeEntrada(),
                    produto.getDataDeVencimento(),
                    produto.getPreco(),});
            }
        }

        tabelaProduto.setModel(model);

    }

    private void actualizarTabelaProdutosSelecionados() {

        DefaultTableModel model = (DefaultTableModel) tabelaProdutosSeleccionados.getModel();
        model.setColumnIdentifiers(new String[]{
            "ID", "Nome", "Q. Disponivel", "Q. Pretendida", "Data Vencimento", "Preço"
        });
        model.setRowCount(0);

        // Adiciona cada cliente na tabela usando um loop 'for' tradicional
        for (Produto produto : produtosSelecionados) {

            model.addRow(new Object[]{
                produto.getId(), // ID do cliente
                produto.getNome(), // Nome do cliente
                produto.getQuantidade(), // Telefone do cliente
                1, // Morada do cliente (endereço)
                produto.getDataDeVencimento(),
                produto.getPreco(),});
        }

        tabelaProdutosSeleccionados.setModel(model);

        setQuantidade();

    }

    private void setQuantidade() {
        int linhas = tabelaProdutosSeleccionados.getRowCount();
        int quantidade = 0;
        double total = 0;
        double iva = 0;
        double totalIva = 0;

        for (int i = 0; i < linhas; i++) {
            quantidade += Integer.parseInt(tabelaProdutosSeleccionados.getValueAt(i, 3).toString());

            total += (Integer.parseInt(tabelaProdutosSeleccionados.getValueAt(i, 3).toString())
                    * Double.parseDouble(tabelaProdutosSeleccionados.getValueAt(i, 5).toString()));
        }

        tfQuantidade.setText(quantidade + "");
        lbTotalSemIva.setText(total + "");
        lbIva.setText((total * 0.16) + "");
        lbTotal.setText(total * 1.16 + "");

    }

    private void actualizarTabelaCliente() {

        List<Cliente> lista = (List<Cliente>) new GenericController().listar(Cliente.class);

        DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
        model.setColumnIdentifiers(new String[]{
            "ID", "Nome", "Telefone", "Morada"
        });
        model.setRowCount(0);

        // Adiciona cada cliente na tabela usando um loop 'for' tradicional
        for (Cliente cliente : lista) {
            if (cliente.getNome().toLowerCase().startsWith(tfPesquisarCliente.getText().toLowerCase())
                    || tfPesquisarCliente.getText().equalsIgnoreCase("Pesquisar Cliente")) {

                model.addRow(new Object[]{
                    cliente.getId(), // ID do cliente
                    cliente.getNome(), // Nome do cliente
                    cliente.getTelefone(), // Telefone do cliente
                    cliente.getMorada() // Morada do cliente (endereço)
                });
            }
        }

        tabelaCliente.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        tfQuantidade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        tfPesquisarProduto = new javax.swing.JTextField();
        tfPesquisarCliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProdutosSeleccionados = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btVender = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbTotalSemIva = new javax.swing.JLabel();
        lbIva = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout());

        jLabel3.setText("Quantidade");

        jLabel1.setText("Total sem IVA");

        jLabel6.setText("Total");

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);

        tfQuantidade.setEditable(false);
        tfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeActionPerformed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaCliente);

        tfPesquisarProduto.setText("Pesquisar produto");
        tfPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarProdutoActionPerformed(evt);
            }
        });
        tfPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarProdutoKeyReleased(evt);
            }
        });

        tfPesquisarCliente.setText("Pesquisar cliente");
        tfPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarClienteActionPerformed(evt);
            }
        });
        tfPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarClienteKeyReleased(evt);
            }
        });

        tabelaProdutosSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Descrição", "Q. diponivel", "Q. pretendida"
            }
        ));
        tabelaProdutosSeleccionados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaProdutosSeleccionadosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaProdutosSeleccionadosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProdutosSeleccionados);

        jLabel7.setText("Produtos selecionados");

        lbTotal.setText("Valor Total");

        btVender.setBackground(new java.awt.Color(0, 153, 255));
        btVender.setForeground(new java.awt.Color(255, 255, 255));
        btVender.setText("Vender");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbTotalSemIva.setText("Valor Total");

        lbIva.setText("Valor Total");

        jLabel2.setText("IVA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbTotalSemIva)
                                                .addComponent(lbTotal))
                                            .addComponent(lbIva))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lbIva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTotalSemIva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTotal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addGap(24, 24, 24)))
                .addComponent(tfPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        jPanel1.add(jPanel4);

        jTabbedPane1.addTab("Nova Venda", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista", jPanel3);

        add(jTabbedPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void tfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantidadeActionPerformed

    private void tfPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarProdutoActionPerformed

    private void tfPesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarProdutoKeyReleased
        // TODO add your handling code here:

        actualizarTabelaProduto();
    }//GEN-LAST:event_tfPesquisarProdutoKeyReleased

    private void tfPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarClienteActionPerformed

    private void tfPesquisarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarClienteKeyReleased

        // TODO add your handling code here:
        actualizarTabelaCliente();
    }//GEN-LAST:event_tfPesquisarClienteKeyReleased

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        // TODO add your handling code here:
//        int selectedRow = tabelaProduto.getSelectedRow();
//
//        Produto selectedProduto = new Produto();
//        selectedProduto.setId(Long.parseLong(tabelaProduto.getValueAt(selectedRow, 0).toString()));
//        selectedProduto.setQuantidade(Integer.parseInt(tabelaProduto.getValueAt(selectedRow, 3).toString()));
//        selectedProduto.setNome(tabelaProduto.getValueAt(selectedRow, 1).toString());

        long id = (long) tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0);

        Produto selectedProduto = (Produto) new GenericController().buscaId(Produto.class, id);

        boolean naoContem = true;
        for (Produto produtoSelecionado : produtosSelecionados) {
            if (produtoSelecionado.getId() == selectedProduto.getId()) {
                naoContem = false;
            }
        }

        if (naoContem) {
            produtosSelecionados.add(selectedProduto);
            actualizarTabelaProdutosSelecionados();
        }
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void tabelaProdutosSeleccionadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutosSeleccionadosKeyPressed
        // TODO add your handling code here:
        int selectedRow = tabelaProdutosSeleccionados.getSelectedRow();

    }//GEN-LAST:event_tabelaProdutosSeleccionadosKeyPressed

    private void tabelaProdutosSeleccionadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutosSeleccionadosKeyReleased
        // TODO add your handling code here:
        setQuantidade();
    }//GEN-LAST:event_tabelaProdutosSeleccionadosKeyReleased

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        produtosSelecionados = new ArrayList<Produto>();
        actualizarTabelaProdutosSelecionados();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        // TODO add your handling code here:
        int linhas = tabelaProdutosSeleccionados.getRowCount();
        Date dataVenda = new Date();

        for (int i = 0; i < linhas; i++) {
            int quantidade = Integer.valueOf(tabelaProdutosSeleccionados.getValueAt(i, 3).toString());

            Double total = (Integer.parseInt(tabelaProdutosSeleccionados.getValueAt(i, 3).toString())
                    * Double.parseDouble(tabelaProdutosSeleccionados.getValueAt(i, 5).toString()));


            
            //Seleccionar Produto
            long id = (long) tabelaProdutosSeleccionados.getValueAt(i, 0);
            Produto selectedProduto = (Produto) new GenericController().buscaId(Produto.class, id);
            
            //Instanciar a Venda
            Venda venda = new Venda();
            
            venda.setCliente(selectedCliente);
            //venda.setUsuario(new Usuario());
            venda.setProduto(selectedProduto);
            venda.setTotalDavenda(total);
            venda.setQuantidade(quantidade);
            venda.setDataHoraCriacao(dataVenda);

            new GenericController().add(venda);
            
           

        }
    }//GEN-LAST:event_btVenderActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        // TODO add your handling code here:

        long id = (long) tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0);

        selectedCliente = (Cliente) new GenericController().buscaId(Cliente.class, id);
    }//GEN-LAST:event_tabelaClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTotalSemIva;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaProdutosSeleccionados;
    private javax.swing.JTextField tfPesquisarCliente;
    private javax.swing.JTextField tfPesquisarProduto;
    private javax.swing.JTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}
