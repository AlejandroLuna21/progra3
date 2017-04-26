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
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    private JLabel lblDireccion;
    private JLabel lblTelefono;
    private JLabel lblEmail;
    private JLabel lblCargo;
    private JLabel lblSueldo;

    private JTextField txtIdPersonal;
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
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
        lblApellidoPaterno = new JLabel();
        lblApellidoPaterno.setText("Apellido Paterno:");
        lblApellidoPaterno.setBounds(50, 110, 120, 25);
        this.add(lblApellidoPaterno);
        lblApellidoMaterno = new JLabel();
        lblApellidoMaterno.setText("Apellido Materno:");
        lblApellidoMaterno.setBounds(50, 140, 120, 25);
        this.add(lblApellidoMaterno);
        lblDireccion = new JLabel();
        lblDireccion.setText("Direccion");
        lblDireccion.setBounds(50, 170, 90, 25);
        this.add(lblDireccion);
        lblTelefono = new JLabel();
        lblTelefono.setText("Telefono:");
        lblTelefono.setBounds(50, 200, 90, 25);
        this.add(lblTelefono);
        lblEmail = new JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBounds(50, 230, 90, 25);
        this.add(lblEmail);
        lblCargo = new JLabel();
        lblCargo.setText("Cargo:");
        lblCargo.setBounds(50, 260, 90, 25);
        this.add(lblCargo);
        lblSueldo = new JLabel();
        lblSueldo.setText("Sueldo: ");
        lblSueldo.setBounds(50, 290, 90, 25);
        this.add(lblSueldo);
        txtIdPersonal = new JTextField();
        txtIdPersonal.setBounds(170, 50, 150, 25);
        this.add(txtIdPersonal);
        txtNombre = new JTextField();
        txtNombre.setBounds(170, 80, 150, 25);
        this.add(txtNombre);
        txtApellidoPaterno = new JTextField();
        txtApellidoPaterno.setBounds(170, 110, 150, 25);
        this.add(txtApellidoPaterno);
        txtApellidoMaterno = new JTextField();
        txtApellidoMaterno.setBounds(170, 140, 150, 25);
        this.add(txtApellidoMaterno);
        txtDireccion = new JTextField();
        txtDireccion.setBounds(170, 170, 150, 25);
        this.add(txtDireccion);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(170, 200, 150, 25);
        this.add(txtTelefono);
        txtEmail = new JTextField();
        txtEmail.setBounds(170, 230, 150, 25);
        this.add(txtEmail);
        cbxCargo = new JComboBox();
        cbxCargo.setBounds(170, 260, 150, 25);
        cbxCargo.addItem("Seleccione Opcion");
        cbxCargo.addItem("Acomodador");
        this.add(cbxCargo);
        txtSueldo = new JTextField();
        txtSueldo.setBounds(170, 290, 150, 25);
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
