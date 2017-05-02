/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Metodos.MetodoPersonal;
import Metodos.Personal;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro Machaca Luna
 */
public class PersonalGuardar extends JPanel implements ActionListener {

    //  componentes de tipo JLabel en orden de aparicion
    private JLabel lblDPersonales;
    private JLabel lblIdPersonal;
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
    private JTextField txtIdPersonal;
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
    private JDateChooser dcFin;

    private JButton btnGuardar;
    private JButton btnCancelar;

    private Personal p1;
    private MetodoPersonal mP1;

    private int anio;
    private int mes;
    private int dia;

    public PersonalGuardar() {
        configurarPanel();
        inicializarComponentes();
    }

    private void configurarPanel() {
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }

    private void inicializarComponentes() {

        lblDPersonales = new JLabel();
        lblDPersonales.setText("DATOS PERSONALES:");
        lblDPersonales.setBounds(30, 20, 130, 25);
        this.add(lblDPersonales);
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
        lblNacimiento = new JLabel();
        lblNacimiento.setText("Fecha de Nacimiento:");
        lblNacimiento.setBounds(50, 170, 130, 25);
        this.add(lblNacimiento);
        lblCi = new JLabel();
        lblCi.setText("Celula de Indentidad");
        lblCi.setBounds(50, 200, 120, 25);
        this.add(lblCi);
        lblDireccion = new JLabel();
        lblDireccion.setText("Direccion:");
        lblDireccion.setBounds(50, 270, 90, 25);
        this.add(lblDireccion);
        lblAoC = new JLabel();
        lblAoC.setText("Avenida o Calle:");
        lblAoC.setBounds(200, 230, 90, 25);
        this.add(lblAoC);
        lblAoCC = new JLabel();
        lblAoCC.setText("Avenidas o Calles colindantes:");
        lblAoCC.setBounds(370, 230, 180, 25);
        this.add(lblAoCC);
        lblND = new JLabel();
        lblND.setText("Numero de domicilio:");
        lblND.setBounds(200, 280, 120, 25);
        this.add(lblND);
//        lblZona = new JLabel();
//        lblZona.setText("Zona:");
//        lblZona.setBounds(370, 280, 120, 25);
//        this.add(lblZona);
        lblTelefono = new JLabel();
        lblTelefono.setText("Telefono:");
        lblTelefono.setBounds(50, 340, 90, 25);
        this.add(lblTelefono);
        lblEmail = new JLabel();
        lblEmail.setText("Email:");
        lblEmail.setBounds(50, 370, 90, 25);
        this.add(lblEmail);
        lblDLaborales = new JLabel();
        lblDLaborales.setText("DATOS LABORALES:");
        lblDLaborales.setBounds(30, 410, 120, 25);
        this.add(lblDLaborales);
        lblTipoPersonal = new JLabel();
        lblTipoPersonal.setText("Tipo de  Personal:");
        lblTipoPersonal.setBounds(50, 440, 120, 25);
        this.add(lblTipoPersonal);
        lblSueldo = new JLabel();
        lblSueldo.setText("Sueldo:");
        lblSueldo.setBounds(50, 490, 90, 25);
        this.add(lblSueldo);
        lblFechaInicio = new JLabel();
        lblFechaInicio.setText("Inicio de Actividades:");
        lblFechaInicio.setBounds(50, 520, 120, 25);
        this.add(lblFechaInicio);
        lblFechaFin = new JLabel();
        lblFechaFin.setText("Fin de Actividades:");
        lblFechaFin.setBounds(50, 550, 120, 25);
        this.add(lblFechaFin);

        txtIdPersonal = new JTextField();
        txtIdPersonal.setBounds(200, 50, 150, 25);
        this.add(txtIdPersonal);
        txtNombre = new JTextField();
        txtNombre.setBounds(200, 80, 150, 25);
        this.add(txtNombre);
        txtApellidoPaterno = new JTextField();
        txtApellidoPaterno.setBounds(200, 110, 150, 25);
        this.add(txtApellidoPaterno);
        txtApellidoMaterno = new JTextField();
        txtApellidoMaterno.setBounds(200, 140, 150, 25);
        this.add(txtApellidoMaterno);
        dcNacimiento = new JDateChooser();
        dcNacimiento.setBounds(200, 170, 150, 25);
        this.add(dcNacimiento);
        txtCi = new JTextField();
        txtCi.setBounds(200, 200, 150, 25);
        this.add(txtCi);
        txtAoC = new JTextField();
        txtAoC.setBounds(200, 250, 150, 25);
        this.add(txtAoC);
        txtAoCC = new JTextField();
        txtAoCC.setBounds(370, 250, 150, 25);
        this.add(txtAoCC);
        txtND = new JTextField();
        txtND.setBounds(200, 300, 150, 25);
        this.add(txtND);
//        txtZona = new JTextField();
//        txtZona.setBounds(370, 300, 150, 25);
//        this.add(txtZona);
        txtTelefono = new JTextField();
        txtTelefono.setBounds(200, 340, 150, 25);
        this.add(txtTelefono);
        txtEmail = new JTextField();
        txtEmail.setBounds(200, 370, 150, 25);
        this.add(txtEmail);
        cbxCargo = new JComboBox();
        cbxCargo.setBounds(200, 440, 150, 40);
        cbxCargo.setBorder(BorderFactory.createTitledBorder("Seleccione una Opcion:"));
//        cbxCargo.addItem("Seleccione Opcion");
        cbxCargo.addItem("Administrador");
        cbxCargo.addItem("Secretaria");
        cbxCargo.addItem("Disenador");
        cbxCargo.addItem("Acomodador");
        this.add(cbxCargo);
        txtSueldo = new JTextField();
        txtSueldo.setBounds(200, 490, 150, 25);
        this.add(txtSueldo);
        dcInicio = new JDateChooser();
        dcInicio.setBounds(200, 520, 150, 25);
        this.add(dcInicio);
        dcFin = new JDateChooser();
        dcFin.setBounds(200, 550, 150, 25);
//        dcFin.setDateFormatString("yyyy-MM-dd");
        this.add(dcFin);

        btnGuardar = new JButton();
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBounds(450, 505, 100, 50);
        btnGuardar.addActionListener(this);
        this.add(btnGuardar);
        btnCancelar = new JButton();
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBounds(600, 505, 100, 50);
        btnCancelar.addActionListener(this);
        this.add(btnCancelar);
    }

    public void getDatos() {
        p1 = new Personal();
        mP1 = new MetodoPersonal();
        p1.setIdPer(Integer.parseInt(txtIdPersonal.getText()));
        p1.setNombre(txtNombre.getText());
        p1.setAp(txtApellidoPaterno.getText());
        p1.setAm(txtApellidoMaterno.getText());
        anio = dcNacimiento.getCalendar().get(Calendar.YEAR);
        mes = dcNacimiento.getCalendar().get(Calendar.MONTH);
        dia = dcNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH);
        p1.setFN(anio + "-" + (mes + 1) + "-" + dia);
        p1.setCi(txtCi.getText());
        p1.setDir(txtAoC.getText() + " entre " + txtAoCC.getText() + " N° " + txtND.getText());
        p1.setTel(Integer.parseInt(txtTelefono.getText()));
        p1.setEmail(txtEmail.getText());
        p1.setSuel(Float.parseFloat(txtSueldo.getText()));
        anio = dcInicio.getCalendar().get(Calendar.YEAR);
        mes = dcInicio.getCalendar().get(Calendar.MONTH);
        dia = dcInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
        p1.setFI(anio + "-" + (mes + 1) + "-" + dia);
        anio = dcFin.getCalendar().get(Calendar.YEAR);
        mes = dcFin.getCalendar().get(Calendar.MONTH);
        dia = dcFin.getCalendar().get(Calendar.DAY_OF_MONTH);
        p1.setFF(anio+"-"+(mes+1)+"-"+dia);
        p1.setIdTipPer((cbxCargo.getSelectedIndex() + 1));//Pendiente
        try {
            mP1.setDate(p1);
            JOptionPane.showMessageDialog(null, "Se Guardo Correctamente los Datos");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar los datos" + e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnGuardar) {
            getDatos();
        }
    }
}
