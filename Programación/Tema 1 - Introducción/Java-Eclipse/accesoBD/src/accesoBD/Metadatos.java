package accesoBD;

import java.sql.*;

public class Metadatos {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "javadmin";
	static final String CLAVE = "20J@v@23";

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE)){
			// Metadatos de la conexción
			DatabaseMetaData metadatos = con.getMetaData();
			System.out.println("SGBD: " + metadatos.getDatabaseProductName());
			System.out.println("Versión SGBD: " + metadatos.getDatabaseProductVersion());
			System.out.println("Driver: " + metadatos.getDriverName());
			System.out.println("Versión Driver: " + metadatos.getDriverVersion());
			System.out.println("\nTABLAS BD:");
			// Metadatos de tablas
			try(ResultSet rs = metadatos.getTables("classicmodels", null, "%"/*"o%"*/, null)){
				while(rs.next()) {
					System.out.println("Base de datos: " + rs.getString("TABLE_CAT") + "  NOMBRE: " + rs.getString("TABLE_NAME")
							+ "  TIPO: " + rs.getString("TABLE_TYPE"));
				}
			}
			// Metadatos procedimientos
			System.out.println("\nPROCEDIMIENTOS ALMACENADOS:");
			try(ResultSet rs = metadatos.getProcedures(null, null, "%")){
				while(rs.next()) {
					System.out.println("Base de datos: " + rs.getString("PROCEDURE_CAT") + "  NOMBRE: " + rs.getString("PROCEDURE_NAME")
					+ "  TIPO: " + rs.getString("PROCEDURE_TYPE"));
				}
			}
			
			// Datos de columnas
			System.out.println("\nCOLUMNAS:");
			try(ResultSet rs = metadatos.getColumns(null, "classicmodels", "orders", null)){
				while(rs.next()) {
					System.out.println(rs.getString("TABLE_NAME") + ": " + rs.getString("TYPE_NAME") +"(" + rs.getString("COLUMN_SIZE") + ")");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
