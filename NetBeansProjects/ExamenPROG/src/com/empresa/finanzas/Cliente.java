package com.empresa.finanzas;

/**
 * Clase que representa a un cliente.
 * Un cliente tiene un ID, nombre, apellido y saldo de cuenta.
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private double saldo;

    /**
     * Constructor de la clase Cliente.
     * 
     * @param id       el ID del cliente
     * @param nombre   el nombre del cliente
     * @param apellido el apellido del cliente
     * @param saldo    el saldo inicial del cliente
     */
    public Cliente(int id, String nombre, String apellido, double saldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    // Métodos getters y setters para cada campo.

    public int getId() {
        return id;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", saldo=" + saldo + '}';
    }
}