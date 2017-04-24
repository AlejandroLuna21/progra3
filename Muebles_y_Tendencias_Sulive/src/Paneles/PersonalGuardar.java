/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro Machaca Luna
 */
public class PersonalGuardar extends JPanel implements ActionListener {

    private JLabel lblIdPersonal;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblDireccion;
    private JLabel lblTelefono;
    private JLabel lblEmail;
    private JLabel lblCargo;
    private JLabel lblSueldo;

    private JTextField txtIdPersonal;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JComboBox cbxCargo;
    private JTextField txtSueldo;

    private JButton btnGuardar;

    public PersonalGuardar() {
        configurarPanel();
        inicializarComponentes();
    }

    private void configurarPanel() {
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }

    private void inicializarComponentes() {
        lblIdPersonal = new JLabel();
        lblIdPersonal.setText("Id Personal:");
        lblIdPersonal.setBounds(50, 50, 90, 25);
        this.add(lblIdPersonal);
        lblNombre = new JLabel();
        lblNombre.setText("Nombre:");
        lblNombre.setBounds(50, 80, 90, 25);
        this.add(lblNombre);
        lblApellido = new JLabel();
        lblApellido.setText("Apellido:");
        lblApellido.setBounds(50, 110, 90, 25);
        this.add(lblApellido);
        lblDireccion = new JLabel();
        lblDireccion.setText("Direccion");
        lblDireccion.setBounds(50, 140, 90, 25);
        this.add(lblDireccion);
        lblTelefono = new JLabel();
        lblTelefono.setText("Telefono:");
        lblTelefono.setBounds(50, 170, 90, 25);
        this.add(lblTelefono);
        lblEmail = new JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBounds(50, 200, 90, 25);
        this.add(lblEmail);
        lblCargo = new JLabel();
        lblCargo.setText("Cargo:");
        lblCargo.setBounds(50, 230, 90, 25);
        this.add(lblCargo);
        lblSueldo = new JLabel();
        lblSueldo.setText("Sueldo: ");
        lblSueldo.setBounds(50, 260, 90, 25);
        this.add(lblSueldo);
        txtIdPersonal = new JTextField();
        txtIdPersonal.setBounds(150, 50, 150, 25);
        this.add(txtIdPersonal);
        txtNombre = new JTextField();
        txtNombre.setBounds(150, 80, 150, 25);
        this.add(txtNombre);
        txtApellido = new JTextField();
        txtApellido.setBounds(150, 110, 150, 25);
        this.add(txtApellido);
        txtDireccion = new JTextField();
        txtDireccion.setBounds(150, 140, 150, 25);
        this.add(txtDireccion);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(150, 170, 150, 25);
        this.add(txtTelefono);
        txtEmail = new JTextField();
        txtEmail.setBounds(150, 200, 150, 25);
        this.add(txtEmail);
        cbxCargo = new JComboBox();
        cbxCargo.setBounds(150, 230, 150, 25);
        cbxCargo.addItem("Seleccione Opcion");
        cbxCargo.addItem("Acomodador");
        this.add(cbxCargo);
        txtSueldo = new JTextField();
        txtSueldo.setBounds(150, 260, 150, 25);
        this.add(txtSueldo);
        btnGuardar = new JButton();
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBounds(400, 150, 100, 50);
        btnGuardar.addActionListener(this);
        this.add(btnGuardar);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
