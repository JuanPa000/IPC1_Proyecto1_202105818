/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Modelos;

/**
 *
 * @author ppabl
 */
public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta; //Ahorro o Corriente
    private Usuario usuario;   //Dueño de la cuenta
    
    //Contructor para inicializar los datos
    public Cuenta(String numeroCuenta, Double saldo, String tipoCuenta, Usuario usuario){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; //Saldo Incial 0
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
        
    }
    
// Getters y Setters
// Los getters y setters sirven para leer y modificar valores de los atributos privados.
// get devuelve valores (return), set los cambia (void).
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    //Creación de metodos (Funciones) Retiro y Deposito
    
    // Metodo Deposito
    public void Deposito(double monto){
    
        if(monto > 0 ){
            this.saldo += monto;
        } else {
            System.out.println("Denegado su deposito tiene que ser mayor a 0.");
        }       
    }
    
    public void Retiro(double monto){
        if(saldo >= saldo && monto > 0) {
            this.saldo -=monto; 
        } else{
            System.out.println("Retiro no válido. Verifique el monto o saldo insuficiente.");
        }
    }
    // Es una anotacion que le dicce al compilador que estamos sobrescribiendo un metodo de la clase base.
    @Override
    
    //Metodo(toString) Se usa para devolver una representación en forma de cadena (String) de un objeto. 
    public String toString() {
        // Cuenta [Número: 123456, Tipo: Ahorro, Saldo: 0.0]
        return "Cuenta [Número: " + numeroCuenta + ", Tipo: " + tipoCuenta + ", Saldo: " + saldo + "]";
    }
}
