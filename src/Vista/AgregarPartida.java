package Vista;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        cargarLista();//Carga todas las cuentas en un comboBox
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
        btnAgregarCuenta = new javax.swing.JButton();
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
        IVA = new javax.swing.JLabel();
        btnMasIVA = new javax.swing.JRadioButton();
        btnIncluido = new javax.swing.JRadioButton();
        btnExento = new javax.swing.JRadioButton();
        btnDFI = new javax.swing.JRadioButton();
        btnCFI = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("N. Partida");

        txtNPartida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPartidaKeyTyped(evt);
            }
        });

        jLabel2.setText("Fecha");

        jLabel3.setText("Concepto");

        txtConcepto.setColumns(20);
        txtConcepto.setRows(5);
        jScrollPane1.setViewportView(txtConcepto);

        btnAgregarCuenta.setText("Agregar cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        tablePartidaPreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Concepto", "Debe", "Haber"
            }
        ));
        jScrollPane2.setViewportView(tablePartidaPreview);

        jLabel7.setText("Totales");

        javax.swing.GroupLayout Panel_aggCuentasLayout = new javax.swing.GroupLayout(Panel_aggCuentas);
        Panel_aggCuentas.setLayout(Panel_aggCuentasLayout);
        Panel_aggCuentasLayout.setHorizontalGroup(
            Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_aggCuentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(Panel_aggCuentasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_aggCuentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCuenta)
                .addGap(84, 84, 84))
        );
        Panel_aggCuentasLayout.setVerticalGroup(
            Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_aggCuentasLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnAgregarCuenta)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_aggCuentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtTotalHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel5.setText("Seleccionar cuenta");

        jLabel6.setText("Saldo");

        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });

        btn_debe.setText("Debe");

        btn_haber.setText("Haber");

        IVA.setText("IVA");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_aggCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNPartida)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxLista, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IVA))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_haber)
                                            .addComponent(btn_debe)))
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExento)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMasIVA)
                                            .addComponent(btnIncluido))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCFI)
                                            .addComponent(btnDFI))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(btn_debe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_haber))
                        .addGap(8, 8, 8)
                        .addComponent(cbxLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(IVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMasIVA)
                            .addComponent(btnDFI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIncluido)
                            .addComponent(btnCFI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
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

    public void cargarLista() {

        try {
            //Nueva conexion
            Conexion conecta = new Conexion();
            Connection con = conecta.getConexion();
  
            //creamos un estado de conexion
            Statement st = con.createStatement();
            //Con dicho estado ejectuamos un query y capturamos los resultados en rs
            ResultSet rs = st.executeQuery("SELECT * FROM `cuenta`;");
            
            //removemos todo del combo box
            cbxLista.removeAllItems();
            
            //mientras halla otro dato en rs, añadimos a la combo box un resultado
            while (rs.next()) {
                cbxLista.addItem(rs.getString(8));
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

    public void preview() {
        boolean DH_seleccionado = false;//nos servira para ver que los botones esten seleccionados
        //para ver que el boton debe o haber sea seleccionado
        if(btn_debe.isSelected() || btn_haber.isSelected())
        {
            DH_seleccionado = true;
        }
        if ((!txtNPartida.getText().toString().isEmpty()) && (!txtFecha.getText().toString().isEmpty()) && (!txtSaldo.getText().toString().isEmpty())  && (DH_seleccionado)) {
            DecimalFormat formato = new DecimalFormat("#.00");
            DefaultTableModel _Modelo = (DefaultTableModel) tablePartidaPreview.getModel();

            if (!Encabezado) {
                //_Modelo.addRow(new Object[]{txtFecha.getText(), "Partida " + txtNPartida.getText(), "", ""});
                InsertarFila(_Modelo, 0, new Object[]{txtFecha.getText(), "Partida " + txtNPartida.getText(), "", ""}, true);
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

    public void InsertarFila(DefaultTableModel mod, int fila, Object[] objeto, boolean Final) { //Funcion que inserta fila en cualquier parte

        if (Final) {

            mod.addRow(objeto);

        } else {

            mod.insertRow(fila, objeto);

        }

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesIVA;
    private javax.swing.ButtonGroup Grupo_botones_DH;
    private javax.swing.JLabel IVA;
    public javax.swing.JPanel Panel_aggCuentas;
    public javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JRadioButton btnCFI;
    private javax.swing.JRadioButton btnDFI;
    public javax.swing.JRadioButton btnExento;
    private javax.swing.JRadioButton btnIncluido;
    private javax.swing.JRadioButton btnMasIVA;
    private javax.swing.JRadioButton btn_debe;
    private javax.swing.JRadioButton btn_haber;
    public javax.swing.JComboBox cbxLista;
    private javax.swing.ButtonGroup grupoBotonesDC;
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
