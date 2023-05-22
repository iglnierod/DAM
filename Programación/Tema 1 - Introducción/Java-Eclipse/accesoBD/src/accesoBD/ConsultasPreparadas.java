package accesoBD;

import java.sql.*;
import java.util.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class ConsultasPreparadas {
	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "progjava";
	static final String CLAVE = "J#v#Prog2023";

	static JComboBox<String> getCategorias() {
		String consultaSql = "SELECT DISTINCT productLine FROM products;";
		JComboBox<String> categorias = new JComboBox<>();
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(consultaSql);
			while (rs.next()) {
				categorias.addItem(rs.getString("productLine"));
				;
			}
			categorias.addItem("Todas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categorias;
	}

	static String getConsulta(String categoria, int stock) {
		if (categoria.equals("Todas"))
			categoria = "";
		String consultaSql = "SELECT concat(productCode,' - ', productName,' - ', quantityInStock)"
				+ "FROM products WHERE productLine LIKE ? AND quantityInStock < ?;";
		StringBuilder sb = new StringBuilder();
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement ps = con.prepareStatement(consultaSql)) {
			ps.setString(1, categoria);
			ps.setString(2, String.valueOf(stock));
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sb.append(rs.getString(1) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	static String getConsultaTodas(int stock) {
		StringBuilder sb = new StringBuilder();
		String consultaSql = "select productName from products WHERE quantityInStock < ?;";
		try (Connection con = DriverManager.getConnection(URL, USUARIO, CLAVE);
				PreparedStatement ps = con.prepareStatement(consultaSql)) {
			ps.setString(1, String.valueOf(stock));
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				sb.append(rs.getString(1) + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		new VentanaConsultasPreparadas();
	}
}

class VentanaConsultasPreparadas extends JFrame {
	private JTextArea txaResultado = new JTextArea();
	JComboBox<String> cmbCategorias = ConsultasPreparadas.getCategorias();
	JTextField txfStock = new JTextField();

	public VentanaConsultasPreparadas() {
		setTitle("Consultas");
		setBounds(0, 0, 600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnlNorte = new JPanel();
		this.add(pnlNorte, BorderLayout.NORTH);
		pnlNorte.add(new JLabel("Categoría"));
		pnlNorte.add(cmbCategorias);
		pnlNorte.add(new JLabel("Stock mínimo"));
		pnlNorte.add(txfStock);
		JButton btnConsultar = new JButton("Consultar");
		pnlNorte.add(btnConsultar);
		btnConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int stock = Integer.parseInt(txfStock.getText());
					txaResultado.setText(ConsultasPreparadas.getConsulta(cmbCategorias.getSelectedItem().toString(), stock));
					if(cmbCategorias.getSelectedItem().toString().equals("Todas")) {
						txaResultado.setText(ConsultasPreparadas.getConsultaTodas(stock));
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(VentanaConsultasPreparadas.this,
							"El número de stock introducido no es correcto");
				}
			}
		});

		cmbCategorias.setPreferredSize(new Dimension(100, 25));
		txfStock.setPreferredSize(new Dimension(70, 25));
		txaResultado.setEditable(false);
		JScrollPane scp = new JScrollPane(txaResultado);
		txaResultado.setFont(new Font("Arial", 0, 20));
		scp.setBorder(new EmptyBorder(20, 10, 10, 10));

		this.add(scp);

		setVisible(true);
	}
}
