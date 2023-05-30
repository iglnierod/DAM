package accesoBD;

import java.sql.*;

public class ProcedimientosAlmacenados {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "javadmin";
	static final String CLAVE = "20J@v@23";

	public static void main(String[] args) {
		mostrarEmailsEmpleadosEMEA();
		mostrarEmailEmpleadosDeTerritorio("EMEA");
	}

	private static void mostrarEmailsEmpleadosEMEA() {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				CallableStatement cs = con.prepareCall("{call ObtenerEmailEmpleadosEMEA}")) {
			try (ResultSet rs = cs.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void mostrarEmailEmpleadosDeTerritorio(String territorio) {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				CallableStatement cs = con.prepareCall("{call ObtenerEmailEmpleadosDeTerritorio(" + territorio + ");}")) {
			try (ResultSet rs = cs.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getString(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
