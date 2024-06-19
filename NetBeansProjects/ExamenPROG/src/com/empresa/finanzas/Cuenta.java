package com.empresa.finanzas;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una cuenta bancaria.
 * Una cuenta está asociada a un cliente y maneja una lista de transacciones.
 */
public class Cuenta {
    private Cliente cliente;
    private List<Transaccion> transacciones;

    /**
     * Constructor de la clase Cuenta.
     * 
     * @param cliente el cliente asociado a la cuenta
     */
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
        this.transacciones = new ArrayList<>();
    }

    // Métodos para obtener el cliente y las transacciones.

    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método para depositar una cantidad en la cuenta del cliente.
     * 
     * @param monto el monto a depositar
     */
    public void depositar(double monto) {
        cliente.setSaldo(cliente.getSaldo() + monto);
        transacciones.add(new Transaccion("Depósito", monto));
    }

    /**
     * Método para retirar una cantidad de la cuenta del cliente.
     * 
     * @param monto el monto a retirar
     * @throws Exception si el saldo es insuficiente
     */
    public void retirar(double monto) throws Exception {
        if (cliente.getSaldo() >= monto) {
            cliente.setSaldo(cliente.getSaldo() - monto);
            transacciones.add(new Transaccion("Retiro", monto));
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cliente=" + cliente + ", transacciones=" + transacciones + '}';
    }
}

