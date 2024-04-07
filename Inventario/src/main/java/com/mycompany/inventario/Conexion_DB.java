package com.mycompany.inventario;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion_DB {

    public Connection conectar_DB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrección en la clase del controlador JDBC
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacenamiento", "root", "Crash229.");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }
}
