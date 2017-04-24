/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muebles_y_tendencias_sulive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALEJANDRO
 */
public final class Conexion {

    private static Connection conn;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/muebles_y_tendencias_sulive";

    private Statement stm;

    public Conexion() {
        establecerConexion();
    }

    private void establecerConexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
    }

}
