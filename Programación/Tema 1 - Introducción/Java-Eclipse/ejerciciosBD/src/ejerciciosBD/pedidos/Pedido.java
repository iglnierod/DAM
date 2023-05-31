package ejerciciosBD.pedidos;

import java.sql.*;
import java.util.LinkedList;

public class Pedido {
	private String orderNumber;
	private String orderDate;
	private String requiredDate;
	private String shippedDate;
	private String status;
	private String comments;
	private int customerNumber;

	// Constructor
	public Pedido(String orderNumber, String orderDate, String requiredDate, String shippedDate, String status,
			String comments, int customerNumber) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.customerNumber = customerNumber;
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

	public static LinkedList<Pedido> getPedidosPorFechas(String fechaInicio, String fechaFin) {
		LinkedList<Pedido> pedidos = new LinkedList<>();
		String sentenciaSQL = "SELECT * FROM orders WHERE orderDate >= ? AND orderDate <= ? ORDER BY orderNumber desc;";
		try (Connection con = DriverManager.getConnection(VentanaPedidos.URL, VentanaPedidos.USUARIO,
				VentanaPedidos.CLAVE); PreparedStatement ps = con.prepareStatement(sentenciaSQL)) {
			ps.setString(1, fechaInicio);
			ps.setString(2, fechaFin);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String orderNumber = rs.getString("orderNumber");
				String orderDate = rs.getString("orderDate");
				String requiredDate = rs.getString("requiredDate");
				String shippedDate = rs.getString("shippedDate");
				String status = rs.getString("status");
				String comments = rs.getString("comments");
				int customerNumber = rs.getInt("customerNumber");
				pedidos.add(new Pedido(orderNumber, orderDate, requiredDate, shippedDate, status, comments,
						customerNumber));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pedidos;
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
