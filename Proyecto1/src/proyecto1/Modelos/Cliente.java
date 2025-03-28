/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cui;
    private String nombre;
    private String apellido;
    private List<Cuenta> cuentas; // Lista de cuentas asociadas al cliente


    // Constructor
    public Cliente(String cui, String nombre, String apellido) {
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new ArrayList<>(); // Inicializa la lista
    }

    // Getters y Setters
    
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
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
}

