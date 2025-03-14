
package proyecto1.Modelos;

/**
 *
 * @author ppabl
 */

// Esta Clase tendra los Atributos id, nombre, apellido, usuario, pasword, tipoUser
// Metodos que usaremos getters y setters, Estos nos ayudaran a acceder y modificar los Atributos
// Sera el COntrucor para inicializar los datos
public class Usuario {
    // Creamos todas las variables privadas para esta clase 
    private int id;
    private String nombre;
    private String apellido;
    private String tipoUsuario;
    private String password;
    private String usuario;
    
    //Constructor
public Usuario(int id, String nombre, String apellido, String usuario, String password, String tipoUsuario){
    this.id = id; // Aquí le decimos que el atributo id de la clase es igual al id recibido
    this.nombre = nombre;
    this.apellido = apellido;
    this.usuario = usuario;
    this.password = password;
    this.tipoUsuario = tipoUsuario;

}

// Getters y Setters
// Los getters y setters sirven para leer y modificar valores de los atributos privados.
// get devuelve valores (return), set los cambia (void).
    public int getId() {
        return id;
    }
    //void significa que no devuelve valor
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
    


