/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import telas.FormularioVendas;
import telas.FormularioProdutos;
import telas.FormularioCadastrarCliente;
import static telas.Validacao.usuario;

/**
 *
 * @author leidetila
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();

        if (Validacao.usuario.getCategoria().equalsIgnoreCase("Administrador")) {
           // titulo.setText("CLIENTE");
           // PainelPrincipal.add(new FormularioCadastrarCliente());
        } else {
           if (Validacao.usuario.getCategoria().equalsIgnoreCase("Supervisor")) {
               // titulo.setText("PRODUTOS");
                btVendas.setVisible(false);
                btClientes.setVisible(false);
                
              // PainelPrincipal.add(new FormularioProdutos());
            } else {
              // titulo.setText("VENDAS");
                btnUsuario.setVisible(false);
                btProdutos.setVisible(false);
                btnFornecedor.setVisible(false);
             //  PainelPrincipal.add(new FormularioVendas());
            }

       }

        titulo.setText("Dashboard");
        PainelPrincipal.add(new FormularioRelatorio());
        
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
        jPanel2 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btVendas = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btClientes1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PainelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        btClientes.setText("Clientes");
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btProdutos.setText("Produtos");
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });

        btVendas.setText("Vendas");
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });

        btnUsuario.setText("Usuarios");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnFornecedor.setText("Fornecedor");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btClientes1.setText("Dashboard");
        btClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientes1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btClientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFornecedor)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        PainelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titulo.setText("CLIENTES");

        javax.swing.GroupLayout PainelTituloLayout = new javax.swing.GroupLayout(PainelTitulo);
        PainelTitulo.setLayout(PainelTituloLayout);
        PainelTituloLayout.setHorizontalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTituloLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelTituloLayout.setVerticalGroup(
            PainelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PainelPrincipal.setBackground(new java.awt.Color(0, 0, 204));
        PainelPrincipal.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane1.setViewportView(PainelPrincipal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(PainelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PainelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        // TODO add your handling code here:
        titulo.setText("CLIENTE");
        titulo.removeAll();
        PainelPrincipal.removeAll();
        PainelPrincipal.add(new FormularioCadastrarCliente());
        this.repaint();
        this.revalidate();

    }//GEN-LAST:event_btClientesActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        // TODO add your handling code here:
        titulo.setText("PRODUTOS");
        titulo.removeAll();
        PainelPrincipal.removeAll();
        PainelPrincipal.add(new FormularioProdutos());
        this.repaint();
        this.revalidate();

    }//GEN-LAST:event_btProdutosActionPerformed

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
        // TODO add your handling code here:
        titulo.setText("VENDAS");
        titulo.removeAll();
        PainelPrincipal.removeAll();
        PainelPrincipal.add(new FormularioVendas());
        this.repaint();
        this.revalidate();

    }//GEN-LAST:event_btVendasActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
        titulo.setText("USUARIOS");
        titulo.removeAll();
        PainelPrincipal.removeAll();
        PainelPrincipal.add(new FormularioCadastroUsuario());
        this.repaint();
        this.revalidate();


    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        // TODO add your handling code here:
        titulo.setText("Fornecedor");
        titulo.removeAll();
        PainelPrincipal.removeAll();
        PainelPrincipal.add(new FormularioFornecedor());
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientes1ActionPerformed
        // TODO add your handling code here:
        PainelPrincipal.removeAll();
          titulo.setText("Dashboard");
        PainelPrincipal.add(new FormularioRelatorio());
         this.repaint();
        this.revalidate();
    }//GEN-LAST:event_btClientes1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btClientes1;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btVendas;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
