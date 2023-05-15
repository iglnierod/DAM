package accesoBD;

import java.sql.*;

public class AccesoBD {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.56.21:3306/classicmodels", "progjava",
					"J#v#Prog2023");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM offices;");

			while(rs.next()) {
				for(int i = 0; i < 9; i++) {
					String officeCode = rs.getString("officeCode");
					String city = rs.getString("city");
					String phone = rs.getString("phone");
					String addressLine1 = rs.getString("addressLine1");
					String addressLine2 = rs.getString("addressLine2");
					String state = rs.getString("state");
					String country = rs.getString("country");
					String postalCode = rs.getString("postalCode");
					String territory = rs.getString("territory");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			System.err.println("Error al conectar con la BD");	
			e.printStackTrace();
		}
	}
}
