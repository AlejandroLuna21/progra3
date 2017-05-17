/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ALEJANDRO
 */
public class PersonalEliminar extends JPanel {

    private JTextField txtBuscar;
    private JButton btnBuscar;
    private JButton btnEliminar;
    private JList lLista;

    public PersonalEliminar() {
        super();
        configurarPanel();
        iniciarComponentes();
    }

    private void configurarPanel() {
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }
    private void iniciarComponentes(){
        txtBuscar = new JTextField();
        txtBuscar.setBorder(BorderFactory.createTitledBorder("ingrese el id del personal que desea buscar:"));
        txtBuscar.setBounds(750, 50, 400, 45);
        this.add(txtBuscar);
        btnBuscar = new JButton();
        btnBuscar.setText("B  U   S   C   A   R");
        btnBuscar.setBounds(1200, 200, 280, 50);
        this.add(btnBuscar);
        btnEliminar = new JButton();
        btnEliminar.setText("E  L   I   M   I   N   A  R");
        btnEliminar.setBounds(1200, 300, 280, 50);
        this.add(btnEliminar);
        
        
        lLista = new JList();
        lLista.setBounds(750, 200, 400, 700);
        this.add(lLista);
    }
}
