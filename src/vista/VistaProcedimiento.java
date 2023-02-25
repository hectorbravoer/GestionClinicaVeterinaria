package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Procedimiento;

public class VistaProcedimiento extends javax.swing.JFrame {

    int xMouse, yMouse; //Variables para guardar posicion X y Y
    ArrayList<Procedimiento> Procedimientos;
    DefaultTableModel modelo;
    static int codigo = 1;
    VistaIngreso vi;

    public VistaProcedimiento(ArrayList<Procedimiento> Procedimientos, VistaIngreso vi) {
        initComponents();
        this.Procedimientos = Procedimientos;
        this.vi = vi;
        this.vi.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("TIPO DE PROCEDIMIENTO");
        mostrarDatos();
    }

    public void mostrarDatos() {
        modelo.setNumRows(Procedimientos.size());
        for (int i = 0; i < Procedimientos.size(); i++) {
            modelo.setValueAt(Procedimientos.get(i).getCodigo(), i, 0);
            modelo.setValueAt(Procedimientos.get(i).getNombre(), i, 1);
        }
        jtDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tfProcedimiento = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLTitulo = new javax.swing.JLabel();
        jLSubtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPBarra = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 665));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 665));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 111, 255));
        jLabel6.setText("Tipo de procedimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        tfProcedimiento.setBackground(new java.awt.Color(255, 234, 81));
        tfProcedimiento.setBorder(null);
        jPanel1.add(tfProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, 20));

        btnGuardar.setBackground(new java.awt.Color(83, 111, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(97, 26));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(83, 111, 255));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(97, 26));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(83, 111, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("MENU PRINCIPAL");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 180, -1));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 390, 320));

        jLTitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLTitulo.setText("Mr. FIRULAYS ");
        jPanel1.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLSubtitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLSubtitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setText("CLINICA VETERINARIA");
        jPanel1.add(jLSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 111, 255));
        jLabel1.setText("Agregar procedimiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 270, 50));

        jPBarra.setBackground(new java.awt.Color(255, 234, 81));
        jPBarra.setPreferredSize(new java.awt.Dimension(950, 31));
        jPBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPBarraMouseDragged(evt);
            }
        });
        jPBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPBarraMousePressed(evt);
            }
        });

        jLCerrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCerrar.setText("X");
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPBarraLayout = new javax.swing.GroupLayout(jPBarra);
        jPBarra.setLayout(jPBarraLayout);
        jPBarraLayout.setHorizontalGroup(
            jPBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBarraLayout.createSequentialGroup()
                .addContainerGap(908, Short.MAX_VALUE)
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPBarraLayout.setVerticalGroup(
            jPBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBarraLayout.createSequentialGroup()
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 220, 10));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo3.jpg"))); // NOI18N
        jLFondo.setPreferredSize(new java.awt.Dimension(960, 665));
        jPanel1.add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 665));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        this.vi.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!tfProcedimiento.getText().equals("")) {
            Procedimiento p = new Procedimiento();
            p.setCodigo(codigo);
            codigo++;
            p.setNombre(tfProcedimiento.getText());
            tfProcedimiento.setText("");
            this.Procedimientos.add(p);
            mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS SOLICITADOS");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (jtDatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO A ELIMINAR");
        } else {
            this.Procedimientos.remove(this.jtDatos.getSelectedRow());
            this.mostrarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        jPBarra.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_jLCerrarMouseEntered

    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        jPBarra.setBackground(new Color(255,234,81));
    }//GEN-LAST:event_jLCerrarMouseExited

    private void jPBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMouseDragged
        int x = evt.getXOnScreen(); //Posicion del mouse en la pantalla en eje X
        int y = evt.getYOnScreen(); //Posicion del mouse en la pantalla en eje Y
        this.setLocation(x - xMouse, y - yMouse); //Restamos posiciones en pantalla menos posiciones en barra
    }//GEN-LAST:event_jPBarraMouseDragged

    private void jPBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPBarraMousePressed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnCancelarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLSubtitulo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPBarra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextField tfProcedimiento;
    // End of variables declaration//GEN-END:variables
}
