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
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Leide
 */
public class FormularioRelatorio extends javax.swing.JPanel {

    private SimpleDateFormat sdfAno = new SimpleDateFormat("yyyy");

    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
    Double Janeiro = 0.0;
    Double Fevereiro = 0.0;
    Double Marco = 0.0;
    Double Abril = 0.0;
    Double Maio = 0.0;
    Double Junho = 0.0;
    Double Julho = 0.0;
    Double Agosto = 0.0;
    Double Setembro = 0.0;
    Double Outubro = 0.0;
    Double Novembro = 0.0;
    Double Dezembro = 0.0;
    int produtosVendidos = 0;
    Double lucroReal = 0.0;
    Double lucro = 0.0;
    Double Dispesas = 0.0;
    private List<Venda> lista;

    /**
     * Creates new form FormularioRelatorio
     */
    public FormularioRelatorio() {
        initComponents();
        grafico();
    }

    private void grafico() {
        String ano = sdfAno.format(new Date());
        String mesAno = sdf.format(new Date());
        lista = (List<Venda>) new GenericController().listar(Venda.class);
        int totalProdutos = new GenericController().listar(Produto.class).size();
        int totalClientes = new GenericController().listar(Cliente.class).size();
        int totalVendas = lista.size();
        
        lbClientes.setText(""+totalClientes);
        lbVendas.setText(""+totalVendas);
        lbProdutos.setText(""+totalProdutos);

        for (Venda ve : lista) {
            System.out.println(ve);
            String data = sdf.format(ve.getDataHoraCriacao()!=null?ve.getDataHoraCriacao():new Date());
            
            System.out.println(data);
            System.out.println("Total venda "+ve.getTotalDavenda());
            
            if (data!=null && data.equalsIgnoreCase(mesAno)) {
                produtosVendidos += 1;
                lucro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("01/" + ano)) {
                Janeiro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("02/" + ano)) {
                Fevereiro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("03/" + ano)) {
                Marco += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("04/" + ano)) {
                Abril += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("05/" + ano)) {
                Maio += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("06/" + ano)) {
                Junho += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("07/" + ano)) {
                Julho += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("08/" + ano)) {
                Agosto += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("09/" + ano)) {
                Setembro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("10/" + ano)) {
                Outubro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("11/" + ano)) {
                Novembro += ve.getTotalDavenda();
            }
            if (data!=null && data.equalsIgnoreCase("12/" + ano)) {
                Dezembro += ve.getTotalDavenda();
            }
//          System.out.println(ve.getData().substring(3, 9));  

            System.out.println("Novembro"+Novembro);
        }
        /*  
        lbCarrosVendidos.setText(Integer.toString(CarrosVendidos));
        lbLucroValor.setText(Double.toString(lucro));
        
         */
        //System.out.println(ano+" "+Outubro+" "+"10/"+ano);
        DefaultCategoryDataset barCharData = new DefaultCategoryDataset();
        barCharData.setValue(Janeiro, "Lucro", "Janeiro");
        barCharData.setValue(Fevereiro, "Lucro", "Fevereiro");
        barCharData.setValue(Marco, "Lucro", "Marco");
        barCharData.setValue(Abril, "Lucro", "Abril");
        barCharData.setValue(Maio, "Lucro", "Maio");
        barCharData.setValue(Junho, "Lucro", "Junho");
        barCharData.setValue(Julho, "Lucro", "Julho");
        barCharData.setValue(Agosto, "Lucro", "Agosto");
        barCharData.setValue(Setembro, "Lucro", "Setembro");
        barCharData.setValue(Outubro, "Lucro", "Outubro");
        barCharData.setValue(Novembro, "Lucro", "Novembro");
        barCharData.setValue(Dezembro, "Lucro", "Dezembro");

        JFreeChart barChart = ChartFactory.createBarChart3D("Grafico de Vendas do ano " + ano, "Meses", "Lucro", barCharData, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.orange);

        ChartPanel barPanel = new ChartPanel(barChart);
       
       // panelGrafico.add(barPanel, BorderLayout.CENTER);
        panelGrafico.add(barPanel);
        repaint();
        revalidate();
//        PainelGrafico.add(barPanel);
//        try {
//            
//
//           barPanel.createImage(700, 500);
//            barPanel.doSaveAs();
//          // barPanel.doLayout();
//           barPanel.doCopy();
//        } catch (IOException e) {
//            System.out.println("barPanel error " + e);
//        }
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
        jLabel1 = new javax.swing.JLabel();
        lbProdutos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbClientes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbVendas = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produtos");

        lbProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lbProdutos.setText("09");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ic_save.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbProdutos)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProdutos)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Clientes");

        lbClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        lbClientes.setText("45");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ic_clientes_36dp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbClientes))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(lbClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 204, 51));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vendas");

        lbVendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbVendas.setForeground(new java.awt.Color(255, 255, 255));
        lbVendas.setText("45");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ic_vendas_32dp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbVendas))
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(lbVendas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        panelGrafico.setBackground(new java.awt.Color(0, 204, 204));
        panelGrafico.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbProdutos;
    private javax.swing.JLabel lbVendas;
    private javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
