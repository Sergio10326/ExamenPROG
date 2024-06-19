package com.empresa.finanzas;

import java.util.Date;

/**
 * Clase que representa una transacción bancaria.
 * Cada transacción tiene un tipo, un monto y una fecha.
 */
public class Transaccion {
    private String tipo;
    private double monto;
    private Date fecha;

    /**
     * Constructor de la clase Transaccion.
     * 
     * @param tipo  el tipo de transacción (depósito o retiro)
     * @param monto el monto de la transacción
     */
    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = new Date();
    }

    // Métodos getters para cada campo.

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "tipo=" + tipo + ", monto=" + monto + ", fecha=" + fecha + '}';
    }
}
