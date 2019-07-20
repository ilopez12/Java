package semestraldesarrollo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author artur
 */
public class ReporteVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReporteVendedor
     */
    public ReporteVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        JRB_apellido = new javax.swing.JRadioButton();
        JRB_codigo = new javax.swing.JRadioButton();
        JRB_departamento = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Reporte de Vendedor");
        setToolTipText("");

        jLabel1.setText("Seleccione una opcion:");

        buttonGroup1.add(JRB_apellido);
        JRB_apellido.setText("Ordenar por apellido");

        buttonGroup1.add(JRB_codigo);
        JRB_codigo.setText("Ordenar por codigo");

        buttonGroup1.add(JRB_departamento);
        JRB_departamento.setText("Ordenar por departamento");

        jButton1.setText("GENRAR REPORTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(JRB_departamento)
                    .addComponent(JRB_codigo)
                    .addComponent(JRB_apellido))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(JRB_apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRB_departamento)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String URL = "jdbc:mysql://localhost:3306/semestral";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            JasperReport reporteC =(JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\artur\\Documents\\NetBeansProjects\\ProyectoNo3\\src\\Vendedor.jasper");
             Map <String,Object> parametro = new HashMap <String,Object>();
            if(JRB_apellido.isSelected()){
                parametro.put("OrdenarPor","APELLIDO");
                JasperPrint j = JasperFillManager.fillReport(reporteC,parametro,con);
                JasperViewer jv = new JasperViewer(j,false);
                jv.setTitle("Reporte Cliente por Apellido");
                jv.setVisible(true);
            }else if(JRB_codigo.isSelected()){
                parametro.put("OrdenarPor","CODIGo");
                JasperPrint j = JasperFillManager.fillReport(reporteC,parametro,con);
                JasperViewer jv = new JasperViewer(j,false);
                jv.setTitle("Reporte Cliente por Cedula");
                jv.setVisible(true);
            }else if(JRB_departamento.isSelected()){
                parametro.put("OrdenarPor","DEPARTAMENTO");
                JasperPrint j = JasperFillManager.fillReport(reporteC,parametro,con);
                JasperViewer jv = new JasperViewer(j,false);
                jv.setTitle("Reporte Cliente por Compra Anual");
                jv.setVisible(true);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al mostrar reporte cliente: "+e);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRB_apellido;
    private javax.swing.JRadioButton JRB_codigo;
    private javax.swing.JRadioButton JRB_departamento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}