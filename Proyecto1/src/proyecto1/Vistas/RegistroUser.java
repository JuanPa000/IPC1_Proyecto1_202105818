/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import proyecto1.Modelos.Cliente;
import proyecto1.Modelos.Usuario;


public class RegistroUser extends javax.swing.JFrame {
    // Lista donde se almacenarán los usuarios registrados
    private List<Cliente> listaClientes;
    
    // Constructor de la clase, recibe la lista de usuarios como parámetro
    public RegistroUser(List<Cliente> listaClientes) {
        super("Crear Cliente"); // Establece el título de la ventana
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        this.listaClientes = listaClientes; // Asigna la lista de usuarios a la variable de instancia
    }
    
    // Método que se ejecuta cuando el botón "Crear" es presionado
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {
        // Obtiene los datos ingresados por el usuario y elimina espacios en blanco
        String cui = txtCui.getText().trim();
        String nombre = txtName.getText().trim();
        String apellido = txtApellido.getText().trim();

        // Validación: Verifica que todos los campos estén llenos
        if (cui.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detiene la ejecución del método si hay campos vacíos
        }
        
        // Verifica si el CUI ya está registrado en la lista de usuarios
        for (Cliente c : listaClientes) {
            if (c.getCui().equals(cui)) {
                JOptionPane.showMessageDialog(this, "El CUI ingresado ya está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Detiene la ejecución si el usuario ya existe
            }
        }
        
        // Si todo está correcto, crea un nuevo usuario y lo agrega a la lista
        Cliente nuevoCliente = new Cliente(cui, nombre, apellido);
        listaClientes.add(nuevoCliente);
        // Muestra un mensaje de éxito y cierra la ventana
        JOptionPane.showMessageDialog(this, "Usuario creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        this.dispose(); // Cierra la ventana de registro
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnRegistrarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 2, 12)); // NOI18N
        jLabel1.setText("CUI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 20, -1));
        getContentPane().add(txtCui, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, -1));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 2, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 40, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, -1));

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 2, 12)); // NOI18N
        jLabel3.setText("APELLIDO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        btnRegistrarCliente.setFont(new java.awt.Font("Haettenschweiler", 2, 18)); // NOI18N
        btnRegistrarCliente.setText("CREAR");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        
        String nombre = txtName.getText();
        String apellido = txtApellido.getText();
        String cui = txtCui.getText();

        // Validar que los campos no estén vacíos
        if (nombre.isEmpty() || apellido.isEmpty() || cui.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.");
            return;
        }

        // Validar que el CUI sea un número válido
        try {
            long cui1 = Long.parseLong(cui); // Usamos long por si el CUI es grande
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El CUI debe ser un número válido.");
            return;
        }

        // Aquí ya puedes continuar con la lógica para agregar el cliente a la lista
        Cliente cliente = new Cliente(nombre, apellido, cui);  // Asegúrate de que Cliente tenga estos parámetros en su constructor
        listaClientes.add(cliente);

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Cliente registrado exitosamente.");

        // Limpiar los campos después de registrar
        txtName.setText("");
        txtApellido.setText("");
        txtCui.setText("");

    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        List<Cliente> listaClientes  = new ArrayList<>(); // Inicializar la lista de usuarios
       
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
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUser(listaClientes).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCui;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
