package ejerciciosBD.pedidos;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;

public class VentanaPedidos extends JFrame {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "progjava";
	static final String CLAVE = "J#v#Prog2023";

	// MAIN
	public static void main(String[] args) {
		new VentanaPedidos();
	}

	private LinkedList<Pedido> pedidos;
	private LinkedList<Producto> productos;

	public VentanaPedidos() {
		setTitle("Pedidos");
		setBounds(0, 0, 800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Panel norte
		JPanel pnlNorte = new JPanel();
		JTextField txtFechaInicio = new JTextField(6);
		JTextField txtFechaFin = new JTextField(6);
		JComboBox<String> cmbEstado = new JComboBox<String>();
		JButton btnBuscarPedidos = new JButton("Buscar pedidos");

		cmbEstado.setPreferredSize(new Dimension(100, 20));
		cmbEstado.addItem("Todos");

		pnlNorte.add(new JLabel("Fecha inicio:"));
		pnlNorte.add(txtFechaInicio);
		pnlNorte.add(new JLabel("Fecha fin:"));
		pnlNorte.add(txtFechaFin);
		pnlNorte.add(new JLabel("Estado:"));
		pnlNorte.add(cmbEstado);
		pnlNorte.add(btnBuscarPedidos);

		JPanel pnlCentral = new JPanel(new GridLayout(3, 1));
		// Panel parte superior: Pedido, Datos Pedido Seleccionado
		JPanel pnlCentral1 = new JPanel(new GridLayout(1, 2));
		JList<String> liPedido = new JList<>();
		JPanel pnlDatosPedidoSelec = new JPanel(new BorderLayout());
		JTextArea txaDatosPedidoSelec = new JTextArea();
		JButton btnMostrarDatosCliente = new JButton("Mostrar datos cliente");
		JLabel lblImporteTotal = new JLabel("Importe total:");
		JPanel pnlDatosPedidoSelecSur = new JPanel();

		liPedido.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		liPedido.setBorder(new TitledBorder("Pedido"));
//		txaDatosPedidoSelec.setBorder(new TitledBorder("Datos pedido seleccionado"));

		pnlDatosPedidoSelecSur.add(btnMostrarDatosCliente);
		pnlDatosPedidoSelecSur.add(lblImporteTotal);

		pnlDatosPedidoSelec.add(new JScrollPane(txaDatosPedidoSelec), BorderLayout.CENTER);
		pnlDatosPedidoSelec.add(pnlDatosPedidoSelecSur, BorderLayout.SOUTH);

		JScrollPane scp = new JScrollPane(liPedido);
		scp.setBorder(new TitledBorder("Pedido"));
		pnlCentral1.add(scp);
		scp = new JScrollPane(txaDatosPedidoSelec);
		scp.setBorder(new TitledBorder("Datos pedido seleccionado"));
		pnlDatosPedidoSelec.add(scp);
		pnlCentral1.add(pnlDatosPedidoSelec);

		// Panel central: Lineas pedido seleccionado
		JPanel pnlCentral2 = new JPanel(new BorderLayout());
		JList<String> liLineasPedidoSelec = new JList<>();
//		liLineasPedidoSelec.setBorder(new TitledBorder("Líneas pedido seleccionado"));
		scp = new JScrollPane(liLineasPedidoSelec);
		scp.setBorder(new TitledBorder("Líneas pedido seleccionado"));
		pnlCentral2.add(scp);

		// Panel inferior: Datos producto seleccionado
		JPanel pnlCentral3 = new JPanel(new BorderLayout());
		JTextArea txaDatosProductoSelec = new JTextArea();
		txaDatosProductoSelec.setBorder(new TitledBorder("Datos producto seleccionado"));

		pnlCentral3.add(new JScrollPane(txaDatosProductoSelec));

		pnlCentral.add(pnlCentral1);
		pnlCentral.add(pnlCentral2);
		pnlCentral.add(pnlCentral3);
		this.add(pnlNorte, BorderLayout.NORTH);
		this.add(pnlCentral);

		// EVENTOS
		btnBuscarPedidos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pedidos = Pedido.getPedidosPorFechas(txtFechaInicio.getText(), txtFechaFin.getText());
				LinkedList<String> numerosPedidos = new LinkedList<>();
				for (Pedido pedido : pedidos) {
					numerosPedidos.add(pedido.getOrderNumber());
				}
				DefaultListModel<String> modelo = new DefaultListModel<>();
				modelo.addAll(numerosPedidos);
				liPedido.removeAll();
				liPedido.setModel(modelo);
			}
		});

		liPedido.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selectedIndex = liPedido.getSelectedIndex();
				Pedido pedidoSeleccionado = pedidos.get(selectedIndex);
				txaDatosPedidoSelec.setText(pedidoSeleccionado.toString());

				String sentenciaSQL = "SELECT od.productCode, od.quantityOrdered, od.priceEach, p.productName, p.productLine,p.productScale,"
						+ "p.productVendor,p.productDescription,p.quantityInStock,p.buyPrice,p.msrp "
						+ "FROM orderdetails od, products p " + "WHERE od.productCode = p.productCode "
						+ "AND od.orderNumber = ?;";
				int contador = 1;
				try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
						PreparedStatement ps = con.prepareStatement(sentenciaSQL)) {
					ps.setString(1, pedidoSeleccionado.getOrderNumber());
					ResultSet rs = ps.executeQuery();
					LinkedList<String> pedidosSeleccionados = new LinkedList<>();
					while (rs.next()) {
						String productCode = rs.getString(1);
						int quantityOrdered = rs.getInt(2);
						Double priceEach = rs.getDouble(3);
						String precioTotal = String.format("%.2f", quantityOrdered * priceEach);
						pedidosSeleccionados.add(contador + ")" + "[" + productCode + "]: " + quantityOrdered + " x "
								+ priceEach + " = " + precioTotal);

						String productName = rs.getString("productName");
						String productLine = rs.getString("productLine");
						String productScale = rs.getString("productScale");
						String productVendor = rs.getString("productVendor");
						String productDescription = rs.getString("productDescription");
						String quantityInStock = rs.getString("quantityInStock");
						double buyPrice = rs.getDouble("buyPrice");
						double msrp = rs.getDouble("MSRP");

//						productos.add(new Producto(productCode,productName,productLine,productScale,productVendor,productDescription,quantityInStock,buyPrice,msrp));
						productos.add(new Producto(productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, msrp));
						contador++;
					}
					DefaultListModel<String> modelo = new DefaultListModel<>();
					modelo.addAll(pedidosSeleccionados);
					liLineasPedidoSelec.removeAll();
					liLineasPedidoSelec.setModel(modelo);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		liLineasPedidoSelec.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selectedIndex = liLineasPedidoSelec.getSelectedIndex();
				Producto productoSeleccionado = productos.get(selectedIndex);
				txaDatosProductoSelec.setText(productoSeleccionado.toString());

			}
		});

		txtFechaInicio.setText("2004-05-05");
		txtFechaFin.setText("2004-08-25");

		setVisible(true);
	}
}
