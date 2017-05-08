/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import muebles_y_tendencias_sulive.Conexion;

/**
 *
 * @author ALEJANDRO
 */
public class MetodoPersonal {

    private final Conexion cn = new Conexion();
    Connection conn = cn.getConnection();

    public MetodoPersonal() {

    }

    public void setDate(Personal p) {

        try {

            PreparedStatement pst = conn.prepareStatement("INSERT INTO personal(id_personal,"
                                                         + "nombre,apellido_paterno,apellido_materno,"
                                                         + "fecha_nacimiento,ci,direccion,telefono,"
                                                         + "email,sueldo,fecha_inicio_actividades,"
                                                       + "id_tipo_personal) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, p.getIdPer());
            pst.setString(2, p.getNombre());
            pst.setString(3, p.getAp());
            pst.setString(4, p.getAm());
            pst.setString(5, p.getFN());
            pst.setString(6,p.getCi());
            pst.setString(7,p.getDir());
            pst.setInt(8, p.getTel());
            pst.setString(9, p.getEmail());
            pst.setFloat(10, p.getSuel());
            pst.setString(11, p.getFI());
//            pst.setString(12, p.getFF());
            pst.setInt(12, p.getIdTipPer());
            pst.executeUpdate();
            
            cn.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar los datos"+e);
        }
        
    }
}
