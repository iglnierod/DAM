package ejerciciosBD.pedidos;

public class Producto {
	private String productCode;
	private String productName;
	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private String quantityInStock;
	private double buyPrice;
	private double msrp;

	public Producto(String productCode, String productName, String productLine, String productScale,
			String productVendor, String productDescription, String quantityInStock, double buyPrice, double msrp) {
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
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Código: " + this.productCode + "\n");
		sb.append("Nombre: " + this.productName + "\n");
		sb.append("Categoría: " + this.productLine + "\n");
		sb.append("Escala: " + this.productScale + "\n");
		sb.append("Proveedor: " + this.productVendor + "\n");
		sb.append("Descripción: " + this.productDescription + "\n");
		sb.append("Unidades en stock: " + this.quantityInStock + "\n");
		sb.append("Precio compra: " + this.buyPrice + "\n");
		sb.append("PVP: " + this.msrp);
		return sb.toString();
	}

	public String getProductCode() {
		return productCode;
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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(String quantityInStock) {
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
