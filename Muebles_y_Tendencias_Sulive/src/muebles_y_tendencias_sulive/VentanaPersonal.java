/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muebles_y_tendencias_sulive;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JComboBox;
import Paneles.PersonalEliminar;
import Paneles.PersonalGuardar;
import Paneles.PersonalModificar;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

/**
 *
 * @author ALEJANDRO
 */
public class VentanaPersonal extends JInternalFrame {
    
    private PersonalGuardar p1;
    private PersonalModificar p2;
    private PersonalEliminar p3;
    
    private JTabbedPane pestanas;
    
    public VentanaPersonal() {
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        this.setTitle("PERSONAL DE LA EMPRESA");
        this.setSize(700, 500);
//        this.setLocationRelativeTo(null);
//        this.setLayout(null);    //no permite mostrar las pestanas, no se por que???

        this.setLocation(145, 70);
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(false);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializarComponentes() {
        p1 = new PersonalGuardar();
        p2 = new PersonalModificar();
        p3 = new PersonalEliminar();
        pestanas = new JTabbedPane();
        
        pestanas.add("Guardar", p1);
        pestanas.add("Modificar", p2);
        pestanas.add("Eliminar", p3);
        
        this.add(pestanas);
        
    }
}
