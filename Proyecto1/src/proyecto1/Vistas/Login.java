/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1.Vistas;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto1.Modelos.Cuenta;
import proyecto1.Modelos.Usuario;

/**
 *
 * @author ppabl
 */

// Esta es una CLASE llamada "Login" que representa la ventana del Login
public class Login extends javax.swing.JFrame {
    
    // Definimos las variables correctas como CONSTANTES (no cambian)
    private static final String USUARIO_CORRECTO = "AdministradorIPC1F";
    private static final String CONTRA_CORRECTA = "ipc1f1s2025";
    
    //Constructor, Función que se ejecuta cuando se crea un objecto de esta clase
    public Login() {
        super("Login");
        initComponents();
        agregarPlaceholders(); //Llama al metodo para gregar los placeholders
        
    
    }
    
    // Metodo(función) de typr privada, solo se puede utilizar en esta clase
    //Es la que agrega los placeholders a los campos Usario y contraseña.
    private void agregarPlaceholders(){
    //--------- Implemataciòn para usuarios ------------
    txtUsuario.setText("Usuario"); //Texto Inicial
    txtUsuario.setForeground(Color.GRAY); //Color gris del Text
    
    // Agregue un Evento para cuando el usuario haga click en el campo
    txtUsuario.addFocusListener (new FocusAdapter() {
        @Override
        public void  focusGained(FocusEvent e){ //Se activa cuando el usuario haga click
            if (txtUsuario.getText().equals("Usuario")) { // Si el campo es igual a Usuario
                txtUsuario.setText(""); // Borra el placeholder
                txtUsuario.setForeground(Color.BLACK); // 
                
            }
         }
        @Override
        public void focusLost(FocusEvent e){// Se activa cuando el usuario sale del campo
            if (txtUsuario.getText().isEmpty()) { // Si el Usuario no escribio nada
                txtUsuario.setText("Usuario"); // Coloca de nuevo el placeholder
                txtUsuario.setForeground(Color.GRAY); // Cambio de nuevo a color Gris 
           
            }
        } 
    });
    
    // ----- Placeholder para el campo de Contraseña -----
        txtPassword.setText("Ingrese su contraseña"); // Texto inicial
        txtPassword.setForeground(Color.GRAY); // Color gris para indicar que es un placeholder
        txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal en lugar de asteriscos

        // Agrega un "escuchador" de eventos para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { // Se activa cuando el usuario hace clic en el campo
                if (String.valueOf(txtPassword.getPassword()).equals("Ingrese su contraseña")) {
                    txtPassword.setText(""); // Borra el texto del placeholder
                    txtPassword.setForeground(Color.BLACK); // Cambia el color del texto a negro
                    txtPassword.setEchoChar('•'); // Activa la ocultación de la contraseña con puntos
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // Se activa cuando el usuario sale del campo
                if (txtPassword.getPassword().length == 0) { // Si el usuario no escribió nada
                    txtPassword.setText("Ingrese su contraseña"); // Restaura el placeholder
                    txtPassword.setForeground(Color.GRAY); // Cambia el color del texto a gris
                    txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal
                }
            }
        });
        
        // ----- Placeholder para el campo de Contraseña -----
        txtPassword.setText("Ingrese su contraseña"); // Texto inicial
        txtPassword.setForeground(Color.GRAY); // Color gris para indicar que es un placeholder
        txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal en lugar de asteriscos

        // Agrega un "escuchador" de eventos para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { // Se activa cuando el usuario hace clic en el campo
                if (String.valueOf(txtPassword.getPassword()).equals("Ingrese su contraseña")) {
                    txtPassword.setText(""); // Borra el texto del placeholder
                    txtPassword.setForeground(Color.BLACK); // Cambia el color del texto a negro
                    txtPassword.setEchoChar('•'); // Activa la ocultación de la contraseña con puntos
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // Se activa cuando el usuario sale del campo
                if (txtPassword.getPassword().length == 0) { // Si el usuario no escribió nada
                    txtPassword.setText("Ingrese su contraseña"); // Restaura el placeholder
                    txtPassword.setForeground(Color.GRAY); // Cambia el color del texto a gris
                    txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal
                }
            }
        });
        // ----- Placeholder para el campo de Contraseña -----
        txtPassword.setText("Ingrese su contraseña"); // Texto inicial
        txtPassword.setForeground(Color.GRAY); // Color gris para indicar que es un placeholder
        txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal en lugar de asteriscos

        // Agrega un "escuchador" de eventos para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { // Se activa cuando el usuario hace clic en el campo
                if (String.valueOf(txtPassword.getPassword()).equals("Ingrese su contraseña")) {
                    txtPassword.setText(""); // Borra el texto del placeholder
                    txtPassword.setForeground(Color.BLACK); // Cambia el color del texto a negro
                    txtPassword.setEchoChar('•'); // Activa la ocultación de la contraseña con puntos
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // Se activa cuando el usuario sale del campo
                if (txtPassword.getPassword().length == 0) { // Si el usuario no escribió nada
                    txtPassword.setText("Ingrese su contraseña"); // Restaura el placeholder
                    txtPassword.setForeground(Color.GRAY); // Cambia el color del texto a gris
                    txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal
                }
            }
        });
        // ----- Placeholder para el campo de Contraseña -----
        txtPassword.setText("Ingrese su contraseña"); // Texto inicial
        txtPassword.setForeground(Color.GRAY); // Color gris para indicar que es un placeholder
        txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal en lugar de asteriscos

        // Agrega un "escuchador" de eventos para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { // Se activa cuando el usuario hace clic en el campo
                if (String.valueOf(txtPassword.getPassword()).equals("Ingrese su contraseña")) {
                    txtPassword.setText(""); // Borra el texto del placeholder
                    txtPassword.setForeground(Color.BLACK); // Cambia el color del texto a negro
                    txtPassword.setEchoChar('•'); // Activa la ocultación de la contraseña con puntos
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // Se activa cuando el usuario sale del campo
                if (txtPassword.getPassword().length == 0) { // Si el usuario no escribió nada
                    txtPassword.setText("Ingrese su contraseña"); // Restaura el placeholder
                    txtPassword.setForeground(Color.GRAY); // Cambia el color del texto a gris
                    txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal
                }
            }
        });
        // ----- Placeholder para el campo de Contraseña -----
        txtPassword.setText("Contraseña"); // Texto inicial
        txtPassword.setForeground(Color.GRAY); // Color gris para indicar que es un placeholder
        txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal en lugar de asteriscos

        // Agrega un "escuchador" de eventos para el campo de contraseña
        txtPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) { // Se activa cuando el usuario hace clic en el campo
                if (String.valueOf(txtPassword.getPassword()).equals("Ingrese su contraseña")) {
                    txtPassword.setText(""); // Borra el texto del placeholder
                    txtPassword.setForeground(Color.BLACK); // Cambia el color del texto a negro
                    txtPassword.setEchoChar('•'); // Activa la ocultación de la contraseña con puntos
                }
            }

            @Override
            public void focusLost(FocusEvent e) { // Se activa cuando el usuario sale del campo
                if (txtPassword.getPassword().length == 0) { // Si el usuario no escribió nada
                    txtPassword.setText("Contraseña"); // Restaura el placeholder
                    txtPassword.setForeground(Color.GRAY); // Cambia el color del texto a gris
                    txtPassword.setEchoChar((char) 0); // Permite que el texto se vea como normal
                }
            }
        });
    }
    
    // Método para validar el login
    private void validarLogin() {
        // Obtenemos los valores ingresados por el usuario
        String usuarioIngresado = txtUsuario.getText();
        String contraseñaIngresada = String.valueOf(txtPassword.getPassword());

        // Validamos si el usuario y la contraseña son correctos
        if (usuarioIngresado.equals(USUARIO_CORRECTO) && contraseñaIngresada.equals(CONTRA_CORRECTA)) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + USUARIO_CORRECTO + "!", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
            abrirVentanaPrincipal(); // Llamamos al método que abriría la ventana principal
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para abrir la ventana principal (aquí solo mostramos un mensaje por ahora)
    private void abrirVentanaPrincipal() {
        this.dispose(); // Cierra la ventana de login
        
         // Crear listas vacías para usuarios y cuentas (esto dependerá de cómo manejes los datos)
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Cuenta> listaCuentas = new ArrayList<>();

        PantallaPrincipal ventana = new PantallaPrincipal(listaUsuarios, listaCuentas); // Crea una instancia de la nueva ventana
        ventana.setVisible(true); // La hace visible
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1/componentes/jugador 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, -1));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, -1));
        txtPassword.getAccessibleContext().setAccessibleParent(txtPassword);

        btnLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogin.setText("INICIAR SESIÓN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    
    // Método que se ejecutará cuando se presione el botón "Iniciar Sesión"
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        validarLogin(); // Llamamos al método que hace la validación
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
