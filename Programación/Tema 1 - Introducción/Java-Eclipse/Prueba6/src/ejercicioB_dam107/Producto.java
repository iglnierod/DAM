package ejercicioB_dam107;

import java.sql.*;
import java.util.LinkedList;

public class Producto {
	// ATRIBUTOS
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription = "";
	private int quantityInStock;
	private double buyPrice;
	private double msrp;

	// CONSTRUCTOR
	public Producto() {

	}

	public Producto(String productCode, String productName, String productLine, String productScale,
			String productVendor, String productDescription, int quantityInStock, double buyPrice, double msrp) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		this.msrp = msrp;
	}

	// METODOS
	public static LinkedList<Producto> getListaProductos() {
		LinkedList<Producto> productos = new LinkedList<>();
		String sentenciaSQL = "SELECT * FROM products ORDER BY productCode ASC";
		try (Connection con = DriverManager.getConnection(VentanaPrincipal.URL, VentanaPrincipal.USUARIO,
				VentanaPrincipal.CLAVE); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(sentenciaSQL);
			while (rs.next()) {
				String productCode = rs.getString("productCode");
				String productName = rs.getString("productName");
				String productLine = rs.getString("productLine");
				String productScale = rs.getString("productScale");
				String productVendor = rs.getString("productVendor");
				String productDescription = rs.getString("productDescription");
				int quantityInStock = rs.getInt("quantityInStock");
				double buyPrice = rs.getDouble("buyPrice");
				double msrp = rs.getDouble("msrp");

				productos.add(new Producto(productCode, productName, productLine, productScale, productVendor,
						productDescription, quantityInStock, buyPrice, msrp));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productos;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código: " + this.productCode + " ");
		sb.append("Nombre: " + this.productName + " ");
		sb.append("Categoria: " + this.productLine + " ");
		sb.append("Escala: " + this.productScale + " ");
		sb.append("Proveedor: " + this.productVendor + " ");
		sb.append("Stock: " + this.quantityInStock + " ");
		sb.append("PrecioCompra: " + this.buyPrice + " ");
		sb.append("PVP: " + this.msrp + " €");

		return sb.toString();
	}

	public static LinkedList<String> getCategorias() {
		LinkedList<String> categorias = new LinkedList<>();
		String sentenciaSQL = "SELECT DISTINCT productLine FROM products;";

		try (Connection con = DriverManager.getConnection(VentanaPrincipal.URL, VentanaPrincipal.USUARIO,
				VentanaPrincipal.CLAVE); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(sentenciaSQL);
			while (rs.next()) {
				categorias.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return categorias;
	}

	public static void agregarProducto(Producto prod) {
		String productCode = prod.getProductCode();
		String productName = prod.getProductName();
		String productLine = prod.getProductLine();
		String productScale = prod.getProductScale();
		String productVendor = prod.getProductVendor();
		String productDescription = prod.getProductDescription();
		int quantityInStock = prod.getQuantityInStock();
		double buyPrice = prod.getBuyPrice();
		double msrp = prod.getMsrp();
		String sentenciaSQL = "INSERT INTO products (productCode, productName, productLine, productScale, productVendor, quantityInStock, buyPrice, MSRP,productDescription) "
				+ "VALUES ('" + productCode + "','" + productName + "','" + productLine + "','" + productScale + "','"
				+ productVendor + "'," + quantityInStock + "," + buyPrice + "," + msrp + ",'" + productDescription
				+ "+');";

		try (Connection con = DriverManager.getConnection(VentanaPrincipal.URL, VentanaPrincipal.USUARIO,
				VentanaPrincipal.CLAVE); Statement stmt = con.createStatement()) {
			stmt.executeUpdate(sentenciaSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void editarProducto(Producto prod) {
		String productCode = prod.getProductCode();
		String productName = prod.getProductName();
		String productLine = prod.getProductLine();
		String productScale = prod.getProductScale();
		String productVendor = prod.getProductVendor();
		String productDescription = prod.getProductDescription();
		int quantityInStock = prod.getQuantityInStock();
		double buyPrice = prod.getBuyPrice();
		double msrp = prod.getMsrp();

		String sentenciaSQL = "UPDATE products SET " + "productCode = '" + productCode + "', " + "productName = '"
				+ productName + "', " + "productLine = '" + productLine + "', " + "productScale = '" + productScale
				+ "', " + "productVendor = '" + productVendor + "', " + "productDescription = '" + productDescription
				+ "', " + "quantityInStock = " + quantityInStock + ", " + "buyPrice = " + buyPrice + ", " + "MSRP = "
				+ msrp + " " + " WHERE productCode = '" + productCode + "';";
		try (Connection con = DriverManager.getConnection(VentanaPrincipal.URL, VentanaPrincipal.USUARIO,
				VentanaPrincipal.CLAVE); Statement stmt = con.createStatement()) {
			stmt.executeUpdate(sentenciaSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void eliminarProducto(Producto prod) {
		String sentenciaSQL = "DELETE FROM products WHERE productCode = '" + prod.getProductCode() + "';";
		try (Connection con = DriverManager.getConnection(VentanaPrincipal.URL, VentanaPrincipal.USUARIO,
				VentanaPrincipal.CLAVE); Statement stmt = con.createStatement()) {
			stmt.executeUpdate(sentenciaSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// GETTERS & SETTERS
	public String getProductCode() {
		return productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public double getMsrp() {
		return msrp;
	}

	public void setMsrp(double msrp) {
		this.msrp = msrp;
	}

}
