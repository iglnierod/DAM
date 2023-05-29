package accesoBD;

import java.sql.*;
import javax.swing.*;

public class ProcedimientosAlmacenados {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "javadmin";
	static final String CLAVE = "20J@v@23";

	public static void main(String[] args) {
		mostrarEmailsEmpleadosEMEA();
		mostrarEmailEmpleadosDeTerritorio("EMEA");
		mostrarUltimosPagos();
		String producto = JOptionPane.showInputDialog("Introduzca el código del producto");
		double precio = 0;
		try {
			precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del producto"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		actulizarPrecioProducto(producto,precio);
	}

	

	private static void mostrarEmailsEmpleadosEMEA() {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				CallableStatement cs = con.prepareCall("{call ObtenerEmailEmpleadosEMEA}")) {
			try (ResultSet rs = cs.executeQuery()) {
				System.out.println("--------- ObtenerEmailEmpleadosEMEA ---------");
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
				CallableStatement cs = con.prepareCall("{call ObtenerEmailEmpleadosDeTerritorio(?)};")) {
			cs.setString(1, territorio);
			try (ResultSet rs = cs.executeQuery()) {
				System.out.println("--------- mostrarEmailEmpleadosDeTerritorio ---------");
				while (rs.next()) {
					System.out.println(
							rs.getString("Nombre") + " " + rs.getString("Apellidos") + " " + rs.getString("email"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void mostrarUltimosPagos() {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				CallableStatement cs = con.prepareCall("{call ObtenerUltimosPagos};")) {
			try (ResultSet rs = cs.executeQuery()) {
				System.out.println("ULTIMOS 10 PAGOS:");
				System.out.println("-".repeat(62));
				double total = 0;
				while (rs.next()) {
					String fecha = String.format("[%1$tA %1$td de %1$tB de %1$tY]", rs.getDate(3));
					System.out.printf("(%s) %11s %32s: %10.2f\n", rs.getString(1), rs.getString(2), fecha,
							rs.getDouble(4));
					total += rs.getDouble(4);
				}
				System.out.println("-".repeat(62));
				System.out.printf("%51s %10.2f", "TOTAL:", total);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void actulizarPrecioProducto(String codigoProducto, double precio) {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				CallableStatement cs = con.prepareCall("{call ActualizarPrecioProducto(?,?)};")) {
			cs.setString(1, codigoProducto);
			cs.setDouble(2, precio);
			cs.execute();
			System.out.println("Precio actualizado correctamente");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
