package Vista;

import Modelo.Conexion;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarPartida extends javax.swing.JFrame {

    boolean Encabezado = false;//Nos servira para insertar el encabezado una sola vez
    int UltimaDebe = 1;//nos servira para saber en donde ir insertando en el debe

    public AgregarPartida() {
        initComponents();
        //Inicializa los distintos grupos de opciones para que funcionen correctamente
        Grupo_botones_DH.add(btn_debe);
        Grupo_botones_DH.add(btn_haber);
        GrupoBotonesIVA.add(btnMasIVA);
        GrupoBotonesIVA.add(btnIncluido);
        GrupoBotonesIVA.add(btnExento);
        grupoBotonesDC.add(btnCFI);
        grupoBotonesDC.add(btnDFI);
        cargarLista("SELECT * FROM `cuenta`;");//Carga todas las cuentas en un comboBox
        cargarNPartida();  //funcion que cargara el numero de partida que halla
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_botones_DH = new javax.swing.ButtonGroup();
        GrupoBotonesIVA = new javax.swing.ButtonGroup();
        grupoBotonesDC = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNPartida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConcepto = new javax.swing.JTextArea();
        Panel_aggCuentas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePartidaPreview = new javax.swing.JTable();
        txtTotalDebe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalHaber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        cbxLista = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btn_debe = new javax.swing.JRadioButton();
        btn_haber = new javax.swing.JRadioButton();
        btnMasIVA = new javax.swing.JRadioButton();
        btnIncluido = new javax.swing.JRadioButton();
        btnExento = new javax.swing.JRadioButton();
        btnDFI = new javax.swing.JRadioButton();
        btnCFI = new javax.swing.JRadioButton();
        btnAgregarCuenta = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Partida");

        txtNPartida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNPartida.setText("1");
        txtNPartida.setEnabled(false);
        txtNPartida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPartidaKeyTyped(evt);
            }
        });

        jLabel2.setText("Fecha");

        txtFecha.setText("2010-10-02");

        jLabel3.setText("Concepto");

        txtConcepto.setColumns(20);
        txtConcepto.setRows(5);
        txtConcepto.setText("Hola");
        jScrollPane1.setViewportView(txtConcepto);

        tablePartidaPreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Concepto", "Debe", "Haber"
            }
        ));
        tablePartidaPreview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePartidaPreviewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePartidaPreview);

        jLabel7.setText("Totales");

        javax.swing.GroupLayout Panel_aggCuentasLayout = new javax.swing.GroupLayout(Panel_aggCuentas);
        Panel_aggCuentas.setLayout(Panel_aggCuentasLayout);
        Panel_aggCuentasLayout.setHorizontalGroup(
            Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_aggCuentasLayout.createSequentialGroup()
                .addGap(0, 239, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(Panel_aggCuentasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_aggCuentasLayout.setVerticalGroup(
            Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_aggCuentasLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setText("Buscar cuenta por su nombre");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel6.setText("Saldo");

        txtSaldo.setText("2000");
        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });

        btn_debe.setSelected(true);
        btn_debe.setText("Debe");

        btn_haber.setText("Haber");

        btnMasIVA.setText("+ IVA");
        btnMasIVA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasIVAMouseClicked(evt);
            }
        });

        btnIncluido.setText("Incluido");
        btnIncluido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluidoMouseClicked(evt);
            }
        });

        btnExento.setText("Exento");

        btnDFI.setText("DFI");

        btnCFI.setText("CFI");

        btnAgregarCuenta.setText("Agregar cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar Cuenta(s)");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Insertar a BD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_aggCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxLista, javax.swing.GroupLayout.Alignment.LEADING, 0, 139, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_debe)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_haber)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExento)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMasIVA)
                                    .addComponent(btnIncluido))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCFI)
                                    .addComponent(btnDFI))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbxLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(32, 32, 32)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_debe)
                                    .addComponent(btn_haber)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMasIVA)
                            .addComponent(btnDFI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncluido)
                            .addComponent(btnCFI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Panel_aggCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed

        preview();//Funcion que permite una vista previa de la partida, se llama cada vez que se agrega una cuenta
        sumar();   //Hace la sumatoria del debe y haber, para ver si cuadra


    }//GEN-LAST:event_btnAgregarCuentaActionPerformed
// los dos siguientes eventos son cuando se selecciona el botn de IVA incluido o mas IVA
    private void btnMasIVAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasIVAMouseClicked
        btnDFI.setSelected(true);//que seleccione el boton DFI
    }//GEN-LAST:event_btnMasIVAMouseClicked

    private void btnIncluidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluidoMouseClicked
        btnDFI.setSelected(true);//que seleccione el boton DFI
    }//GEN-LAST:event_btnIncluidoMouseClicked

    
    
    // Para validar que lo que se escriba en el jtext de numero de partida sea solo numeros
    private void txtNPartidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPartidaKeyTyped
        SoloNumeros(evt);//valida que solo se ingresen numeros
    }//GEN-LAST:event_txtNPartidaKeyTyped

    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
        SoloNumeros(evt);//valida que solo se ingresen numeros
    }//GEN-LAST:event_txtSaldoKeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        
        cbxLista.setPopupVisible(true);
        cargarLista("SELECT * FROM `cuenta` WHERE `nombre_cuenta` LIKE '"+jTextField3.getText()+"%';");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       
    eliminar();
    btn_eliminar.setEnabled(false);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tablePartidaPreviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePartidaPreviewMouseClicked
     
    btn_eliminar.setEnabled(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_tablePartidaPreviewMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        try {
            insertarPartida();
            JOptionPane.showMessageDialog(rootPane, "Partida ingresada correctamente a la base de datos");
             
            this.setVisible(false);         
            this.dispose();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPartida.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Revisa los datos ingresados!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPartida().setVisible(true);
            }
        });
    }

    private void cargarLista(String query) {

        try {
            //Nueva conexion
            Conexion conecta = new Conexion();
            ResultSet rs;
            rs = conecta.Consulta(query);
            
            //removemos todo del combo box
            cbxLista.removeAllItems();
            
            //mientras halla otro dato en rs, añadimos a la combo box un resultado
            while (rs.next()) {
                cbxLista.addItem(rs.getString(4));
            }
            //cerramos la conexion cerrando el resultado obtenido
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sumar() {
        double t = 0;
        double p = 0;
        //mientras la tabla tenga mas de un dato
        if (tablePartidaPreview.getRowCount() > 0) {
            for (int i = 0; i < tablePartidaPreview.getRowCount(); i++) {
                if (!tablePartidaPreview.getValueAt(i, 2).toString().isEmpty()) {
                    p = Double.parseDouble(tablePartidaPreview.getValueAt(i, 2).toString());
                    t += p;
                    
                    if(i<tablePartidaPreview.getRowCount()-1){
                        
                    if(tablePartidaPreview.getValueAt(i+1, 2).toString().isEmpty()){ //si la siguiente celda esta vacia
                    this.UltimaDebe = i+1; //entonces esta es la ultima cuenta del debe
                    }
                    
                    }
                    
                    
                }
            }
            txtTotalDebe.setText(String.valueOf(t));
        }

        double t1 = 0;
        double p1 = 0;
        if (tablePartidaPreview.getRowCount() > 0) {
            for (int i = 0; i < tablePartidaPreview.getRowCount(); i++) {
                if (!tablePartidaPreview.getValueAt(i, 3).toString().isEmpty()) {
                    p1 = Double.parseDouble(tablePartidaPreview.getValueAt(i, 3).toString());
                    t1 += p1;
                }
            }
            txtTotalHaber.setText(String.valueOf(t1));
        }
    }
    
    public void eliminar(){
    
       DefaultTableModel _Modelo = (DefaultTableModel) tablePartidaPreview.getModel();
        
       int Filas[];
       
       Filas = tablePartidaPreview.getSelectedRows();
       
       for(int i = Filas[0]; i <= Filas[Filas.length-1]; i++){ //desde el primer dato hasta el ultimo
       
       _Modelo.removeRow(i);
       
       }
       
    }
    
    public void preview() {
        boolean DH_seleccionado = false;//nos servira para ver que los botones esten seleccionados
        //para ver que el boton debe o haber sea seleccionado
        if(btn_debe.isSelected() || btn_haber.isSelected())
        {
            DH_seleccionado = true;
        }
        if ((!txtNPartida.getText().toString().isEmpty()) && (!txtFecha.getText().toString().isEmpty()) && (!txtSaldo.getText().toString().isEmpty())  && (DH_seleccionado)) {
            DecimalFormat formato = new DecimalFormat("#,00");
            DefaultTableModel _Modelo = (DefaultTableModel) tablePartidaPreview.getModel();

            if (!Encabezado) {
                //_Modelo.addRow(new Object[]{txtFecha.getText(), "Partida " + txtNPartida.getText(), "", ""});
                _Modelo.addRow(new Object[]{txtFecha.getText(), "Partida " + txtNPartida.getText(), "", ""});
                Encabezado = true;
            } else {
                _Modelo.removeRow(_Modelo.getRowCount() - 1);
            }

            if (btn_debe.isSelected()) {
                if (btnMasIVA.isSelected()) {
                    
                    if (btnDFI.isSelected()) { //en caso de que halla debito Fiscal
                        //agregamos la cuenta objetivo MAS el respectivo Debito
                        _Modelo.insertRow(this.UltimaDebe, new Object[]{"", cbxLista.getSelectedItem(), txtSaldo.getText(), ""});                        
                        _Modelo.insertRow(this.UltimaDebe+1, new Object[]{"", "Debito Fiscal IVA", String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText()) * 0.13)), ""});
                                                   
                    } else if (btnCFI.isSelected()) {
                        //agregamos la cuenta objetivo MAS el respectivo Credito
                        _Modelo.insertRow(this.UltimaDebe, new Object[]{"", cbxLista.getSelectedItem(), txtSaldo.getText(), ""});
                        _Modelo.insertRow(this.UltimaDebe+1, new Object[]{"", "Credito Fiscal IVA", String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText()) * 0.13)), ""});
                    }
                    
                } else if (btnExento.isSelected()) { //Si esta exento de iva (por defecto) solo añadimos la cuenta objetivo
                    _Modelo.insertRow(this.UltimaDebe, new Object[]{"", cbxLista.getSelectedItem(), String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText()))), ""});
                
                } else if (btnIncluido.isSelected()) { //Para iva INcluido
                    
                    if (btnDFI.isSelected()) {
                         //Exluimos del saldo lo que va hacia el IVA y lo que va hacia la cuenta objetivo
                        _Modelo.insertRow(this.UltimaDebe, new Object[]{"", cbxLista.getSelectedItem(), String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13))), ""});
                        _Modelo.insertRow(this.UltimaDebe+1, new Object[]{"", "Debito Fiscal IVA", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13) * 0.13)), ""});
                    
                    } else if (btnCFI.isSelected()) {
                        _Modelo.insertRow(this.UltimaDebe, new Object[]{"", cbxLista.getSelectedItem(), String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13))), ""});
                        _Modelo.insertRow(this.UltimaDebe+1, new Object[]{"", "Credito Fiscal IVA", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13) * 0.13)), ""});
                    }
                }

            } else if (btn_haber.isSelected()) {
                if (btnMasIVA.isSelected()) {
                    if (btnDFI.isSelected()) {
                        _Modelo.addRow(new Object[]{"", cbxLista.getSelectedItem(), "", txtSaldo.getText()});
                        _Modelo.addRow(new Object[]{"", "Debito Fiscal IVA", "", String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText()) * 0.13))});
                    } else if (btnCFI.isSelected()) {
                        _Modelo.addRow(new Object[]{"", cbxLista.getSelectedItem(), "", txtSaldo.getText()});
                        _Modelo.addRow(new Object[]{"", "Credito Fiscal IVA", "", String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText()) * 0.13))});
                    }
                } else if (btnExento.isSelected()) {
                    _Modelo.addRow(new Object[]{"", cbxLista.getSelectedItem(), "", String.valueOf(formato.format(Double.parseDouble(txtSaldo.getText())))});
                } else if (btnIncluido.isSelected()) {
                    if (btnDFI.isSelected()) {
                        _Modelo.addRow(new Object[]{"", cbxLista.getSelectedItem(), "", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13)))});
                        _Modelo.addRow(new Object[]{"", "Debito Fiscal IVA", "", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13) * 0.13))});
                    } else if (btnCFI.isSelected()) {
                        _Modelo.addRow(new Object[]{"", cbxLista.getSelectedItem(), "", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13)))});
                        _Modelo.addRow(new Object[]{"", "Credito Fiscal IVA", "", String.valueOf(formato.format((Double.parseDouble(txtSaldo.getText()) / 1.13) * 0.13))});
                    }
                }
            }

            _Modelo.addRow(new Object[]{"", txtConcepto.getText(), "", ""});
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON REQUERIDOS");
        }
    }

    public String[][] datosTabla (DefaultTableModel table) {
    int nRow = table.getRowCount(), nCol = table.getColumnCount();
    String[][] tableData = new String[nRow][nCol];
    for (int i = 0 ; i < nRow ; i++)
        for (int j = 0 ; j < nCol ; j++){
            tableData[i][j] = table.getValueAt(i,j).toString();
            //System.out.println(tableData[i][j]+"("+i+","+j+")");            
        }
    return tableData;
}
    
    public void insertarPartida() throws SQLException { //Funcion que inserta una partida con sus respectivas cuentas en la BD

        //System.out.println("llegue aca");
        DefaultTableModel _Modelo = (DefaultTableModel) tablePartidaPreview.getModel();
        Conexion ConInsertar = new Conexion();
        ResultSet rs = null;
        
        /*-------------Obtencion de datos del numero de partida------------*/

        String Id = txtNPartida.getText();
           
        /*--------------Obtencion de cuentas-------------*/  //ya tengo idpartida
        //obtenemos todos los datos existentes el la tabla
        String datos[][] = datosTabla(_Modelo);
        
        String IdCuenta = null;                         
        
        //la fecha y el concepto seran faciles de obtener (son de la primera y la ultima fila
        String Fecha = datos[0][0];
        String Concepto = datos[tablePartidaPreview.getRowCount()-1][1];
        //System.out.println("Fecha: "+Fecha+"      Concepto: "+Concepto);
        
        //Primero insertamos el detalle de la partida para referenciarla luego
        ConInsertar.Ejecutar("INSERT INTO `partida`(`id_partida`, `fecha`, `concepto`) VALUES ("+Id+",'"+Fecha+"','"+Concepto+"')");
       
       //para cada fila de cuenta que halla (desde la segunda hasta la penultima fila
       for(int i = 1; i < tablePartidaPreview.getRowCount()-1;i++){
       
       //consultamos la id de la cuenta que halla para usar su id luego
       rs = ConInsertar.Consulta("SELECT id_cuenta FROM `cuenta` WHERE nombre_cuenta LIKE '"+datos[i][1]+"'");   
       while (rs.next()) {//mientras tenga registros que haga lo siguiente
                     IdCuenta = rs.getString(1);
                     System.out.println(IdCuenta);
       }
       
       if(datos[i][2].isEmpty())datos[i][2]="0"; //hacemos cero el valor inexistente, porque el query no admitira un valor vacio
       if(datos[i][3].isEmpty())datos[i][3]="0";
       
       //ejecutamos el query para una cuenta de la partida
       ConInsertar.Ejecutar(
       "INSERT INTO `cuenta_partida` (`id_cuenta_partida`, `cuenta_id`, `partida_id`, `Debe`, `Haber`) "
       + "VALUES (NULL, '"+IdCuenta+"', '"+Id+"', '"+datos[i][2]+"', '"+datos[i][3]+"');");
       
       }
       
       rs.close();// cerramos el conjunto de resultados para poder usarlo despues 

    }
    
    
    //valida que solo se ingresen numero a un jtext y recibe una variable de tipo evento
    public void SoloNumeros(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();//obtiene el caracter de la tecla que presiona el usuario
        //si lo que el usuario a escrito es una letra
        if(Character.isLetter(validar))
        {
            getToolkit().beep();//suena
            evt.consume();//no se para que es
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");//le decimos que solo ingrese numeros
        }
    }

    public void cargarNPartida (){
    
    Conexion Cone = new Conexion();
    ResultSet rs = Cone.Consulta("SELECT id_partida FROM partida ORDER BY id_partida DESC LIMIT 1 ");
    
    String aux = null;
    
        try {
            if(rs.first()){//recorre el resultset al siguiente registro si es que existen
                
                rs.beforeFirst();//regresa el puntero al primer registro
                
                while (rs.next()) {//mientras tenga registros que haga lo siguiente
                    
                    aux = rs.getString(1);
                    
                }
                txtNPartida.setText(String.valueOf(Integer.parseInt(aux)+1)); //en caso de haber, sumamos 1
            }
            else{
                
                txtNPartida.setText("1");//esta vacio el resultset

            }
        } catch (SQLException ex) {
            Logger.getLogger(AgregarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesIVA;
    private javax.swing.ButtonGroup Grupo_botones_DH;
    public javax.swing.JPanel Panel_aggCuentas;
    public javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JRadioButton btnCFI;
    private javax.swing.JRadioButton btnDFI;
    public javax.swing.JRadioButton btnExento;
    private javax.swing.JRadioButton btnIncluido;
    private javax.swing.JRadioButton btnMasIVA;
    private javax.swing.JRadioButton btn_debe;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JRadioButton btn_haber;
    public javax.swing.JComboBox cbxLista;
    private javax.swing.ButtonGroup grupoBotonesDC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    public javax.swing.JTable tablePartidaPreview;
    private javax.swing.JTextArea txtConcepto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNPartida;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTotalDebe;
    private javax.swing.JTextField txtTotalHaber;
    // End of variables declaration//GEN-END:variables
}
