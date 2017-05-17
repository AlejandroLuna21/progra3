/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
//import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class PersonalModificar extends JPanel implements ActionListener {
    
//    private JLabel
    
    private JTextField txtBuscar;
    
//    private JTable tPantalla;
//    private final DefaultTableModel modelo = new DefaultTableModel();
    
    private JButton btnBuscar;
    private JList lLista;
//    private String datos[];
//    private String datos2 [][];
    
    //Modificacion de copy and past
    
    
        //  componentes de tipo JLabel en orden de aparicion
    private JLabel lblDPersonales;
//    private JLabel lblIdPersonal;
    private JLabel lblNombre;
    private JLabel lblApellidoPaterno;
    private JLabel lblApellidoMaterno;
    private JLabel lblNacimiento;
    private JLabel lblCi;
    private JLabel lblDireccion;
    private JLabel lblAoC;
    private JLabel lblAoCC;
    private JLabel lblND;
//    private JLabel lblZona;
    private JLabel lblTelefono;
    private JLabel lblEmail;
    private JLabel lblDLaborales;
    private JLabel lblTipoPersonal;
    private JLabel lblSueldo;
    private JLabel lblFechaInicio;
    private JLabel lblFechaFin;
//  componentes de tipo JTextField en orden de aparicion
//    private JTextField txtIdPersonal;
    private JTextField txtNombre;
    private JTextField txtApellidoPaterno;
    private JTextField txtApellidoMaterno;
    private JDateChooser dcNacimiento;
    private JTextField txtCi;
    private JTextField txtAoC;
    private JTextField txtAoCC;
    private JTextField txtND;
//    private JTextField txtZona;
    private JTextField txtTelefono;
    private JTextField txtEmail;

    private JComboBox cbxCargo;

    private JTextField txtSueldo;
    private JDateChooser dcInicio;
//    private JDateChooser dcFin;

    private JButton btnGuardar;
    private JButton btnCancelar;

    
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
        txtBuscar.setBounds(50, 50, 280, 45);
        this.add(txtBuscar);
        btnBuscar = new JButton();
        btnBuscar.setText("B  U   S   C   A   R");
        btnBuscar.setBounds(400, 50, 280, 50);
        this.add(btnBuscar);
        
        lLista = new JList();
        lLista.setBounds(150, 200, 400, 700);
        this.add(lLista);
        
        
        //
        lblDPersonales = new JLabel();
        lblDPersonales.setText("DATOS PERSONALES:");
        lblDPersonales.setBounds(1000, 20, 130, 25);
        this.add(lblDPersonales);
//        lblIdPersonal = new JLabel();
//        lblIdPersonal.setText("Id Personal:");
//        lblIdPersonal.setBounds(650, 45, 90, 25);
//        this.add(lblIdPersonal);
        lblNombre = new JLabel();
        lblNombre.setText("Nombre:");
        lblNombre.setBounds(1050, 90, 90, 25);
        this.add(lblNombre);
        lblApellidoPaterno = new JLabel();
        lblApellidoPaterno.setText("Apellido Paterno:");
        lblApellidoPaterno.setBounds(1050, 135, 120, 25);
        this.add(lblApellidoPaterno);
        lblApellidoMaterno = new JLabel();
        lblApellidoMaterno.setText("Apellido Materno:");
        lblApellidoMaterno.setBounds(1050, 180, 120, 25);
        this.add(lblApellidoMaterno);
        lblNacimiento = new JLabel();
        lblNacimiento.setText("Fecha de Nacimiento:");
        lblNacimiento.setBounds(1050, 225, 130, 25);
        this.add(lblNacimiento);
        lblCi = new JLabel();
        lblCi.setText("Celula de Indentidad");
        lblCi.setBounds(1050, 270, 120, 25);
        this.add(lblCi);
        lblDireccion = new JLabel();
        lblDireccion.setText("Direccion:");
        lblDireccion.setBounds(1050, 330, 90, 25);
        this.add(lblDireccion);
        lblAoC = new JLabel();
        lblAoC.setText("Avenida o Calle:");
        lblAoC.setBounds(1200, 300, 90, 25);
        this.add(lblAoC);
        lblAoCC = new JLabel();
        lblAoCC.setText("Avenidas o Calles colindantes:");
        lblAoCC.setBounds(1420, 300, 180, 25);
        this.add(lblAoCC);
        lblND = new JLabel();
        lblND.setText("Numero de domicilio:");
        lblND.setBounds(1200, 360, 120, 25);
        this.add(lblND);
        lblTelefono = new JLabel();
        lblTelefono.setText("Telefono:");
        lblTelefono.setBounds(1050, 430, 90, 25);
        this.add(lblTelefono);
        lblEmail = new JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBounds(1050, 475, 90, 25);
        this.add(lblEmail);
        lblDLaborales = new JLabel();
        lblDLaborales.setText("DATOS LABORALES:");
        lblDLaborales.setBounds(1000, 530, 120, 25);
        this.add(lblDLaborales);
        lblTipoPersonal = new JLabel();
        lblTipoPersonal.setText("Tipo de  Personal:");
        lblTipoPersonal.setBounds(1050, 565, 120, 25);
        this.add(lblTipoPersonal);
        lblSueldo = new JLabel();
        lblSueldo.setText("Sueldo:");
        lblSueldo.setBounds(1050, 620, 90, 25);
        this.add(lblSueldo);
        lblFechaInicio = new JLabel();
        lblFechaInicio.setText("Inicio de Actividades:");
        lblFechaInicio.setBounds(1050, 665, 120, 25);
        this.add(lblFechaInicio);
        lblFechaFin = new JLabel();
//        lblFechaFin.setText("Fin de Actividades:");
//        lblFechaFin.setBounds(650, 550, 120, 25);
//        this.add(lblFechaFin);
//
//        txtIdPersonal = new JTextField();
//        txtIdPersonal.setBounds(800, 45, 200, 25);
//        this.add(txtIdPersonal);
        txtNombre = new JTextField();
        txtNombre.setBounds(1200, 90, 200, 25);
        this.add(txtNombre);
        txtApellidoPaterno = new JTextField();
        txtApellidoPaterno.setBounds(1200, 135, 200, 25);
        this.add(txtApellidoPaterno);
        txtApellidoMaterno = new JTextField();
        txtApellidoMaterno.setBounds(1200, 180, 200, 25);
        this.add(txtApellidoMaterno);
        dcNacimiento = new JDateChooser();
        dcNacimiento.setBounds(1200, 225, 200, 25);
        this.add(dcNacimiento);
        txtCi = new JTextField();
        txtCi.setBounds(1200, 270, 200, 25);
        this.add(txtCi);
        txtAoC = new JTextField();
        txtAoC.setBounds(1200, 320, 200, 25);
        this.add(txtAoC);
        txtAoCC = new JTextField();
        txtAoCC.setBounds(1420, 320, 200, 25);
        this.add(txtAoCC);
        txtND = new JTextField();
        txtND.setBounds(1200, 380, 200, 25);
        this.add(txtND);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(1200, 430, 200, 25);
        this.add(txtTelefono);
        txtEmail = new JTextField();
        txtEmail.setBounds(1200, 475, 200, 25);
        this.add(txtEmail);
        cbxCargo = new JComboBox();
        cbxCargo.setBounds(1200, 565, 200, 40);
        cbxCargo.setBorder(BorderFactory.createTitledBorder("Seleccione una Opcion:"));
        cbxCargo.setSelectedItem(null);
        this.add(cbxCargo);
        txtSueldo = new JTextField();
        txtSueldo.setBounds(1200, 620, 200, 25);
        this.add(txtSueldo);
        dcInicio = new JDateChooser();
        dcInicio.setBounds(1200, 665, 200, 25);
        dcInicio.setDateFormatString("yyyy-MM-dd");
        this.add(dcInicio);
//        dcFin = new JDateChooser();
//        dcFin.setBounds(800, 550, 150, 25);
//////        dcFin.setDateFormatString("yyyy-MM-dd");
//        this.add(dcFin);
//
        btnGuardar = new JButton();
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBounds(1000, 800, 200, 100);
        btnGuardar.addActionListener(this);
        this.add(btnGuardar);
        btnCancelar = new JButton();
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBounds(1300, 800, 200, 100);
        btnCancelar.addActionListener(this);
        this.add(btnCancelar);
        //Aqui acaba copy and past
     /*   
        datos = new String[3];
        datos[0]="78945612";
        datos[1]="Pedrito";
        datos[2]= "Fernandez";
        
        datos2 = new String[1][3];
        datos2[0][0]= "Id Personal";
        datos2[0][1]= "Nombre";
        datos2[0][2]= "Apellido";
      
        tPantalla = new JTable(datos2, datos);
//        tPantalla.setModel(modelo);
        tPantalla.setBounds(100,100,700,400);
        this.add(tPantalla);
        
//        modelo = new DefaultTableModel();
//        modelo.setColumnCount(5);
//        modelo.setRowCount(3);
//        modelo.addColumn("id_personal");
////        modelo.addRow("hola");
////        modelo.addColumn("nombre");
////        modelo.addColumn("apellido_paterno");
////        modelo.addColumn("apellido_materno");
////        modelo.addColumn("ci");
////        modelo.addColumn("telefono");
////        modelo.addColumn("email");
//        tPantalla = new JTable(modelo);
//        tPantalla.setBounds(50, 200, 700, 500);
//        this.add(tPantalla);
*/
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
