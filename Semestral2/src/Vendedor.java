package semestraldesarrollo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Vendedor extends javax.swing.JInternalFrame {
        ResultSet rsC; 
    String URL, user, pass;
    Statement stmt,stmtCBX;
    
    
    public Vendedor () {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        cbx_departamento = new javax.swing.JComboBox<>();
        txt_cargo = new javax.swing.JTextField();
        txt_Vmensual = new javax.swing.JTextField();
        txt_Vanual = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        tf_busq = new javax.swing.JTextField();
        btn_inab = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Vendedor");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Departamento");

        jLabel5.setText("Cargo");

        jLabel6.setText("Venta Mensual");

        jLabel7.setText("Venta Anual");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_inab.setText("Busqueda");
        btn_inab.setToolTipText("");
        btn_inab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(jLabel5))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_Vmensual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_cargo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_departamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 126, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_Vanual, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txt_codigo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(181, 181, 181)
                                    .addComponent(tf_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_buscar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(71, 71, 71)
                        .addComponent(btn_inab)))
                .addGap(829, 829, 829))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_inab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tf_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Vmensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txt_Vanual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT a.CODIGO, a.NOMBRE, a.APELLIDO, b.DEPARTAMENTO, a.CARGO, a.VENTAMENSUAL AS 'VENTA MES', a.VENTAANUAL AS 'VENTA ANUAL' FROM vendedor a, departamento b ");
                    
            ResultSetMetaData rsCMD = rsC.getMetaData();
           //int NumColC = rsCMD.getColumnCount();
   
            rsC.close();
        }
        catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public void cargarCBX(){
        try{
           URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conCBX = DriverManager.getConnection(URL,user,pass);
            stmtCBX = conCBX.createStatement();
            ResultSet rsCBX = stmtCBX.executeQuery("SELECT DEPARTAMENTO FROM departamento");
            
            while (rsCBX.next())
            {
                cbx_departamento.addItem(rsCBX.getString(1));
            }
            rsCBX.close();
        }
       catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public void buscarBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT a.CODIGO, a.NOMBRE, a.APELLIDO, b.DEPARTAMENTO, a.CARGO, a.VENTAMENSUAL, a.VENTAANUAL FROM vendedor a, departamento b WHERE a.CODIGO = '"+txt_codigo.getText()+"' AND a.departamento = b.ID");
            
            
            if(rsC.next()){
                txt_codigo.setText(rsC.getString("CODIGO"));
                txt_nombre.setText(rsC.getString("NOMBRE"));
                txt_apellido.setText(rsC.getString("APELLIDO"));
                cbx_departamento.setSelectedItem(rsC.getString("DEPARTAMENTO"));
                txt_cargo.setText(rsC.getString("CARGO"));
                txt_Vmensual.setText(rsC.getString("VENTAMENSUAL"));
                txt_Vanual.setText(rsC.getString("VENTAANUAL"));
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro, puede agragarlo si desea");
                btn_eliminar.setEnabled(false);
                btn_modificar.setEnabled(false);
            }
            rsC.close();
        }
         catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null,"No se encontro el registro " + se);
            se.printStackTrace();
        }
    }
    
    public void addBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT NOMBRE, APELLIDO FROM vendedor WHERE NOMBRE = '"+txt_nombre.getText()+"' AND APELLIDO = '"+txt_apellido.getText()+"'");
            
            if(rsC.next()){
                JOptionPane.showMessageDialog(null,"El registro con esta codigo ya existe, puede borrarlo o modificarlo");
                btn_agregar.setEnabled(false);
            }
            else{
                stmt.executeUpdate("INSERT INTO vendedor (`CODIGO`, `NOMBRE`, `APELLIDO`, `departamento`, `CARGO`, `VENTAMENSUAL`, `VENTAANUAL`) VALUES ('"+txt_codigo.getText()+"', '"+txt_nombre.getText()+"', '"+txt_apellido.getText()+"', '"+String.valueOf(cbx_departamento.getSelectedIndex()+1)+"', '"+txt_cargo.getText()+"', '"+txt_Vmensual.getText()+"', '"+txt_Vanual.getText()+"')");
                cargarBD();
            }
            rsC.close();
        }
        catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){JOptionPane.showMessageDialog(null,"Vendedor Agregado");
            se.printStackTrace();
            JOptionPane.showMessageDialog(null,"No se aceptan campos vacios" + se);
        }
    }
    
    public void eliminarBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM vendedor WHERE vendedor.codigo = '"+txt_codigo.getText()+"'");
            cargarBD();
            btn_agregar.setEnabled(true);
            
        }
        catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
    }
    
    public void modificarBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE vendedor "
                +"SET NOMBRE = '"+txt_nombre.getText()+"', APELLIDO = '"+txt_apellido.getText()+"' ,departamento = '"+(cbx_departamento.getSelectedIndex()+1)+"'"
                +", CARGO = '"+txt_cargo.getText()+"',VENTAMENSUAL = '"+txt_Vmensual.getText()+"'"
                +", VENTAANUAL = '"+txt_Vanual.getText()+"' "
                +"WHERE CODIGO = '"+tf_busq.getText()+"'");
            
        }
        catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
            JOptionPane.showMessageDialog(null,"No se aceptan campos vacios" + se);
        }
    }
    
    public void buscar()
    {
    System.out.print("Entra al metodo buscar");
    
         try{   
            
         URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT * FROM vendedor WHERE codigo = '"+tf_busq.getText().toString()+"'");
            System.out.print(rsC);
            System.out.print("Realiza la busqueda");
            if(rsC.next()){
                System.out.print("Entro al If");
                txt_codigo.setText(rsC.getString("codigo"));
                txt_nombre.setText(rsC.getString("nombre"));
                txt_apellido.setText(rsC.getString("apellido"));
                txt_cargo.setText(rsC.getString("cargo"));
                cbx_departamento.setSelectedItem(rsC.getString("Departamento"));
                txt_Vmensual.setText(rsC.getString("ventamensual"));
                txt_Vanual.setText(rsC.getString("ventaanual"));
                //Activando los Campos
                txt_codigo.setEnabled(true);
                txt_nombre.setEnabled(true);
                txt_apellido.setEnabled(true);
                txt_cargo.setEnabled(true);
                tf_busq.setEnabled(false);
                cbx_departamento.setEnabled(true);
                txt_Vmensual.setEnabled(true);
                txt_Vanual.setEnabled(true);
                btn_eliminar.setEnabled(true);
                btn_modificar.setEnabled(true);
                btn_agregar.setEnabled(false);
                btn_buscar.setEnabled(false);
                btn_inab.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro el registro, puede agragarlo si desea");
                btn_eliminar.setEnabled(false);
                btn_modificar.setEnabled(false);
                btn_agregar.setEnabled(true);
                btn_buscar.setEnabled(true);
            }
            rsC.close();
        }
         catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null,"No se encontro el registro " + se);
        }
    }
    
    public void limpiar()
    {
                txt_codigo.setText(null);
                txt_nombre.setText(null);
                txt_apellido.setText(null);
                txt_cargo.setText(null);
               // cbx_provincia.setText(null);
                txt_Vmensual.setText(null);
                txt_Vanual.setText(null);
                tf_busq.setText(null);
    }
    
    public void HabilitarCampos()
    {
                txt_codigo.setEnabled(false);
                txt_nombre.setEnabled(false);
                txt_apellido.setEnabled(false);
                txt_cargo.setEnabled(false);
                cbx_departamento.setEnabled(false);
                txt_Vmensual.setEnabled(false);
                txt_Vanual.setEnabled(false);
                tf_busq.setEnabled(true);
                btn_eliminar.setEnabled(false);
                btn_modificar.setEnabled(false);
                btn_agregar.setEnabled(false);
                btn_buscar.setEnabled(true);
                btn_inab.setEnabled(false);
    }
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        modificarBD();
        cargarBD();
        btn_agregar.setEnabled(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        addBD();
        btn_eliminar.setEnabled(true);
        btn_modificar.setEnabled(true);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarBD();
        cargarCBX();
        limpiar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code her
        limpiar();
        cargarCBX();
        txt_codigo.setEnabled(true);
        txt_nombre.setEnabled(true);
        txt_apellido.setEnabled(true);
        txt_Vmensual.setEnabled(true);
        cbx_departamento.setEnabled(true);
        txt_Vanual.setEnabled(true);
        txt_cargo.setEnabled(true);
        tf_busq.setEnabled(false);
        btn_eliminar.setEnabled(false);
        btn_modificar.setEnabled(false);
        btn_agregar.setEnabled(true);
        btn_buscar.setEnabled(false);
        btn_inab.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_inabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inabActionPerformed
        // TODO add your handling code here:
        limpiar();
        HabilitarCampos();
    }//GEN-LAST:event_btn_inabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_inab;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cbx_departamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf_busq;
    private javax.swing.JTextField txt_Vanual;
    private javax.swing.JTextField txt_Vmensual;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cargo;
    public javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
