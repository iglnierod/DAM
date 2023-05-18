package accesoBD;

import java.sql.*;

public class ModificacionBD {

	public static void main(String[] args) {
		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
		String usuario = "progjava";
		String clave = "J#v#Prog2023";

		String sentenciaSQL = "INSERT INTO offices(officeCode,city,phone,addressLine1,country,postalCode,territory) "
							+ "VALUES('8','A Estrada','+34 111 222 333','Calle Inventada,1','Spain','15700','EMEA');";
		
		sentenciaSQL = "UPDATE offices SET phone = '+34 999 888 777' WHERE officeCode = '8';";
		sentenciaSQL = "DELETE FROM offices WHERE officeCode = '8'";
		try(Connection con = DriverManager.getConnection(urlMysql,usuario,clave);
				Statement stmt = con.createStatement();){
			int res = stmt.executeUpdate(sentenciaSQL);
			System.out.println("Cantidad de registros eliminados: " + res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	}
}
