package com.empresa.finanzas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Clase que representa la interfaz gráfica de la aplicación.
 */
public class GUI {
    private JFrame frame;
    private JTextField idField, nombreField, apellidoField, montoField;
    private JTextArea displayArea;
    private JButton addClienteButton, depositarButton, retirarButton;
    private ArrayList<Cliente> clientes;

    /**
     * Constructor de la clase GUI.
     * Inicializa la interfaz gráfica y sus componentes.
     */
    public GUI() {
        clientes = new ArrayList<>();

        frame = new JFrame("Gestión de Finanzas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 2));

        idField = new JTextField();
        nombreField = new JTextField();
        apellidoField = new JTextField();
        montoField = new JTextField();
        displayArea = new JTextArea();

        addClienteButton = new JButton("Agregar Cliente");
        depositarButton = new JButton("Depositar");
        retirarButton = new JButton("Retirar");

        // Añadir componentes al frame
        frame.add(new JLabel("ID:"));
        frame.add(idField);
        frame.add(new JLabel("Nombre:"));
        frame.add(nombreField);
        frame.add(new JLabel("Apellido:"));
        frame.add(apellidoField);
        frame.add(addClienteButton);
        frame.add(new JLabel("Monto:"));
        frame.add(montoField);
        frame.add(depositarButton);
        frame.add(retirarButton);
        frame.add(new JScrollPane(displayArea));

        // Acción para agregar un cliente
        addClienteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                Cliente cliente = new Cliente(id, nombre, apellido, 0.0);
                clientes.add(cliente);
                displayArea.append("Cliente agregado: " + cliente + "\n");
            }
        });

        // Acción para realizar un depósito
        depositarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                double monto = Double.parseDouble(montoField.getText());
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        try {
                            Cuenta cuenta = new Cuenta(cliente);
                            cuenta.depositar(monto);
                            displayArea.append("Depósito realizado. Nuevo saldo: " + cliente.getSaldo() + "\n");
                        } catch (Exception ex) {
                            displayArea.append("Error: " + ex.getMessage() + "\n");
                        }
                    }
                }
            }
        });

        // Acción para realizar un retiro
        retirarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                double monto = Double.parseDouble(montoField.getText());
                for (Cliente cliente : clientes) {
                    if (cliente.getId() == id) {
                        try {
                            Cuenta cuenta = new Cuenta(cliente);
                            cuenta.retirar(monto);
                            displayArea.append("Retiro realizado. Nuevo saldo: " + cliente.getSaldo() + "\n");
                        } catch (Exception ex) {
                            displayArea.append("Error: " + ex.getMessage() + "\n");
                        }
                    }
                }
            }
        });

        frame.setVisible(true);
    }
}