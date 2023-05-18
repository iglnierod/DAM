package accesoBD;

import java.sql.*;

import com.mysql.cj.jdbc.MysqlDataSource;

public class AccesoBD {

	public static void main(String[] args) {
<<<<<<< HEAD
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.56.21:3306/classicmodels", "progjava",
					"J#v#Prog2023");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * from offices;");

			
			while (rs.next()) {
				String officeCode = null;
				String city = null;
				String phone = null;
				String addressLine1 = null;
				String addressLine2 = null;
				String state = null;
				String country = null;
				String postalCode = null;
				String territory = null;
				for (int i = 0; i < 9; i++) {
					officeCode = rs.getString("officeCode");
					city = rs.getString("city");
					phone = rs.getString("phone");
					addressLine1 = rs.getString("addressLine1");
					addressLine2 = rs.getString("addressLine2");
					state = rs.getString("state");
					country = rs.getString("country");
					postalCode = rs.getString("postalCode");
					territory = rs.getString("territory");
				}
				System.out.println(officeCode + " - " + city + " - " + phone + " - " + addressLine1 + " - "
						+ addressLine2 + " - " + state + " - " + country + " - " + postalCode + " - " + territory);
			}

		} catch (SQLException e) {
			System.err.println("Error al conectar con la BD");
			e.printStackTrace();
=======
//		String urlMysql = "jdbc:mysql://192.168.56.21:3306/classicmodels";
//		String sentenciaSQL = "SELECT orderDate,shippedDate,status,comments,customerNumber FROM orders WHERE orderNumber = 10167;";
//		try (Connection con = DriverManager.getConnection(urlMysql, "progjava", "J#v#Prog2023");
//				Statement stmt = con.createStatement();) {
//			try (ResultSet rs = stmt.executeQuery(sentenciaSQL)) {
//				while (rs.next()) {
//					System.out.println("Nº Cliente: " + rs.getString("customerNumber"));
//					System.out.println("Estado: " + rs.getString("status"));
//					System.out.println("Fecha pedido: " + rs.getString("orderDate"));
//					System.out.println("Fecha envio: " + rs.getString("shippedDate"));
//					System.out.println("Comentarios: " + rs.getString("comments"));
//				}
//			}
//		} catch (SQLException e) {
//			System.err.println("Error al conectar con la BD");
//			e.printStackTrace();
//		}
	
		// JNDI (Java Naming and Directory Interface)
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerName("192.168.56.21");
		dataSource.setPort(3306);
		dataSource.setDatabaseName("classicmodels");
		dataSource.setUser("progjava");
		dataSource.setPassword("J#v#Prog2023");
		
		if(dataSource != null) {
			String sql = "select curdate();";
			try(Connection con = dataSource.getConnection(); Statement stmt = con.createStatement();){
				try(ResultSet rs = stmt.executeQuery(sql);){
					if(rs.next())
						System.out.println("La fecha actual es: " + rs.getDate(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
>>>>>>> 0f4c905342fb9ce76bb5a6f3a67083bf296e4e98
		}
		
	
	}
}
