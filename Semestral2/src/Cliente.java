package semestraldesarrollo;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Cliente extends javax.swing.JInternalFrame {
   String URL, user, pass;
   Connection con;
   Statement stmt,stmtCBX;
   ResultSet rsC;
   
    public Cliente() {
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
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_compra = new javax.swing.JTextField();
        cbx_provincia = new javax.swing.JComboBox<>();
        btn_agregar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        tf_busq = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_inab = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setForeground(new java.awt.Color(204, 204, 204));
        setMaximizable(true);
        setResizable(true);
        setTitle("Cliente");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula");

        jLabel4.setText("Direccion");

        jLabel5.setText("Telefono");

        jLabel6.setText("Provincia");

        jLabel7.setText("Compra Anual");

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

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_nuevo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_direccion)
                        .addComponent(txt_telefono)
                        .addComponent(txt_compra)
                        .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_agregar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_modificar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_inab)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar)))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_inab))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
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
            ResultSet rsC = stmt.executeQuery("SELECT a.NOMBRE, a.APELLIDO, a.CEDULA, a.DIRECCION, a.TELEFONO, b.PROVINCIA, a.compraAnual FROM cliente a, provincia b");
            
            ResultSetMetaData rsCMD = rsC.getMetaData();
            
            int NumColC = rsCMD.getColumnCount();

            rsC.close();
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
            ResultSet rsC = stmt.executeQuery("SELECT a.NOMBRE, a.APELLIDO, a.CEDULA, a.DIRECCION, a.TELEFONO, b.PROVINCIA, a.compraAnual FROM cliente a, provincia b WHERE a.CEDULA = '"+txt_cedula.getText()+"'");
            
            
            if(rsC.next()){
                txt_nombre.setText(rsC.getString("NOMBRE"));
                txt_apellido.setText(rsC.getString("APELLIDO"));
                txt_cedula.setText(rsC.getString("CEDULA"));
                txt_direccion.setText(rsC.getString("DIRECCION"));
                txt_telefono.setText(rsC.getString("TELEFONO"));
                cbx_provincia.setSelectedItem(rsC.getString("PROVINCIA"));
                txt_compra.setText(rsC.getString("compraAnual"));
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
    
    public void cargarCBX()
    {
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conCBX = DriverManager.getConnection(URL,user,pass);
            stmtCBX = conCBX.createStatement();
            ResultSet rsCBX = stmtCBX.executeQuery("SELECT Provincia FROM provincia");
            
            while (rsCBX.next())
            {
                cbx_provincia.addItem(rsCBX.getString(1));
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
    
    public void addBD(){
        try{
            URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT CEDULA FROM cliente WHERE CEDULA = '"+txt_cedula.getText()+"'");
            
            if(rsC.next()){
                JOptionPane.showMessageDialog(null,"El registro con esta cedula ya existe, puede borrarlo o modificarlo");
                btn_agregar.setEnabled(false);
            }
            else{
                stmt.executeUpdate("INSERT INTO `cliente` (`NOMBRE`, `APELLIDO`, `CEDULA`, `DIRECCION`, `TELEFONO`, `provincia`, `compraAnual`) VALUES ('"+txt_nombre.getText()+"', '"+txt_apellido.getText()+"', '"+txt_cedula.getText()+"', '"+txt_direccion.getText()+"', '"+txt_telefono.getText()+"', '"+String.valueOf(cbx_provincia.getSelectedIndex()+1)+"', '"+txt_compra.getText()+"');");
                cargarBD();
            }
            rsC.close();
        }
        catch(ClassNotFoundException ce){
                ce.printStackTrace();
        }
        catch(SQLException se){
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
            stmt.executeUpdate("DELETE * FROM cliente WHERE CEDULA = '"+tf_busq.getText()+"'");
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
            stmt.executeUpdate("UPDATE cliente "
                +"SET NOMBRE = '"+txt_nombre.getText()+"',APELLIDO = '"+txt_apellido.getText()+"',CEDULA = '"+txt_cedula.getText()+"'"
                +",DIRECCION = '"+txt_direccion.getText()+"',TELEFONO = '"+txt_telefono.getText()+"'"
                +", provincia = '"+(cbx_provincia.getSelectedIndex()+1)+"',compraAnual = '"+txt_compra.getText()+"'"
                +"WHERE CEDULA = '"+tf_busq.getText()+"'");
            
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
    String cip = tf_busq.getText().toString();
    System.out.print(tf_busq+"\n"+cip+"\t");
    
         try{   
            
         URL = "jdbc:mysql://localhost:3306/semestral";
            user = "root";
            pass = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,user,pass);
            stmt = con.createStatement();
            System.out.print("Entra al try");         
            System.out.print(cip);
            //stmt =con.createStatement();
            ResultSet rsC = stmt.executeQuery("SELECT * FROM cliente WHERE cedula = '"+tf_busq.getText().toString()+"'");
            System.out.print(rsC);
            System.out.print("Realiza la busqueda");
            if(rsC.next()){
                System.out.print("Entro al If");
                txt_cedula.setText(rsC.getString("cedula"));
                txt_nombre.setText(rsC.getString("nombre"));
                txt_apellido.setText(rsC.getString("apellido"));
                txt_direccion.setText(rsC.getString("direccion"));
                cbx_provincia.setSelectedItem(rsC.getString("Provincia"));
                txt_compra.setText(rsC.getString("compraAnual"));
                txt_telefono.setText(rsC.getString("telefono"));
                //Activando los Campos
                txt_cedula.setEnabled(true);
                txt_nombre.setEnabled(true);
                txt_apellido.setEnabled(true);
                txt_direccion.setEnabled(true);
                tf_busq.setEnabled(false);
                cbx_provincia.setEnabled(true);
                txt_compra.setEnabled(true);
                txt_telefono.setEnabled(true);
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
                txt_cedula.setText(null);
                txt_nombre.setText(null);
                txt_apellido.setText(null);
                txt_direccion.setText(null);
               // cbx_provincia.setText(null);
                txt_compra.setText(null);
                txt_telefono.setText(null);
                tf_busq.setText(null);
    }
    
    public void HabilitarCampos()
    {
        txt_cedula.setEnabled(false);
                txt_nombre.setEnabled(false);
                txt_apellido.setEnabled(false);
                txt_direccion.setEnabled(false);
                cbx_provincia.setEnabled(false);
                txt_compra.setEnabled(false);
                txt_telefono.setEnabled(false);
                tf_busq.setEnabled(true);
                btn_eliminar.setEnabled(false);
                btn_modificar.setEnabled(false);
                btn_agregar.setEnabled(false);
                btn_buscar.setEnabled(true);
                btn_inab.setEnabled(false);
    }
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        addBD();
        btn_eliminar.setEnabled(true);
        btn_modificar.setEnabled(true);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarBD();
        cargarCBX();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        modificarBD();
        cargarBD();
        btn_agregar.setEnabled(true);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_inabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inabActionPerformed
        // TODO add your handling code here:
        limpiar();
        HabilitarCampos();
    }//GEN-LAST:event_btn_inabActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code her
        limpiar();
                txt_cedula.setEnabled(true);
                txt_nombre.setEnabled(true);
                txt_apellido.setEnabled(true);
                txt_direccion.setEnabled(true);
                cbx_provincia.setEnabled(true);
                txt_compra.setEnabled(true);
                txt_telefono.setEnabled(true);
                tf_busq.setEnabled(false);
                btn_eliminar.setEnabled(false);
                btn_modificar.setEnabled(false);
                btn_agregar.setEnabled(true);
                btn_buscar.setEnabled(false);
                btn_inab.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_agregar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_inab;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cbx_provincia;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JTextField tf_busq;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_compra;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
