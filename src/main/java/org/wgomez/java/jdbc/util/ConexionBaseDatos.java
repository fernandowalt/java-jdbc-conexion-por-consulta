package org.wgomez.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
private static String password = "W@lter1991";
private static String username = "root";
private static String url = "jdbc:mysql://localhost:3306/java_curso?allowPublicKeyRetrieval=true&useSSL" + "=false";

public static Connection getInstance () throws SQLException {
    return DriverManager.getConnection(url, username, password);
}
}