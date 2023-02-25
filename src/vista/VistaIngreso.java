package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Mascota;
import modelo.Procedimiento;

public class VistaIngreso extends javax.swing.JFrame {

    int xMouse, yMouse; //Variables para guardar posicion X y Y
    ArrayList<Mascota> mascotas;
    ArrayList<Procedimiento> procedimientos;
    DefaultTableModel modelo;
    static int codigo = 1;

    public VistaIngreso() {
        initComponents();
        mascotas = new ArrayList();
        procedimientos = new ArrayList();
        modelo = new DefaultTableModel();

        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("MASCOTA");
        modelo.addColumn("RAZA");
        modelo.addColumn("NUMERO");

        mostrarDatos();
    }

    public void mostrarDatos() {
        modelo.setNumRows(mascotas.size());
        for (int i = 0; i < mascotas.size(); i++) {
            modelo.setValueAt(mascotas.get(i).getCodigo(), i, 0);
            modelo.setValueAt(mascotas.get(i).getNombreResponsable(), i, 1);
            modelo.setValueAt(mascotas.get(i).getNombreMascota(), i, 2);
            modelo.setValueAt(mascotas.get(i).getRaza(), i, 3);
            modelo.setValueAt(mascotas.get(i).getNumeroContacto(), i, 4);
        }
        jtDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnProcedimiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tfNombreR = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tfNombreM = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tfRaza = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        tfNumero = new javax.swing.JTextField();
        jLTitulo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLSubtitulo = new javax.swing.JLabel();
        jPBarra = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setForeground(new java.awt.Color(255, 255, 255));
        jPFondo.setPreferredSize(new java.awt.Dimension(950, 600));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(jtDatos);

        jPFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 390, 323));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(83, 111, 255));
        jLabel4.setText("Nombre mascota: ");
        jPFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnModificar.setBackground(new java.awt.Color(83, 111, 255));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setPreferredSize(new java.awt.Dimension(97, 26));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPFondo.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(83, 111, 255));
        jLabel5.setText("Raza:");
        jPFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnProcedimiento.setBackground(new java.awt.Color(83, 111, 255));
        btnProcedimiento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnProcedimiento.setForeground(new java.awt.Color(255, 255, 255));
        btnProcedimiento.setText("Añadir procedimiento");
        btnProcedimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcedimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProcedimientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProcedimientoMouseExited(evt);
            }
        });
        btnProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedimientoActionPerformed(evt);
            }
        });
        jPFondo.add(btnProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 111, 255));
        jLabel6.setText("Numero de contacto:");
        jPFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        btnHistorial.setBackground(new java.awt.Color(83, 111, 255));
        btnHistorial.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorial.setText("Historial");
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setPreferredSize(new java.awt.Dimension(97, 26));
        btnHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistorialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistorialMouseExited(evt);
            }
        });
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        jPFondo.add(btnHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 220, 10));

        tfNombreR.setBackground(new java.awt.Color(255, 234, 81));
        tfNombreR.setForeground(new java.awt.Color(204, 204, 204));
        tfNombreR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombreR.setText("Ingrese el nombre del responsable");
        tfNombreR.setBorder(null);
        tfNombreR.setPreferredSize(new java.awt.Dimension(170, 22));
        tfNombreR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreRMousePressed(evt);
            }
        });
        tfNombreR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreRActionPerformed(evt);
            }
        });
        jPFondo.add(tfNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 220, -1));

        btnCancelar.setBackground(new java.awt.Color(83, 111, 255));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("SALIR");
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
        jPFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 220, 10));

        tfNombreM.setBackground(new java.awt.Color(255, 234, 81));
        tfNombreM.setForeground(new java.awt.Color(204, 204, 204));
        tfNombreM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNombreM.setText("Ingrese el nombre de la mascota");
        tfNombreM.setBorder(null);
        tfNombreM.setMinimumSize(new java.awt.Dimension(80, 22));
        tfNombreM.setPreferredSize(new java.awt.Dimension(170, 22));
        tfNombreM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNombreMMousePressed(evt);
            }
        });
        jPFondo.add(tfNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 220, 10));

        tfRaza.setBackground(new java.awt.Color(255, 234, 81));
        tfRaza.setForeground(new java.awt.Color(204, 204, 204));
        tfRaza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRaza.setText("Ingrese la raza");
        tfRaza.setBorder(null);
        tfRaza.setMinimumSize(new java.awt.Dimension(80, 22));
        tfRaza.setPreferredSize(new java.awt.Dimension(170, 22));
        tfRaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfRazaMousePressed(evt);
            }
        });
        jPFondo.add(tfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 220, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 220, 10));

        tfNumero.setBackground(new java.awt.Color(255, 234, 81));
        tfNumero.setForeground(new java.awt.Color(204, 204, 204));
        tfNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNumero.setText("Ingrese el numero de contacto");
        tfNumero.setBorder(null);
        tfNumero.setMinimumSize(new java.awt.Dimension(80, 22));
        tfNumero.setPreferredSize(new java.awt.Dimension(170, 22));
        tfNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfNumeroMousePressed(evt);
            }
        });
        jPFondo.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 220, -1));

        jLTitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLTitulo.setText("Mr. FIRULAYS ");
        jPFondo.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

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
        jPFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 111, 255));
        jLabel2.setText("Nombre responsable: ");
        jPFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

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
        jPFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 111, 255));
        jLabel1.setText("Ingreso de mascota");
        jPFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 220, 50));

        jLSubtitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLSubtitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setText("CLINICA VETERINARIA");
        jPFondo.add(jLSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 30));

        jPBarra.setBackground(new java.awt.Color(255, 234, 81));
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
            .addGroup(jPBarraLayout.createSequentialGroup()
                .addComponent(jLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPFondo.add(jPBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 30));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo3.jpg"))); // NOI18N
        jPFondo.add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 960, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (jtDatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL REGISTRO A MODIFICAR");
        } else {
            VistaModificar vm = new VistaModificar(mascotas.get(jtDatos.getSelectedRow()), this);
            vm.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedimientoActionPerformed
        // TODO add your handling code here:
        VistaProcedimiento vt = new VistaProcedimiento(this.procedimientos, this);
        vt.setVisible(true);
    }//GEN-LAST:event_btnProcedimientoActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        if (jtDatos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN REGISTRO EN LA TABLA");
        } else {
            VistaHistorial vn = new VistaHistorial(this.mascotas.get(jtDatos.getSelectedRow()),
                    this, this.procedimientos);
            vn.setVisible(true);
        }
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void tfNombreRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreRActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!tfNombreR.getText().equals("") && !tfRaza.getText().equals("")) {
            Mascota c = new Mascota();
            c.setCodigo(codigo);
            codigo++;
            c.setNombreResponsable(tfNombreR.getText());
            c.setNombreMascota(tfNombreM.getText());
            c.setRaza(tfRaza.getText());
            c.setNumeroContacto(tfNumero.getText());
            mascotas.add(c);
            tfNombreR.setText("");
            tfNombreM.setText("");
            tfRaza.setText("");
            tfNumero.setText("");
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
            mascotas.remove(jtDatos.getSelectedRow());
            mostrarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Evento para almacenar la posicion X y Y cuando se haga click en la barra superior
    private void jPBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPBarraMousePressed

    //Evento cuando el mouse es arrastrado para establecer la posicion de la ventana 
    private void jPBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBarraMouseDragged
        int x = evt.getXOnScreen(); //Posicion del mouse en la pantalla en eje X
        int y = evt.getYOnScreen(); //Posicion del mouse en la pantalla en eje Y
        this.setLocation(x - xMouse, y - yMouse); //Restamos posiciones en pantalla menos posiciones en barra
    }//GEN-LAST:event_jPBarraMouseDragged

    //Evento para cerrar el programa cuando se haga click en la X 
    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLCerrarMouseClicked

    //Evento para cambiar el color del boton cerrar cuando el mouse este sobre el
    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        jPBarra.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_jLCerrarMouseEntered

    //Evento para cambiar el color del boton cerrar cuando el mouse no este sobre el
    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        jPBarra.setBackground(new Color(255,234,81));
    }//GEN-LAST:event_jLCerrarMouseExited

    //Evento para cambiar el color del boton guardar cuando el mouse este sobre el
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    //Evento para cambiar el color del boton guardar cuando el mouse no este sobre el
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnGuardarMouseExited

    //Evento para cambiar el color del boton cancelar cuando el mouse este sobre el
    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    //Evento para cambiar el color del boton cancelar cuando el mouse no este sobre el
    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnCancelarMouseExited

    //Evento para cambiar el color del boton añadir procedimiento cuando el mouse este sobre el
    private void btnProcedimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimientoMouseEntered
        btnProcedimiento.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnProcedimientoMouseEntered

    //Evento para cambiar el color del boton añadir procedimiento cuando el mouse no este sobre el
    private void btnProcedimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcedimientoMouseExited
        btnProcedimiento.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnProcedimientoMouseExited

    //Evento para cambiar el color del boton historial procedimiento cuando el mouse este sobre el
    private void btnHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseEntered
        btnHistorial.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnHistorialMouseEntered

    //Evento para cambiar el color del boton historial procedimiento cuando el mouse no este sobre el
    private void btnHistorialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialMouseExited
        btnHistorial.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnHistorialMouseExited

    //Evento para cambiar el color del boton modificar cuando el mouse este sobre el
    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        btnModificar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnModificarMouseEntered

    //Evento para cambiar el color del boton modificar cuando el mouse no este sobre el
    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        btnModificar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnModificarMouseExited

    //Evento para cambiar el color del boton eliminar cuando el mouse este sobre el
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    //Evento para cambiar el color del boton eliminar cuando el mouse no este sobre el
    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnEliminarMouseExited

    //Evento para cuando se de click en el espacio de Ingrese el nombre del responsable, el campo quede vacio
    private void tfNombreRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreRMousePressed
        //El campo donde se da click se ponga vacio solo si el texto dentro de el es Ingrese el nombre del responsable
        if (tfNombreR.getText().equals("Ingrese el nombre del responsable")) {
            tfNombreR.setText("");
            tfNombreR.setForeground(Color.BLACK);
        }
        //Los demas campos regresaran a sus textos por defecto si estos se encuentran vacios
        if (tfNombreM.getText().isEmpty()) {
            tfNombreM.setText("Ingrese el nombre de la mascota");
            tfNombreM.setForeground(new Color(204, 204, 204));
        }   
        if (tfRaza.getText().isEmpty()) {
            tfRaza.setText("Ingrese la raza");
            tfRaza.setForeground(new Color(204, 204, 204));
        }
        if (tfNumero.getText().isEmpty()) {
            tfNumero.setText("Ingrese el numero de contacto");
            tfNumero.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tfNombreRMousePressed

    //Evento para cuando se de click en el espacio de Ingrese el nombre de la mascota, el campo quede vacio
    private void tfNombreMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNombreMMousePressed
        //El campo donde se da click se ponga vacio solo si el texto dentro de el es Ingrese el nombre de la mascota
        if (tfNombreM.getText().equals("Ingrese el nombre de la mascota")) {
            tfNombreM.setText("");
            tfNombreM.setForeground(Color.BLACK);
        }
        //Los demas campos regresaran a sus textos por defecto si estos se encuentran vacios
        if (tfNombreR.getText().isEmpty()) {
            tfNombreR.setText("Ingrese el nombre del responsable");
            tfNombreR.setForeground(new Color(204, 204, 204));
        }   
        if (tfRaza.getText().isEmpty()) {
            tfRaza.setText("Ingrese la raza");
            tfRaza.setForeground(new Color(204, 204, 204));
        }
        if (tfNumero.getText().isEmpty()) {
            tfNumero.setText("Ingrese el numero de contacto");
            tfNumero.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tfNombreMMousePressed

    //Evento para cuando se de click en el espacio de Ingrese la raza, el campo quede vacio
    private void tfRazaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRazaMousePressed
        //El campo donde se da click se ponga vacio solo si el texto dentro de el es Ingrese el nombre de la mascota
        if (tfRaza.getText().equals("Ingrese la raza")) {
            tfRaza.setText("");
            tfRaza.setForeground(Color.BLACK);
        }
        //Los demas campos regresaran a sus textos por defecto si estos se encuentran vacios
        if (tfNombreR.getText().isEmpty()) {
            tfNombreR.setText("Ingrese el nombre del responsable");
            tfNombreR.setForeground(new Color(204, 204, 204));
        }   
        if (tfNombreM.getText().isEmpty()) {
            tfNombreM.setText("Ingrese el nombre de la mascota");
            tfNombreM.setForeground(new Color(204, 204, 204));
        }
        if (tfNumero.getText().isEmpty()) {
            tfNumero.setText("Ingrese el numero de contacto");
            tfNumero.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tfRazaMousePressed

    //Evento para cuando se de click en el espacio de Ingrese el numero de contacto, el campo quede vacio
    private void tfNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNumeroMousePressed
        //El campo donde se da click se ponga vacio solo si el texto dentro de el es Ingrese el numero de contacto
        if (tfNumero.getText().equals("Ingrese el numero de contacto")) {
            tfNumero.setText("");
            tfNumero.setForeground(Color.BLACK);
        }
        //Los demas campos regresaran a sus textos por defecto si estos se encuentran vacios
        if (tfNombreR.getText().isEmpty()) {
            tfNombreR.setText("Ingrese el nombre del responsable");
            tfNombreR.setForeground(new Color(204, 204, 204));
        }   
        if (tfNombreM.getText().isEmpty()) {
            tfNombreM.setText("Ingrese el nombre de la mascota");
            tfNombreM.setForeground(new Color(204, 204, 204));
        }
        if (tfRaza.getText().isEmpty()) {
            tfRaza.setText("Ingrese la raza");
            tfRaza.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tfNumeroMousePressed

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
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProcedimiento;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLSubtitulo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPBarra;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextField tfNombreM;
    private javax.swing.JTextField tfNombreR;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRaza;
    // End of variables declaration//GEN-END:variables
}
