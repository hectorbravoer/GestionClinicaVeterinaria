package vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Mascota;

public class VistaModificar extends javax.swing.JFrame {

    int xMouse, yMouse; //Variables para guardar posicion X y Y
    Mascota m;
    VistaIngreso vi;

    public VistaModificar(Mascota m, VistaIngreso vi) {
        initComponents();
        this.m = m;
        this.vi = vi;
        vi.setVisible(false);
        jlCodigo.setText(String.valueOf(m.getCodigo()));
        tfNombreR.setText(m.getNombreResponsable());
        tfNombreA.setText(m.getNombreMascota());
        tfRaza.setText(m.getRaza());
        tfNumero.setText(m.getNumeroContacto());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNombreR = new javax.swing.JTextField();
        tfNombreA = new javax.swing.JTextField();
        tfRaza = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jLSubtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPBarra = new javax.swing.JPanel();
        jLCerrar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondo.setPreferredSize(new java.awt.Dimension(950, 665));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(83, 111, 255));
        jLabel8.setText("Id:");
        fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jlCodigo.setText("jLabel1");
        fondo.add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 220, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(83, 111, 255));
        jLabel4.setText("Nombre responsable: ");
        fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(83, 111, 255));
        jLabel5.setText("Nombre animal: ");
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 111, 255));
        jLabel6.setText("Raza:");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(83, 111, 255));
        jLabel7.setText("Numero de contacto:");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        tfNombreR.setBackground(new java.awt.Color(255, 234, 81));
        tfNombreR.setBorder(null);
        fondo.add(tfNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 220, 20));

        tfNombreA.setBackground(new java.awt.Color(255, 234, 81));
        tfNombreA.setBorder(null);
        fondo.add(tfNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 220, 20));

        tfRaza.setBackground(new java.awt.Color(255, 234, 81));
        tfRaza.setBorder(null);
        fondo.add(tfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 220, 20));

        tfNumero.setBackground(new java.awt.Color(255, 234, 81));
        tfNumero.setBorder(null);
        fondo.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 220, 20));

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
        fondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

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
        fondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 180, -1));

        jLTitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLTitulo.setText("Mr. FIRULAYS ");
        fondo.add(jLTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLSubtitulo.setBackground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        jLSubtitulo.setForeground(new java.awt.Color(83, 111, 255));
        jLSubtitulo.setText("CLINICA VETERINARIA");
        fondo.add(jLSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 111, 255));
        jLabel1.setText("Modificar datos de mascota");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 270, 50));

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

        fondo.add(jPBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 220, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 220, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 220, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 220, 10));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo3.jpg"))); // NOI18N
        fondo.add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 665));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (!tfNombreR.getText().equals("") && !tfNombreA.getText().equals("")
                && !tfRaza.getText().equals("") && !tfNumero.getText().equals("")) {
            this.m.setNombreResponsable(tfNombreR.getText());
            this.m.setNombreMascota(tfNombreA.getText());
            this.m.setRaza(tfRaza.getText());
            this.m.setNumeroContacto(tfNumero.getText());
            this.dispose();
            this.vi.setVisible(true);
            this.vi.mostrarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE LA INFORMACION SOLICITADA");
        }        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:.this.dispose();
        this.dispose();
        this.vi.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setBackground(new Color(38,38,255));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(new Color(83,111,255));
    }//GEN-LAST:event_btnCancelarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLSubtitulo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPBarra;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JTextField tfNombreA;
    private javax.swing.JTextField tfNombreR;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRaza;
    // End of variables declaration//GEN-END:variables
}
