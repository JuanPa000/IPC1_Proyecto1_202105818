/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1.Vistas;
import proyecto1.CrearCuenta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto1.Modelos.Usuario;
import proyecto1.Modelos.Cuenta;
import java.util.List;

public class PantallaPrincipal extends javax.swing.JFrame {
    private List<Usuario> listaUsuarios;
    private List<Cuenta> listaCuentas;
    
    public PantallaPrincipal(List<Usuario> usuarios, List<Cuenta> cuentas) {
        super("PantallaPrincipal");
        initComponents();
        mostrarDatosEstudiante();
        this.listaUsuarios = usuarios;
        this.listaCuentas = cuentas;
        
        // Agregar elementos al JComboBox
        jComboBoxOpciones.addItem("Seleccionar opción");
        jComboBoxOpciones.addItem("Datos del Estudiante");
        jComboBoxOpciones.addItem("Generación de Bitácora");
        
        jComboBoxOpciones.addActionListener(e -> {
        String opcionSeleccionada = (String) jComboBoxOpciones.getSelectedItem();
        
            if ("Datos del Estudiante".equals(opcionSeleccionada)) {
                mostrarDatosEstudiante(); // Llama al método para mostrar datos en consola
            } else if ("Generación de Bitácora".equals(opcionSeleccionada)) {
                mostrarBitacora(); // Llama al método para mostrar la bitácora en consola
            }
        });   
    }
    
    
    private void mostrarDatosEstudiante() {
        String datos = "Nombre: Juan Pablo Pineda Espina\n" +
                       "Carnet: 202105818\n" +
                       "Curso: Lab IPC1\n" +
                       "Sección: F";
        System.out.println(datos); // Muestra los datos en la consola
    }

    private void mostrarBitacora() {
        String bitacora = "Generación de Bitácora\n" +
                          "Aquí se mostrará el contenido de la bitácora...";
        System.out.println(bitacora); // Muestra la bitácora en la consola
    }
    
    private boolean validarOperacionCuenta() {
        if (listaCuentas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay cuentas existentes.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validarOperacionUsuario() {
        if (listaUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay usuarios registrados.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistroUser = new javax.swing.JButton();
        btnGenReportes = new javax.swing.JButton();
        btnHisTrans = new javax.swing.JButton();
        btnDepositos = new javax.swing.JButton();
        btnRetiros = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();
        btnCueAsoci = new javax.swing.JButton();
        jComboBoxOpciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(123, 67, 204));

        jPanel1.setBackground(new java.awt.Color(68, 68, 172));

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel1.setText("BIENVENIDO ADMIN ");

        btnRegistroUser.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnRegistroUser.setText("<html>Registro de<br>Usuario</html>");
        btnRegistroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroUserActionPerformed(evt);
            }
        });

        btnGenReportes.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnGenReportes.setText("<html>Generación<br> de Reportes</html>");
        btnGenReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenReportesActionPerformed(evt);
            }
        });

        btnHisTrans.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnHisTrans.setText("<html>Historial de<br>Transacciones</html>");
        btnHisTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHisTransActionPerformed(evt);
            }
        });

        btnDepositos.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnDepositos.setText("Depositos");
        btnDepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositosActionPerformed(evt);
            }
        });

        btnRetiros.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnRetiros.setText("Retiros");
        btnRetiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirosActionPerformed(evt);
            }
        });

        btnCrearCuenta.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnCrearCuenta.setText("Crear Cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnCueAsoci.setFont(new java.awt.Font("Haettenschweiler", 2, 11)); // NOI18N
        btnCueAsoci.setText("Cuentas Asociadas");

        jComboBoxOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxOpciones.setSelectedItem(buttonGroup1);
        jComboBoxOpciones.setToolTipText("Datos del Estudiante");
        jComboBoxOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDepositos, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(btnRegistroUser))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenReportes)
                            .addComponent(btnRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnHisTrans))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnCueAsoci))
                    .addComponent(jComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnRegistroUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenReportes)
                    .addComponent(btnHisTrans))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCueAsoci)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroUserActionPerformed

    private void btnDepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositosActionPerformed
        if (validarOperacionCuenta()) {
        // Código para abrir la ventana de operaciones (retiros, depósitos, etc.)
        }
    }//GEN-LAST:event_btnDepositosActionPerformed

    private void btnGenReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenReportesActionPerformed

    private void btnHisTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHisTransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHisTransActionPerformed

    private void btnRetirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirosActionPerformed
        if (validarOperacionCuenta()) {
            // Código para abrir la ventana de operaciones (retiros, depósitos, etc.)
        }
    }//GEN-LAST:event_btnRetirosActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        if (validarOperacionUsuario()) {
            CrearCuenta crearCuenta = new CrearCuenta(listaUsuarios, listaCuentas);
            crearCuenta.setVisible(true);
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void jComboBoxOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcionesActionPerformed
        int seleccion = jComboBoxOpciones.getSelectedIndex();

        if (seleccion == 1) { // Datos del Estudiante
            mostrarDatosEstudiante(); // Mostrar los datos en la consola
        } else if (seleccion == 2) { // Generación de Bitácora
            mostrarBitacora(); // Mostrar la bitácora en la consola
        } else {
            System.out.println("No se ha seleccionado una opción válida."); // Mensaje en consola en lugar de ocultar JLabel
        }   
    }//GEN-LAST:event_jComboBoxOpcionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        List<Usuario> listaUsuarios  = new ArrayList<>(); // Inicializar la lista de usuarios
        List<Cuenta> listaCuentas  = new ArrayList<>(); // Inicializar la lista de cuentas
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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal(listaUsuarios , listaCuentas).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCueAsoci;
    private javax.swing.JButton btnDepositos;
    private javax.swing.JButton btnGenReportes;
    private javax.swing.JButton btnHisTrans;
    private javax.swing.JButton btnRegistroUser;
    private javax.swing.JButton btnRetiros;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBoxOpciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
