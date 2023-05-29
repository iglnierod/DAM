package accesoBD;

import java.sql.*;

public class Transacciones {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "progjava";
	static final String CLAVE = "J#v#Prog2023";

	public static void main(String[] args) {
//		String setenciaInsertarCliente = "INSERT INTO customers(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,city,country)"
//				+ "VALUES (2044,'Rastrilo, S.L','Chosco','Pedro','+34 666 444 333','Avda. Sanabria, 32','A Estrada','Spain')";
//
//		String sentenciaInsertarPedido = "INSERT INTO orders(orderNumber,orderDate,requiredDate,status,customerNumber) "
//				+ "VALUES (10600,'2023-05-25','2023-05-31','Procesando',2044);";
//
//		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE)) {
//			con.setAutoCommit(false); // Por defecto a true
//			try (Statement stmt = con.createStatement()) {
//				stmt.executeUpdate(setenciaInsertarCliente);
//				stmt.executeUpdate(sentenciaInsertarPedido);
//				con.commit();
//				System.out.println("Pedido introducido correctamente");
//			} catch (SQLException e) {
//				con.rollback();
//				System.err.println("Se ha producido un error al intentar introducir el pedido,"
//						+ " por lo que se ha abortado el proceso.");
//				e.printStackTrace();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		int numRegistrosInsertados = 0;
//		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
//				Statement stmt = con.createStatement()) {
//			for (int i = 2030; i < 2050; i++) {
//				numRegistrosInsertados += stmt.executeUpdate(
//						"INSERT INTO customers(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,city,country)"
//								+ "VALUES (" + i
//								+ ",'Rastrilo, S.L','Chosco','Pedro','+34 666 444 333','Avda. Sanabria, 32','A Estrada','Spain');");
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Cantidad de registros insertados: " + numRegistrosInsertados);
		int numRegistrosInsertados = 0;
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE)) {
			con.setAutoCommit(false);
			try (Statement stmt = con.createStatement()) {
				for (int i = 2030; i < 2050; i++) {
					numRegistrosInsertados += stmt.executeUpdate(
							"INSERT INTO customers(customerNumber,customerName,contactLastName,contactFirstName,phone,addressLine1,city,country)"
									+ "VALUES (" + i
									+ ",'Rastrilo, S.L','Chosco','Pedro','+34 666 444 333','Avda. Sanabria, 32','A Estrada','Spain');");
				}
				con.commit();
			} catch (SQLException e) {
				con.rollback();
				numRegistrosInsertados = 0;
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Registros insertados: " + numRegistrosInsertados);
	}
}
