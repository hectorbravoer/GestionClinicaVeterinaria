package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Historial;
import modelo.Mascota;
import modelo.Procedimiento;

public class VistaHistorial extends javax.swing.JFrame {

    int xMouse, yMouse; //Variables para guardar posicion X y Y
    Mascota m;
    VistaIngreso vi;
    ArrayList<Procedimiento> procedimientos;
    DefaultTableModel modelo;
    static int codigo = 1;

    public VistaHistorial(Mascota m, VistaIngreso vi, ArrayList<Procedimiento> procedimientos) {
        initComponents();
        this.m = m;
        this.vi = vi;
        this.procedimientos = procedimientos;
        this.vi.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("PROCEDIMIENTO");
        modelo.addColumn("DESCRIPCION");
        this.jlMascota.setText(m.getNombreMascota());

        jcProcedimiento.addItem("Seleccione");
        for (int i = 0; i < this.procedimientos.size(); i++) {
            jcProcedimiento.addItem(this.procedimientos.get(i).getNombre());
        }

        mostrarDatos();
    }

    public void mostrarDatos() {
        modelo.setNumRows(this.m.getHistorials().size());
        for (int i = 0; i < this.m.getHistorials().size(); i++) {
            modelo.setValueAt(this.m.getHistorials().get(i).getCodigo(), i, 0);
            modelo.setValueAt(this.m.getHistorials().get(i).getDescripcion(), i, 1);
            modelo.setValueAt(this.m.getHistorials().get(i).getProcedimientos().getNombre(), i, 2);
        }
        jtDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPFondo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlMascota = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcProcedimiento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescripcion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLSubtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPBarra = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        JPFondo.setPreferredSize(new java.awt.Dimension(950, 665));
        JPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLTitulo.setText("Mr. FIRULAYS ");
        JPFondo.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 111, 255));
        jLabel6.setText("Nombre la mascota:");
        JPFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jlMascota.setText("jLabel1");
        JPFondo.add(jlMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 135, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(83, 111, 255));
        jLabel7.setText("Procedimiento: ");
        JPFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jcProcedimiento.setBackground(new java.awt.Color(255, 234, 81));
        JPFondo.add(jcProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 183, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(83, 111, 255));
        jLabel8.setText("Descripcion:");
        JPFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        tfDescripcion.setBackground(new java.awt.Color(255, 234, 81));
        tfDescripcion.setColumns(20);
        tfDescripcion.setRows(5);
        jScrollPane1.setViewportView(tfDescripcion);

        JPFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 120));

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
        jScrollPane3.setViewportView(jtDatos);

        JPFondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 390, 320));

        btnCancelar.setBackground(new java.awt.Color(83, 111, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("MENU PRINCIPAL");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(97, 26));
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
        JPFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 180, -1));

        btnEliminar.setBackground(new java.awt.Color(83, 111, 255));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        JPFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(83, 111, 255));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        JPFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jLSubtitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLSubtitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setText("CLINICA VETERINARIA");
        JPFondo.add(jLSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 111, 255));
        jLabel1.setText("Historia de mascota");
        JPFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 50));

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

        JPFondo.add(jPBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo3.jpg"))); // NOI18N
        JPFondo.add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 665));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Historial n = new Historial();
        n.setCodigo(codigo);
        codigo++;
        n.setDescripcion(tfDescripcion.getText());
        tfDescripcion.setText("");
        n.setProcedimientos(this.procedimientos.get(jcProcedimiento.getSelectedIndex() - 1));
        this.m.getHistorials().add(n);
        this.mostrarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (jtDatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL NUMERO A ELIMINAR");
        } else {
            this.m.getHistorials().remove(jtDatos.getSelectedRow());
            this.mostrarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        this.vi.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    //Evento cuando el mouse es arrastrado para establecer la posicion de la ventana
    private void jPBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMouseDragged
        int x = evt.getXOnScreen(); //Posicion del mouse en la pantalla en eje X
        int y = evt.getYOnScreen(); //Posicion del mouse en la pantalla en eje Y
        this.setLocation(x - xMouse, y - yMouse); //Restamos posiciones en pantalla menos posiciones en barra
    }//GEN-LAST:event_jPBarraMouseDragged

    //Evento para almacenar la posicion X y Y cuando se haga click en la barra superior
    private void jPBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPBarraMousePressed

    //Evento para cerrar el programa cuando se haga click en la X 
    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    //Evento para cambiar el color de la barra cerrar cuando el mouse este sobre el boton cerrar
    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        jPBarra.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_jLCerrarMouseEntered

    //Evento para cambiar el color de la barra cerrar cuando el mouse no este sobre el boton cerrar
    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        jPBarra.setBackground(new Color(255,234,81));
    }//GEN-LAST:event_jLCerrarMouseExited

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
    private javax.swing.JPanel JPFondo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLSubtitulo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPBarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcProcedimiento;
    private javax.swing.JLabel jlMascota;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextArea tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
