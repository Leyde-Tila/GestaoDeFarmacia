/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import DAO.GenericController;
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

        for (Venda ve : lista) {
            System.out.println(ve);
            String data = sdf.format(ve.getDataHoraCriacao()!=null?ve.getDataHoraCriacao():new Date());
            System.out.println(data);
            
            if (data!=null && data.substring(3, 10).equalsIgnoreCase(mesAno)) {
                produtosVendidos += 1;
                lucro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("01/" + ano)) {
                Janeiro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("02/" + ano)) {
                Fevereiro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("03/" + ano)) {
                Marco += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("04/" + ano)) {
                Abril += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("05/" + ano)) {
                Maio += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("06/" + ano)) {
                Junho += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("07/" + ano)) {
                Julho += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("08/" + ano)) {
                Agosto += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("09/" + ano)) {
                Setembro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("10/" + ano)) {
                Outubro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("11/" + ano)) {
                Novembro += ve.getTotalDavenda();
            }
            if (data!=null && data.substring(3, 10).equalsIgnoreCase("12/" + ano)) {
                Dezembro += ve.getTotalDavenda();
            }
//          System.out.println(ve.getData().substring(3, 9));  
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
        panelGrafico.add(barPanel, BorderLayout.CENTER);
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
        panelGrafico = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelGrafico.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout panelGraficoLayout = new javax.swing.GroupLayout(panelGrafico);
        panelGrafico.setLayout(panelGraficoLayout);
        panelGraficoLayout.setHorizontalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficoLayout.setVerticalGroup(
            panelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

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
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGrafico;
    // End of variables declaration//GEN-END:variables
}
