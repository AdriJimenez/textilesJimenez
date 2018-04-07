package textilesJimenez;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteLayout;
/**
 *
 * @author adrianajimeneznava
 */
public class modificarPedidos extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Statement stat;
    ResultSet resultado;
    PreparedStatement us;
    
    public modificarPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void columnas() {
        String[] titulos = {"No.","Modelo", "Marca", "Fecha Entrega", "Tallas"};
        modelo = new DefaultTableModel(null, titulos);
        this.tablePedidos.setModel(modelo);
        int[] ancho = {20, 30, 40, 30, 30};
        for(int i=0; i<tablePedidos.getColumnCount(); i++) {
            tablePedidos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        tablePedidos.setRowHeight(25);
    }
    
    public void columnas1() {
        String[] titulos = {"No.","Modelo", "Marca", "Fecha Entrega", "Tallas"};
        modelo = new DefaultTableModel(null, titulos);
        this.tableBordado.setModel(modelo);
        int[] ancho = {20, 30, 40, 30, 30};
        for(int i=0; i<tableBordado.getColumnCount(); i++) {
            tableBordado.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }
        tableBordado.setRowHeight(25);
    }
    
    public void mostrar() {
        String sql = "SELECT id, modelo, marca, fechaEntregaPedidos, tallas FROM pedidos WHERE modelo LIKE '%" + txtPedidos.getText() + "%'";
        PreparedStatement prepared;
        ResultSet result;
        Object datos[] = new Object[5];
        columnas();
        try {
            if(txtPedidos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingresar número de pedido", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                prepared = cn.prepareStatement(sql);
                result = prepared.executeQuery();
                while (result.next()) {
                    for (int j = 0; j < 5; j++) {
                        datos[j] = result.getObject(j + 1);
                    }
                    modelo.addRow(datos);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void mostrarBordado() {
        String sql = "SELECT id, modelo, marca, fechaEntregaBordado, tallas FROM pedidos WHERE modelo LIKE '%" + txtBordado.getText() + "%'";
        PreparedStatement prepared;
        ResultSet result;
        Object datos[] = new Object[5];
        columnas1();
        try {
            if(txtBordado.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingresar número de bordado", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                prepared = cn.prepareStatement(sql);
                result = prepared.executeQuery();
                while (result.next()) {
                    for (int j = 0; j < 5; j++) {
                        datos[j] = result.getObject(j + 1);
                    }
                    modelo.addRow(datos);
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void modificarPedidos() {
        int filas = tablePedidos.getSelectedRow();
        String sql = "UPDATE pedidos SET fechaEntregaPedidos = '" + txtEntregadoPedidos.getText() + "' WHERE id = " + txtId.getText();
        if(txtPedidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresar modelo");
        } else {
            if(filas == -1) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            } else {
                txtPedidos.setText(tablePedidos.getValueAt(filas, 1).toString());
                try {
                    if(txtEntregadoPedidos.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingresar fecha de entrega");
                    } else {
                        us = cn.prepareStatement(sql);
                        if (JOptionPane.showConfirmDialog(null, "¿Modificar información?", "Confirmación", JOptionPane.YES_NO_OPTION)
                                == JOptionPane.YES_OPTION) {
                            us.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Datos actualizados");
                        }
                    }
                } catch(SQLException ex) {
                    ex.getSQLState();
                }
            }
        }
    }
    
    public void modificarBordado() {
        int filas = tableBordado.getSelectedRow();
        String sql = "UPDATE pedidos SET fechaEntregaBordado = '" + txtEntregadoBordado.getText() + "' WHERE id = " + txtId.getText();
        if(txtBordado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresar modelo");
        } else {
            if(filas == -1) {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            } else {
                txtBordado.setText(tableBordado.getValueAt(filas, 1).toString());
                try {
                    if(txtEntregadoBordado.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingresar fecha de entrega");
                    } else {
                        us = cn.prepareStatement(sql);
                        if (JOptionPane.showConfirmDialog(null, "¿Modificar información?", "Confirmación", JOptionPane.YES_NO_OPTION)
                                == JOptionPane.YES_OPTION) {
                            us.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Datos actualizados");
                        }
                    }
                } catch(SQLException ex) {
                    ex.getSQLState();
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPedidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarPedidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedidos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBordado = new javax.swing.JTextField();
        btnBuscarBordados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBordado = new javax.swing.JTable();
        btnModificarPedidos = new javax.swing.JButton();
        btnModificarBordado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEntregadoPedidos = new javax.swing.JTextField();
        txtEntregadoBordado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuTrabajadores = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuPrestamos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuMateriaPrima = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCuenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Khmer MN", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar pedidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 70));

        jLabel3.setFont(new java.awt.Font("Khmer MN", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        txtPedidos.setFont(new java.awt.Font("Khmer MN", 1, 14)); // NOI18N
        txtPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(txtPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        jLabel4.setFont(new java.awt.Font("Khmer MN", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pedidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 40));

        btnBuscarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPedidos.setFont(new java.awt.Font("Khmer MN", 1, 16)); // NOI18N
        btnBuscarPedidos.setText("Buscar");
        btnBuscarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 110, 50));

        jScrollPane1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 14)); // NOI18N

        tablePedidos.setFont(new java.awt.Font("Kannada Sangam MN", 0, 13)); // NOI18N
        tablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Modelo", "Marca", "Fecha Entrega", "Tallas"
            }
        ));
        tablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 220));

        jLabel5.setFont(new java.awt.Font("Khmer MN", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bordado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 40));

        jLabel6.setFont(new java.awt.Font("Khmer MN", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modelo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        txtBordado.setFont(new java.awt.Font("Khmer MN", 1, 14)); // NOI18N
        getContentPane().add(txtBordado, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 200, 30));

        btnBuscarBordados.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarBordados.setFont(new java.awt.Font("Khmer MN", 1, 16)); // NOI18N
        btnBuscarBordados.setText("Buscar");
        btnBuscarBordados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBordadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarBordados, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 110, 50));

        tableBordado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Modelo", "Marca", "Fecha Entrega", "Tallas"
            }
        ));
        tableBordado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBordadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBordado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 420, 220));

        btnModificarPedidos.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarPedidos.setFont(new java.awt.Font("Khmer MN", 1, 16)); // NOI18N
        btnModificarPedidos.setText("Modificar");
        btnModificarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPedidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 110, 50));

        btnModificarBordado.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarBordado.setFont(new java.awt.Font("Khmer MN", 1, 16)); // NOI18N
        btnModificarBordado.setText("Modificar");
        btnModificarBordado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBordadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarBordado, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 110, 50));

        jLabel7.setFont(new java.awt.Font("Khmer MN", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entregado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 30));

        jLabel8.setFont(new java.awt.Font("Khmer MN", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Entregado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, 30));

        txtEntregadoPedidos.setFont(new java.awt.Font("Khmer MN", 1, 14)); // NOI18N
        getContentPane().add(txtEntregadoPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 200, 30));

        txtEntregadoBordado.setFont(new java.awt.Font("Khmer MN", 1, 14)); // NOI18N
        getContentPane().add(txtEntregadoBordado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/fondoMorado1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 510));

        txtId.setText("jTextField1");
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jMenuBar2.setFont(new java.awt.Font("Khmer Sangam MN", 0, 14)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(309, 25));

        jMenu3.setText("Inicio");
        jMenu3.setFont(new java.awt.Font("Khmer MN", 1, 15)); // NOI18N

        menuInicio.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnInicio.png"))); // NOI18N
        menuInicio.setText("Menú principal");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        jMenu3.add(menuInicio);

        menuSalir.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnSalir.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu3.add(menuSalir);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Pagos");
        jMenu4.setFont(new java.awt.Font("Khmer MN", 1, 15)); // NOI18N
        jMenu4.setMaximumSize(new java.awt.Dimension(56, 32767));
        jMenu4.setPreferredSize(new java.awt.Dimension(97, 30));

        menuTrabajadores.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnModificar.png"))); // NOI18N
        menuTrabajadores.setText("Modificar");
        menuTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrabajadoresActionPerformed(evt);
            }
        });
        jMenu4.add(menuTrabajadores);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Préstamos");
        jMenu5.setFont(new java.awt.Font("Khmer MN", 1, 15)); // NOI18N

        menuPrestamos.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnModificar.png"))); // NOI18N
        menuPrestamos.setText("Modificar");
        menuPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrestamosActionPerformed(evt);
            }
        });
        jMenu5.add(menuPrestamos);

        jMenuBar2.add(jMenu5);

        jMenu1.setText("Materia prima");
        jMenu1.setFont(new java.awt.Font("Khmer MN", 1, 15)); // NOI18N

        menuMateriaPrima.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuMateriaPrima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnModificar.png"))); // NOI18N
        menuMateriaPrima.setText("Modificar");
        menuMateriaPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaPrimaActionPerformed(evt);
            }
        });
        jMenu1.add(menuMateriaPrima);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Cuenta");
        jMenu2.setFont(new java.awt.Font("Khmer MN", 1, 15)); // NOI18N

        menuCuenta.setFont(new java.awt.Font("Khmer MN", 0, 14)); // NOI18N
        menuCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSistema/btnModificar.png"))); // NOI18N
        menuCuenta.setText("Modificar");
        menuCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCuentaActionPerformed(evt);
            }
        });
        jMenu2.add(menuCuenta);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidosActionPerformed

    private void btnBuscarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPedidosActionPerformed
        mostrar();
    }//GEN-LAST:event_btnBuscarPedidosActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        menuTextiles menu = new menuTextiles();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrabajadoresActionPerformed
        pagoTrabajadores pago = new pagoTrabajadores();
        this.setVisible(false);
        pago.setVisible(true);
    }//GEN-LAST:event_menuTrabajadoresActionPerformed

    private void menuPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrestamosActionPerformed
        registroPrestamos prestamos = new registroPrestamos();
        this.setVisible(false);
        prestamos.setVisible(true);
    }//GEN-LAST:event_menuPrestamosActionPerformed

    private void menuMateriaPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaPrimaActionPerformed
        MateriaPrima materia = new MateriaPrima();
        this.setVisible(false);
        materia.setVisible(true);
    }//GEN-LAST:event_menuMateriaPrimaActionPerformed

    private void menuCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCuentaActionPerformed
        CuentaTotal cuenta = new CuentaTotal();
        this.setVisible(false);
        cuenta.setVisible(true);
    }//GEN-LAST:event_menuCuentaActionPerformed

    private void btnModificarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedidosActionPerformed
        modificarPedidos();
    }//GEN-LAST:event_btnModificarPedidosActionPerformed

    private void tablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePedidosMouseClicked
        int id = (Integer) tablePedidos.getValueAt(tablePedidos.getSelectedRow(), 0);
        txtId.setText(Integer.toString(id));
    }//GEN-LAST:event_tablePedidosMouseClicked

    private void btnBuscarBordadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBordadosActionPerformed
        mostrarBordado();
    }//GEN-LAST:event_btnBuscarBordadosActionPerformed

    private void btnModificarBordadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBordadoActionPerformed
        modificarBordado();
    }//GEN-LAST:event_btnModificarBordadoActionPerformed

    private void tableBordadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBordadoMouseClicked
        int id = (Integer) tableBordado.getValueAt(tableBordado.getSelectedRow(), 0);
        txtId.setText(Integer.toString(id));
    }//GEN-LAST:event_tableBordadoMouseClicked

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
            java.util.logging.Logger.getLogger(modificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBordados;
    private javax.swing.JButton btnBuscarPedidos;
    private javax.swing.JButton btnModificarBordado;
    private javax.swing.JButton btnModificarPedidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem menuCuenta;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JMenuItem menuMateriaPrima;
    private javax.swing.JMenuItem menuPrestamos;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuTrabajadores;
    private javax.swing.JTable tableBordado;
    private javax.swing.JTable tablePedidos;
    private javax.swing.JTextField txtBordado;
    private javax.swing.JTextField txtEntregadoBordado;
    private javax.swing.JTextField txtEntregadoPedidos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPedidos;
    // End of variables declaration//GEN-END:variables

    conectar cc = new conectar();
    Connection cn = cc.conexion();
}
