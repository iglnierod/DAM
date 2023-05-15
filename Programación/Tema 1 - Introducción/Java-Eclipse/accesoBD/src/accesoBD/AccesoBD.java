package accesoBD;

import java.sql.*;

public class AccesoBD {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.56.21:3306/classicmodels", "progjava",
					"J#v#Prog2023");

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM offices;");

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
		}
	}
}
