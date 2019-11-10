package Vista;

import Modelo.Conexion;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    int idPartida;//para la funcion eliminar
    DecimalFormat formato = new DecimalFormat("#.00");

    public Principal() {
        initComponents();
        CargandoPartidas();
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        LibroMayor();
        BalanceComprobacion();
        sumar(TableMostrarPartidas, 2, 3, jTextField1, jTextField2);
        sumar(jTable2, 1, 2, jTextField3, jTextField4);
        EstadoResultados();
        BalanceGeneral();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableMostrarPartidas = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnAgregarPartida = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Nombre de Empresa: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Agro Ferreteria San Francisco");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Periodo Contable: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Del 1 de enero al 31 de diciemre de 2019");

        TableMostrarPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Descripcion", "Debe", "Haber"
            }
        ));
        TableMostrarPartidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMostrarPartidasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableMostrarPartidas);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("TOTAL");

        btnAgregarPartida.setText("AGREGAR PARTIDA");
        btnAgregarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPartidaActionPerformed(evt);
            }
        });

        jButton3.setText("AJUSTE DE IVA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar))
                            .addComponent(btnAgregarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(btnAgregarPartida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Libro Diario", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Detalle", "Debe", "Haber", "Saldo"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Libro Mayor");

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Libro mayor", jPanel3);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Balance de comprobación");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuentas", "Debe", "Haber"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("TOTAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel14)
                .addGap(57, 57, 57)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Balance de comprobación", jPanel4);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estado de Resultados", jPanel5);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACTIVOS", "$"
            }
        ));
        jScrollPane2.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PASIVOS", "$"
            }
        ));
        jScrollPane3.setViewportView(jTable5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("BALANCE GENERAL");

        jTextField5.setEnabled(false);

        jTextField6.setEnabled(false);

        jTextField7.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("TOTAL");

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(87, 87, 87)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel15)
                        .addGap(57, 57, 57)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton5))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Balance General", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPartidaActionPerformed
        AgregarPartida agregarPartida = new AgregarPartida();
        agregarPartida.setVisible(true);
        //agregarPartida.cargarNPartida();
        //agregarPartida.cargarLista("SELECT * FROM `cuenta`;");
        //agregarPartida.eliminar(true);
        agregarPartida.setLocationRelativeTo(null);
        agregarPartida.setDefaultCloseOperation(agregarPartida.DISPOSE_ON_CLOSE);
        CargandoPartidas();

    }//GEN-LAST:event_btnAgregarPartidaActionPerformed

    private void TableMostrarPartidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMostrarPartidasMouseClicked
        int i = 1;//contador
        int Fila = TableMostrarPartidas.getSelectedRow();//obtengo el numero de fila seleccionada
        int Col = TableMostrarPartidas.getRowCount();//obtengo el numero total de filas que hay en la tabla
        String nPartida = TableMostrarPartidas.getValueAt(Fila, 1).toString();//Obtener la el texto de la celda seleccionada
        String busqueda = "Partida N. ";//esta variable la utilizaremos para saber cual es el numero de partida
        while (Col > 0) {
            //aqui hacemos una validacion para saber cual es el numero de la partida que se a seleccionado
            if ((busqueda + i).equals(nPartida)) {
                Col = 0;//para que salga del while
                idPartida = i;
                //mostramos los botones
                btnModificar.setVisible(true);
                btnEliminar.setVisible(true);
            } else {
                //ocultamos los botones
                btnModificar.setVisible(false);
                btnEliminar.setVisible(false);
            }
            i++;
            Col--;
        }
    }//GEN-LAST:event_TableMostrarPartidasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (EliminarPartidaBD()) {
            ModificarId(idPartida);
            CargandoPartidas();
            sumar(TableMostrarPartidas, 2, 3, jTextField1, jTextField2);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AjusteIVA();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        AgregarPartida agg = new AgregarPartida();
        DefaultTableModel modelo = (DefaultTableModel) agg.tablePartidaPreview.getModel();
        try {
            Conexion con = new Conexion();
            ResultSet rs = null;
            ResultSet rs1 = null;

            rs = con.Consulta("SELECT `id_partida`, `fecha`, `concepto` FROM `partida` WHERE `id_partida` = " + idPartida + "", con.getConexion());
            rs1 = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE partida_id = " + idPartida + "", con.getConexion());

            while (rs.next()) {
                String partida = "Partida " + rs.getString("id_partida");
                modelo.addRow(new Object[]{rs.getString("fecha"), partida, "", ""});
                agg.txtFecha.setText(rs.getString("fecha"));
                agg.txtModif.setText(rs.getString("id_partida"));
                while (rs1.next()) {
                    modelo.addRow(new Object[]{"", rs1.getString("nombre_cuenta"), rs1.getString("Debe"), rs1.getString("Haber")});
                }
                modelo.addRow(new Object[]{"", rs.getString("concepto"), "", ""});
                agg.txtConcepto.setText(rs.getString("concepto"));

            }
            con.close(); //aqui esta un close
            rs.close();
            rs1.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        agg.jButton1.setVisible(false);
        agg.btnModificar.setVisible(true);
        agg.setVisible(true);
        agg.setDefaultCloseOperation(agg.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LibroMayor();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BalanceComprobacion();
        sumar(jTable2, 1, 2, jTextField3, jTextField4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EstadoResultados();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BalanceGeneral();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public void CargandoPartidas() {
        DefaultTableModel modelo = (DefaultTableModel) TableMostrarPartidas.getModel();

        //vacia la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        //tamaño de las columnas
        int[] anchos = {50, 200, 50, 50};

        for (int i = 0; i < modelo.getColumnCount(); i++) {
            TableMostrarPartidas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        Conexion con = new Conexion();
        ResultSet rs = con.Consulta("SELECT * FROM `partida`", con.getConexion());//consulta
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("fecha"), "Partida N. " + rs.getString("id_partida"), "", ""});
                Conexion con1 = new Conexion();
                ResultSet rs1 = con1.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE partida_id = " + rs.getString("id_partida") + "", con.getConexion());//consulta
                try {
                    while (rs1.next()) {
                        modelo.addRow(new Object[]{"", rs1.getString("nombre_cuenta"), rs1.getString("Debe"), rs1.getString("Haber")});

                    }
                    rs1.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                modelo.addRow(new Object[]{"", "C/ " + rs.getString("concepto"), "", ""});
                sumar(TableMostrarPartidas, 2, 3, jTextField1, jTextField2);
            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sumar(javax.swing.JTable tabla, int columna1, int columna2, javax.swing.JTextField jt1, javax.swing.JTextField jt2) {

        double t1 = 0;
        double p1 = 0;
        if (tabla.getRowCount() > 1) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (!tabla.getValueAt(i, columna1).toString().isEmpty()) {
                    p1 = Double.parseDouble(tabla.getValueAt(i, columna1).toString());
                    t1 += p1;
                }
            }
            jt1.setText(String.valueOf(formato.format(t1)));
        } else {
            jt1.setText("");
        }

        double t = 0;
        double p = 0;
        if (tabla.getRowCount() > 1) {
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (!tabla.getValueAt(i, columna2).toString().isEmpty()) {
                    p = Double.parseDouble(tabla.getValueAt(i, columna2).toString());
                    t += p;
                }
            }
            jt2.setText(String.valueOf(formato.format(t)));
        } else {
            jt2.setText("");
        }

    }

    public boolean EliminarPartidaBD() {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        Connection conn = con.getConexion();

        try {
            ps = conn.prepareStatement("DELETE FROM `partida` WHERE `id_partida` = " + idPartida + "");
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /*Esta funcion modifica los id de la tabla partida, tomando en cuenta un id eliminado que es el parametro que recibe*/
    public void ModificarId(int id_partida) {
        int habian = CuantosIdP() + 1;//almacena cuantos id habian antes de eliminar uno
        int VoyAmodificar = habian - id_partida;/*Esta variable recibe el numero de id que voy a modificar, la uso para
         contar los ciclos que tendra el while de abajo*/

        int a = 1; //contador para el ciclo while

        int modifica = id_partida + 1;/*esta variable recibe el id que voy a modificar en la base de datos, y como voy a 
         modificar el siguiente id despues del que elimine le sumo 1, ejemplo:
         si elimine el 2 voy a modificar el 3*/

        int nuevo = id_partida;/*esta variable recibe el nuevo id, y como sustituire el que elimine le paso ese valor*/

        while (a <= VoyAmodificar) {
            Conexion con = new Conexion();
            PreparedStatement ps = null;
            Connection conn = con.getConexion();
            try {
                ps = conn.prepareStatement("UPDATE `partida` SET `id_partida`= " + nuevo + " WHERE `id_partida` = " + modifica + "");
                ps.execute();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            modifica++;
            nuevo++;
            a++;
        }

    }

    /*Esta funcion retorna cuantos registros hay en la base de datos de la tabla partida y devuelve ese valor*/
    public int CuantosIdP() {
        int n = 0;//variable que retorna el valor
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        Connection conn = con.getConexion();
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT COUNT(*) FROM `partida` ");
            rs = ps.executeQuery();
            if (rs.next()) {
                n = Integer.parseInt(rs.getString("COUNT(*)"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public void AjusteIVA() {
        //primero hay que recorrer las cuentas en busca de DFI o CFI
        int nFilas = TableMostrarPartidas.getRowCount();//obtenemos el numero total de filas en la tabla
        Double debitoD = 0.0;
        Double debitoH = 0.0;
        Double creditoD = 0.0;
        Double creditoH = 0.0;
        Double totalC = 0.0;
        Double totalD = 0.0;
        boolean IVAremanente = false;
        boolean IVAimpuesto = false;
        for (int i = 0; i < nFilas; i++) {
            /*dentro de este for vamos a tomar los valores del DFI/CFI y separar respectivamente si esta en el debe o haber*/
            if (TableMostrarPartidas.getValueAt(i, 1).toString().equals("Debito Fiscal IVA")) {
                debitoD += Double.parseDouble(TableMostrarPartidas.getValueAt(i, 2).toString());
                debitoH += Double.parseDouble(TableMostrarPartidas.getValueAt(i, 3).toString());
            } else if (TableMostrarPartidas.getValueAt(i, 1).toString().equals("Credito Fiscal IVA")) {
                creditoD += Double.parseDouble(TableMostrarPartidas.getValueAt(i, 2).toString());
                creditoH += Double.parseDouble(TableMostrarPartidas.getValueAt(i, 3).toString());
            }
        }

        //ahora vamos a realizar las T para el DFI y CFI
        if (debitoD > debitoH) {
            totalD = debitoD - debitoH;
        } else if (debitoD < debitoH) {
            totalD = debitoH - debitoD;
        }

        if (creditoD > creditoH) {
            totalC = creditoD - creditoH;
        } else if (creditoD < creditoH) {
            totalC = creditoH - creditoD;
        }

        if ((totalC > 0) || (totalD > 0)) {
            //hacemos el ajuste de iva
            Double remanente = 0.0;
            Double impuesto = 0.0;

            if (totalC > totalD) {
                remanente = totalC - totalD;
                IVAremanente = true;
            } else if (totalC < totalD) {
                impuesto = totalD - totalC;
                IVAimpuesto = true;
            }

            //hacemos y subimos la partida a la base de datos
            //primero obtenemos la ultima partida ingresada
            int ultimaPartida = CuantosIdP();
            ultimaPartida = ultimaPartida + 1;//nueva partida

            //obtenemos la fecha del sistema
            Calendar fecha = new GregorianCalendar();
            int anioi = fecha.get(Calendar.YEAR);
            String anio = String.valueOf(anioi);
            int mesi = fecha.get(Calendar.MONTH);
            String mes = String.valueOf(mesi);
            int diai = fecha.get(Calendar.DAY_OF_MONTH);
            if (diai < 10) {
                String dia = "0" + String.valueOf(diai);
            } else {
                String dia = String.valueOf(diai);
            }

            String fechaS = "2010" + "-" + mes + "-" + "02";
            String a = "Ajuste de IVA";
            //insertamos la partida
            DecimalFormat formato = new DecimalFormat("#.00");
            Conexion insertar = new Conexion();
            insertar.Ejecutar("INSERT INTO `partida` (`id_partida`, `fecha`, `concepto`) VALUES ('" + ultimaPartida + "', '" + fechaS + "', 'Ajuste de IVA');");

            if (IVAremanente) {
                if (debitoD > debitoH) {
                    System.out.println("es la primera");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (38," + ultimaPartida + "," + formato.format(totalC) + ", 0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (39," + ultimaPartida + "," + formato.format(remanente) + ",0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (168," + ultimaPartida + ",0," + formato.format(totalD) + ");");
                } else if (debitoD < debitoH) {
                    System.out.println("es la segunda");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (168," + ultimaPartida + "," + formato.format(totalD) + ",0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (39," + ultimaPartida + "," + formato.format(remanente) + ",0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (38," + ultimaPartida + ",0," + formato.format(totalC) + ");");
                }

            } else if (IVAimpuesto) {
                if (debitoD > debitoH) {
                    System.out.println("es la tercera");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (38," + ultimaPartida + "," + formato.format(totalC) + ", 0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (167," + ultimaPartida + "," + formato.format(impuesto) + ",0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (168," + ultimaPartida + ",0," + formato.format(totalD) + ");");
                } else if (debitoD < debitoH) {
                    System.out.println("es la cuarta");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (168," + ultimaPartida + "," + formato.format(totalD) + ",0);");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (167," + ultimaPartida + "," + formato.format(impuesto) + ",0)");
                    insertar.Ejecutar("INSERT INTO `cuenta_partida`(`cuenta_id`, `partida_id`, `Debe`, `Haber`) VALUES (38," + ultimaPartida + ",0," + formato.format(totalC) + ");");
                }
            }
            CargandoPartidas();
        } else {
            JOptionPane.showMessageDialog(null, "NO HAY REGISTRO DE IVA");
        }

    }

    public void LibroMayor() {
        Double contando = 0.0;
        boolean esta = false;
        String nivel3 = "";
        String codigo = null;
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        Conexion con = new Conexion();
        ResultSet rs = null;

        //vacia la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        rs = con.Consulta("SELECT cuenta.codigo FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id", con.getConexion());

        try {
            while (rs.next()) {
                codigo = rs.getString(1);//obteniendo codigo
                /*este for lo que hace es que solo obtenga a que cuenta de nivel 3 pertenece la cuenta obtenida
                 por la consulta de arriba, por ejemplo si es caja general sabriamos que es de efectivo y equivalente*/
                for (int i = 0; i < 4; i++) {
                    nivel3 += codigo.charAt(i);
                }
                Conexion con1 = new Conexion();
                ResultSet rs1 = null;
                rs1 = con1.Consulta("SELECT `nombre_cuenta`, `tipo_saldo` FROM `cuenta` WHERE `codigo` = '" + nivel3 + "'", con1.getConexion());

                if (rs1.next()) {

                    Conexion con2 = new Conexion();
                    ResultSet rs2 = null;
                    rs2 = con2.Consulta("SELECT cuenta.codigo,partida.fecha,partida.concepto, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta_partida inner JOIN cuenta ON cuenta_partida.cuenta_id = cuenta.id_cuenta inner JOIN partida ON cuenta_partida.partida_id = partida.id_partida WHERE cuenta.codigo LIKE '" + nivel3 + "%'", con2.getConexion());

                    /*SI YA HAY UNA FILA EN LA TABLA ENTRA ACA SI NO LA HAY LA AGREGA EN EL ELSE*/
                    if (modelo.getRowCount() > 0) {
                        int a = 0;
                        /*RECORREMOS LAS FILAS DE LA TABLA*/
                        while (a < modelo.getRowCount()) {
                            /*CON ESTO VERIFICAMOS QUE LA CUENTA DE NIVEL 3 QUE QUEREMOS METER NO ESTE DUPLICADA*/
                            if (jTable1.getValueAt(a, 1).toString().equals(rs1.getString("nombre_cuenta"))) {
                                esta = true;
                                break;
                            } else {
                                esta = false;
                            }
                            a++;
                        }
                        /*SI LA CUENTA QUE QUEREMOS METER YA ESTA EN LA TABLA ENTONCES NO HACEMOS NADA DE LO CONTRARIO
                         INGRESAMOS LA CUENTA*/
                        if (esta) {
                            //System.out.println("no la agrego");
                        } else {
                            modelo.addRow(new Object[]{"", rs1.getString("nombre_cuenta"), "", "", ""});
                            esta = false;
                            while (rs2.next()) {
                                /*LA VARIABLE CONTANDO SIRVE PARA IR SUMANDO EL SALDO, PERO CON ESTO VALIDAMOS QUE NO
                                 SE ESTE SUMANDO UN CAMPO VACIO*/
                                if (!jTable1.getValueAt(modelo.getRowCount() - 1, 4).toString().isEmpty()) {
                                    contando = Double.parseDouble(jTable1.getValueAt(modelo.getRowCount() - 1, 4).toString());
                                } else {
                                    contando = 0.0;
                                }

                                if (rs1.getString("tipo_saldo").equals("Deudor")) {
                                    modelo.addRow(new Object[]{rs2.getString("fecha"), rs2.getString("concepto"), rs2.getString("Debe"), rs2.getString("Haber"), formato.format(((Double.parseDouble(rs2.getString("Debe")) - Double.parseDouble(rs2.getString("Haber"))) + contando))});

                                } else if (rs1.getString("tipo_saldo").equals("Acreedor")) {
                                    modelo.addRow(new Object[]{rs2.getString("fecha"), rs2.getString("concepto"), rs2.getString("Debe"), rs2.getString("Haber"), formato.format(((Double.parseDouble(rs2.getString("Haber")) - Double.parseDouble(rs2.getString("Debe"))) + contando))});

                                }
                            }
                        }

                    } else {
                        modelo.addRow(new Object[]{"", rs1.getString("nombre_cuenta"), "", "", ""});
                        while (rs2.next()) {
                            if (!jTable1.getValueAt(modelo.getRowCount() - 1, 4).toString().isEmpty()) {
                                contando = Double.parseDouble(jTable1.getValueAt(modelo.getRowCount() - 1, 4).toString());
                            } else {
                                contando = 0.0;
                            }

                            if (rs1.getString("tipo_saldo").equals("Deudor")) {
                                modelo.addRow(new Object[]{rs2.getString("fecha"), rs2.getString("concepto"), rs2.getString("Debe"), rs2.getString("Haber"), formato.format(((Double.parseDouble(rs2.getString("Debe")) - Double.parseDouble(rs2.getString("Haber"))) + contando))});

                            } else if (rs1.getString("tipo_saldo").equals("Acreedor")) {
                                modelo.addRow(new Object[]{rs2.getString("fecha"), rs2.getString("concepto"), rs2.getString("Debe"), rs2.getString("Haber"), formato.format(((Double.parseDouble(rs2.getString("Haber")) - Double.parseDouble(rs2.getString("Debe"))) + contando))});

                            }
                        }
                    }
                    con2.close();
                    rs2.close();
                }

                //modelo.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), ""});
                con1.close();
                rs1.close();
                nivel3 = "";
            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BalanceComprobacion() {
        int codigo;
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();

        //vacia la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Conexion con = new Conexion();
        ResultSet rs = con.Consulta("SELECT `codigo`, `nombre_cuenta`, `tipo_saldo` FROM `cuenta` WHERE `Nivel` = 1 OR `Nivel` = 2", con.getConexion());
        try {
            while (rs.next()) {
                codigo = Integer.parseInt(rs.getString("codigo"));

                if (codigo == 1 || codigo == 2 || codigo == 31 || codigo == 5 || codigo == 41 || codigo == 42) {
                    modelo.addRow(new Object[]{rs.getString("nombre_cuenta"), "", ""});
                    Conexion co = new Conexion();
                    ResultSet r = co.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE `codigo` Like '" + codigo + "%'", co.getConexion());

                    while (r.next()) {
                        if (rs.getString("tipo_saldo").equals("Deudor")) {
                            if (Double.parseDouble(r.getString("Haber")) <= 0.00) {
                                modelo.addRow(new Object[]{r.getString("nombre_cuenta"), r.getString("Debe"), r.getString("Haber")});

                            } else if (Double.parseDouble(r.getString("Haber")) > 0) {
                                modelo.addRow(new Object[]{r.getString("nombre_cuenta"), 0 - Double.parseDouble(r.getString("Haber")), "0"});

                            }
                        } else if (rs.getString("tipo_saldo").equals("Acreedor")) {
                            if (Double.parseDouble(r.getString("Debe")) <= 0.00) {
                                modelo.addRow(new Object[]{r.getString("nombre_cuenta"), r.getString("Debe"), r.getString("Haber")});

                            } else if (Double.parseDouble(r.getString("Debe")) > 0.00) {
                                modelo.addRow(new Object[]{r.getString("nombre_cuenta"), "0", 0 - Double.parseDouble(r.getString("Debe"))});

                            }

                        }

                    }

                    co.close();
                    r.close();
                }

            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EstadoResultados() {
        Double impuestos = null;
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        Double Debe = 0.00;
        Double Haber = 0.00;
        Double ingresos = 0.0;
        Double costos = 0.0;
        Double gastos = 0.0;
        //vacia la tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        Conexion con = new Conexion();
        ResultSet rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE codigo LIKE '5%'", con.getConexion());
        try {
            while (rs.next()) {
                Debe += Double.parseDouble(rs.getString("Debe"));
                Haber += Double.parseDouble(rs.getString("Haber"));
                ingresos = Haber - Debe;
            }

            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        modelo.addRow(new Object[]{"Ingresos", formato.format(ingresos)});

        rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE codigo LIKE '41%'", con.getConexion());
        try {
            Debe = 0.0;
            Haber = 0.0;
            while (rs.next()) {
                Debe += Double.parseDouble(rs.getString("Debe"));
                Haber += Double.parseDouble(rs.getString("Haber"));
                costos = Debe - Haber;

            }

            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.addRow(new Object[]{"Costos", formato.format(costos)});
        modelo.addRow(new Object[]{"Utilidad Bruta", formato.format(ingresos - costos)});

        try {
            rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE cuenta.codigo LIKE '42%'", con.getConexion());

            Debe = 0.0;
            Haber = 0.0;
            while (rs.next()) {
                Debe += Double.parseDouble(rs.getString("Debe"));
                Haber += Double.parseDouble(rs.getString("Haber"));
                gastos = Debe - Haber;
            }

            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.addRow(new Object[]{"Gastos de Operacion", formato.format(gastos)});
        modelo.addRow(new Object[]{"Utilidad de Operacion", formato.format((ingresos - costos) - gastos)});

        modelo.addRow(new Object[]{"Reserva Legal", formato.format(((ingresos - costos) - gastos) * 0.07)});
        modelo.addRow(new Object[]{"Utilidad Antes de Impuestos", formato.format(((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07)});

        if (ingresos > 150000) {
            modelo.addRow(new Object[]{"Impuestos por Pagar", formato.format((((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) * 0.3)});
            impuestos = (((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) * 0.3;
        } else if (ingresos < 150000) {
            modelo.addRow(new Object[]{"Impuestos por Pagar", formato.format((((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) * 0.25)});
            impuestos = (((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) * 0.25;
        }

        modelo.addRow(new Object[]{"Utilidad Neta", formato.format((((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) - impuestos)});
        /*utilidad neta*/
        jTextField6.setText(formato.format((((ingresos - costos) - gastos) - ((ingresos - costos) - gastos) * 0.07) - impuestos));
        /*impuestos por pagar*/
        jTextField5.setText(String.valueOf(formato.format(impuestos)));
        /*reserva legal*/
        jTextField7.setText(formato.format(((ingresos - costos) - gastos) * 0.07));
    }

    public void BalanceGeneral() {
        DefaultTableModel activos = (DefaultTableModel) jTable4.getModel();
        DefaultTableModel pasivos = (DefaultTableModel) jTable5.getModel();

        //vaciamos las tablas
        while (activos.getRowCount() > 0) {
            activos.removeRow(0);
        }
        while (pasivos.getRowCount() > 0) {
            pasivos.removeRow(0);
        }

        Conexion con = new Conexion();
        ResultSet rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE codigo LIKE '1%'", con.getConexion());

        try {
            activos.addRow(new Object[]{"ACTIVOS", "0"});
            while (rs.next()) {
                if (Double.parseDouble(rs.getString("Haber")) <= 0) {
                    activos.addRow(new Object[]{rs.getString("nombre_cuenta"), rs.getString("Debe")});

                } else if (Double.parseDouble(rs.getString("Haber")) > 0) {
                    activos.addRow(new Object[]{rs.getString("nombre_cuenta"), formato.format(0 - Double.parseDouble(rs.getString("Haber")))});

                }
            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Double sumActivos = 0.0;
        //sumamos los activos
        for (int i = 0; i < activos.getRowCount(); i++) {
            sumActivos += Double.parseDouble(activos.getValueAt(i, 1).toString());
        }
        jTextField8.setText(formato.format(sumActivos));
        //activos.addRow(new Object[]{"TOTAL ", formato.format(sumActivos)});

        rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE codigo LIKE '2%'", con.getConexion());
        try {
            pasivos.addRow(new Object[]{"PASIVOS ", "0"});

            while (rs.next()) {
                if (Double.parseDouble(rs.getString("Debe")) <= 0) {
                    pasivos.addRow(new Object[]{rs.getString("nombre_cuenta"), formato.format(Double.parseDouble(rs.getString("Haber")))});
                } else if (Double.parseDouble(rs.getString("Debe")) > 0) {
                    pasivos.addRow(new Object[]{rs.getString("nombre_cuenta"), formato.format(0 - Double.parseDouble(rs.getString("Debe")))});

                }
            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pasivos.addRow(new Object[]{"IMPUESTOS POR PAGAR ", jTextField5.getText()});

        pasivos.addRow(new Object[]{"PATRIMONIO ", "0"});

        rs = con.Consulta("SELECT cuenta.nombre_cuenta, cuenta_partida.Debe, cuenta_partida.Haber FROM cuenta INNER JOIN cuenta_partida ON cuenta.id_cuenta = cuenta_partida.cuenta_id WHERE codigo LIKE '3%'", con.getConexion());
        try {

            while (rs.next()) {
                if (Double.parseDouble(rs.getString("Debe")) <= 0) {
                    pasivos.addRow(new Object[]{rs.getString("nombre_cuenta"), formato.format(Double.parseDouble(rs.getString("Haber")))});
                } else if (Double.parseDouble(rs.getString("Debe")) > 0) {
                    pasivos.addRow(new Object[]{rs.getString("nombre_cuenta"), formato.format(0 - Double.parseDouble(rs.getString("Debe")))});

                }
            }
            con.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        pasivos.addRow(new Object[]{"UTILIDAD NETA ", jTextField6.getText()});
        pasivos.addRow(new Object[]{"RESERVA LEGAL ", jTextField7.getText()});

        Double sumPasivos = 0.0;
        //sumamos los pasivos
        for (int i = 0; i < pasivos.getRowCount(); i++) {
            sumPasivos += Double.parseDouble(pasivos.getValueAt(i, 1).toString());
        }
        jTextField9.setText(formato.format(sumPasivos));
        //pasivos.addRow(new Object[]{"TOTAL ", formato.format(sumPasivos)});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMostrarPartidas;
    public javax.swing.JButton btnAgregarPartida;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
