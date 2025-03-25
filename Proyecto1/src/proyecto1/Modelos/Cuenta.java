package proyecto1.Modelos;

/**
 * Clase Cuenta que representa una cuenta bancaria de un usuario.
 */
public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Usuario usuario; // Dueño de la cuenta

    /**
     * Constructor para inicializar los datos de la cuenta.
     * @param numeroCuenta Número único de la cuenta.
     * @param usuario Cliente dueño de la cuenta.
     */
    public Cuenta(String numeroCuenta, Usuario usuario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; // Saldo inicial de 0
        this.usuario = usuario;
    }

    // Getters y Setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método para depositar dinero en la cuenta.
     * @param monto Cantidad a depositar (debe ser mayor a 0).
     */
    public void Deposito(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso: Q" + monto);
        } else {
            System.out.println("Error: El depósito debe ser mayor a 0.");
        }
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param monto Cantidad a retirar.
     */
    public void Retiro(double monto) {
        if (monto > 0 && saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso: Q" + monto);
        } else {
            System.out.println("Error: Saldo insuficiente o monto inválido.");
        }
    }

    @Override
    public String toString() {
        return "Cuenta [Número: " + numeroCuenta + ", Saldo: Q" + saldo + "]";
    }
}
