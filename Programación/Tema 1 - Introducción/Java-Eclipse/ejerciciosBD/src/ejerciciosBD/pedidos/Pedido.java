package ejerciciosBD.pedidos;

import java.sql.*;
import java.util.LinkedList;

import javax.swing.JComboBox;

public class Pedido {
	private String orderNumber;
	private String orderDate;
	private String requiredDate;
	private String shippedDate;
	private String status;
	private String comments;
	private int customerNumber;
	private Cliente cliente;

	// Constructor
	public Pedido(String orderNumber, String orderDate, String requiredDate, String shippedDate, String status,
			String comments, int customerNumber, Cliente cliente) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.customerNumber = customerNumber;
		this.cliente = cliente;
	}

	// METODOS
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Número: " + this.orderNumber + "\n");
		sb.append("Fecha pedido: " + this.orderDate + "\n");
		sb.append("Fecha de entrega: " + this.requiredDate + "\n");
		sb.append("Fecha de envío: " + this.shippedDate + "\n");
		sb.append("Estado: " + this.status + "\n");
		sb.append("Comentarios: " + this.comments);
		return sb.toString();
	}

	public static LinkedList<Pedido> getPedidosPorFechas(String fechaInicio, String fechaFin, String status) {
		LinkedList<Pedido> pedidos = new LinkedList<>();
		String sentenciaSQL = "SELECT * FROM orders o, customers c WHERE o.orderDate >= ? AND o.orderDate <= ? "
				+ "AND o.status like ? AND o.customerNumber = c.customerNumber ORDER BY o.orderNumber DESC;";
		try (Connection con = DriverManager.getConnection(VentanaPedidos.URL, VentanaPedidos.USUARIO,
				VentanaPedidos.CLAVE); PreparedStatement ps = con.prepareStatement(sentenciaSQL)) {
			ps.setString(1, fechaInicio);
			ps.setString(2, fechaFin);
			if (status.equals("Todos"))
				status = "%";
			ps.setString(3, status);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				// PEDIDO
				String orderNumber = rs.getString("orderNumber");
				String orderDate = rs.getString("orderDate");
				String requiredDate = rs.getString("requiredDate");
				String shippedDate = rs.getString("shippedDate");
				String orderStatus = rs.getString("status");
				String comments = rs.getString("comments");
				int customerNumber = rs.getInt("customerNumber");

				// CLIENTE
				String customerName = rs.getString("customerName");
				String contactLastName = rs.getString("contactLastName");
				String contactFirstName = rs.getString("contactFirstName");
				String phone = rs.getString("phone");
				String addressLine1 = rs.getString("addressLine1");
				String adressLine2 = rs.getString("addressLine2");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String postalCode = rs.getString("postalCode");
				String country = rs.getString("country");
				String salesRepEmployeeNumber = rs.getString("salesRepEmployeeNumber");
				String creditLimit = rs.getString("creditLimit");

				Cliente cliente = new Cliente(customerNumber, customerName, contactLastName, contactFirstName, phone,
						addressLine1, adressLine2, city, state, postalCode, country, salesRepEmployeeNumber,
						creditLimit);

				pedidos.add(new Pedido(orderNumber, orderDate, requiredDate, shippedDate, orderStatus, comments,
						customerNumber, cliente));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pedidos;
	}

	public static JComboBox<String> getEstadosPedidos() {
		JComboBox<String> cmb = new JComboBox<String>();
		cmb.addItem("Todos");
		String sentenciaSQL = "SELECT DISTINCT status FROM orders;";
		try (Connection con = DriverManager.getConnection(VentanaPedidos.URL, VentanaPedidos.USUARIO,
				VentanaPedidos.CLAVE); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(sentenciaSQL);
			while (rs.next()) {
				cmb.addItem(rs.getString("status"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cmb;
	}

	// GET & SET
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(String requiredDate) {
		this.requiredDate = requiredDate;
	}

	public String getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

}
