/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class PersonalModificar extends JPanel {
    
//    private JLabel
    
    private JTextField txtBuscar;
    
    private JTable tPantalla;
    private DefaultTableModel modelo;
    
    private JButton btnBuscar;
    
    
    public PersonalModificar(){
        super();
        configurarPanel();
        iniciarComponentes();
    }
    private void configurarPanel(){
        this.setLayout(null);
        this.setBackground(Color.lightGray);
    }
    private void iniciarComponentes(){
        txtBuscar = new JTextField();
        txtBuscar.setBorder(BorderFactory.createTitledBorder("ingrese el id del personal que desea buscar:"));
//        txtBuscar.setText("Escriba Aqui");
        txtBuscar.setBounds(600, 50, 280, 45);
        this.add(txtBuscar);
        btnBuscar = new JButton();
        btnBuscar.setText("B  U   S   C   A   R");
        btnBuscar.setBounds(1000, 50, 280, 50);
        this.add(btnBuscar);
        modelo = new DefaultTableModel();
        modelo.setColumnCount(5);
        modelo.setRowCount(3);
        modelo.addColumn("id_personal");
//        modelo.addRow("hola");
//        modelo.addColumn("nombre");
//        modelo.addColumn("apellido_paterno");
//        modelo.addColumn("apellido_materno");
//        modelo.addColumn("ci");
//        modelo.addColumn("telefono");
//        modelo.addColumn("email");
        tPantalla = new JTable(modelo);
        tPantalla.setBounds(50, 200, 700, 500);
        this.add(tPantalla);
    }
}
