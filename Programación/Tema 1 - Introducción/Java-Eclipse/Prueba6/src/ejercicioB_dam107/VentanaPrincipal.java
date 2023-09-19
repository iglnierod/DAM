package ejercicioB_dam107;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.event.ListSelectionListener;

public class VentanaPrincipal extends JFrame {

	static final String URL = "jdbc:mysql://192.168.56.21:3306/classicmodels";
	static final String USUARIO = "javadmin";
	static final String CLAVE = "20J@v@23";

	// MAIN
	public static void main(String[] args) {
		new VentanaPrincipal();
		System.out.println(Producto.getCategorias());
	}

	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCategoria;
	private JTextField txtEscala;
	private JTextField txtProveedor;
	private JTextField txtStock;
	private JTextField txtPrecioCompra;
	private JTextField txtPVP;
	private JButton btnAgregar;
	private JButton btnEditar;
	private JButton btnEliminar;
	private JButton btnConfirmar;
	private JButton btnCancelar;
	private String ultimoBotonPulsado;
	private LinkedList<String> categoriasProducto = Producto.getCategorias();
	JList<Producto> liProductos;

	// CONSTRUCTOR
	public VentanaPrincipal() {
		setTitle("CRUD");
		setBounds(0, 0, 1500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// PANEL IZQUIERDO
		JPanel pnlIzquierda = new JPanel(new BorderLayout());
		JPanel pnlDatosProducto = new JPanel(new GridLayout(8, 2));
		pnlDatosProducto.setBorder(new TitledBorder("Datos producto"));

		pnlDatosProducto.add(new JLabel("Código:"));
		txtCodigo = new JTextField(10);
		pnlDatosProducto.add(txtCodigo);

		pnlDatosProducto.add(new JLabel("Nombre:"));
		txtNombre = new JTextField(10);
		pnlDatosProducto.add(txtNombre);

		pnlDatosProducto.add(new JLabel("Categoría:"));
		txtCategoria = new JTextField(10);
		pnlDatosProducto.add(txtCategoria);

		pnlDatosProducto.add(new JLabel("Escala:"));
		txtEscala = new JTextField(6);
		pnlDatosProducto.add(txtEscala);

		pnlDatosProducto.add(new JLabel("Proveedor:"));
		txtProveedor = new JTextField(6);
		pnlDatosProducto.add(txtProveedor);

		pnlDatosProducto.add(new JLabel("Stock:"));
		txtStock = new JTextField(6);
		pnlDatosProducto.add(txtStock);

		pnlDatosProducto.add(new JLabel("Precio compra:"));
		txtPrecioCompra = new JTextField(6);
		pnlDatosProducto.add(txtPrecioCompra);

		pnlDatosProducto.add(new JLabel("PVP:"));
		txtPVP = new JTextField(6);
		pnlDatosProducto.add(txtPVP);

		pnlIzquierda.add(pnlDatosProducto, BorderLayout.NORTH);
		this.add(pnlIzquierda, BorderLayout.WEST);

		txtCodigo.setEditable(false);
		txtNombre.setEditable(false);
		txtCategoria.setEditable(false);
		txtEscala.setEditable(false);
		txtProveedor.setEditable(false);
		txtStock.setEditable(false);
		txtPrecioCompra.setEditable(false);
		txtPVP.setEditable(false);

		// PANEL CENTRAL
		liProductos = new JList<>();
		JScrollPane scp = new JScrollPane(liProductos);
		scp.setBorder(new TitledBorder("Listado productos"));
		this.add(scp, BorderLayout.CENTER);

		DefaultListModel<Producto> mdlProductos = new DefaultListModel<>();
		mdlProductos.addAll(Producto.getListaProductos());
		liProductos.setModel(mdlProductos);
		liProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// MENÚ
		String rutaImagenes = new File("").getAbsolutePath() + File.separator + "img" + File.separator;
		JToolBar tlbMenu = new JToolBar(JToolBar.VERTICAL);
		btnAgregar = new JButton(new ImageIcon(rutaImagenes + "agregar24.png"));
		tlbMenu.add(btnAgregar);

		btnEditar = new JButton(new ImageIcon(rutaImagenes + "editar24.png"));
		tlbMenu.add(btnEditar);

		btnEliminar = new JButton(new ImageIcon(rutaImagenes + "eliminar24.png"));
		tlbMenu.add(btnEliminar);

		btnConfirmar = new JButton(new ImageIcon(rutaImagenes + "confirmar24.png"));
		tlbMenu.add(btnConfirmar);

		btnCancelar = new JButton(new ImageIcon(rutaImagenes + "cancelar24.png"));
		tlbMenu.add(btnCancelar);

		this.add(tlbMenu, BorderLayout.EAST);

		btnConfirmar.setEnabled(false);
		btnCancelar.setEnabled(false);

		setVisible(true);
		
		// EVENTOS
		liProductos.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				Producto productoSeleccionado = liProductos.getSelectedValue();
				if (productoSeleccionado != null) {
					txtCodigo.setText(productoSeleccionado.getProductCode());
					txtNombre.setText(productoSeleccionado.getProductName());
					txtCategoria.setText(productoSeleccionado.getProductLine());
					txtEscala.setText(productoSeleccionado.getProductScale());
					txtProveedor.setText(productoSeleccionado.getProductVendor());
					txtStock.setText(productoSeleccionado.getQuantityInStock() + "");
					txtPrecioCompra.setText(productoSeleccionado.getBuyPrice() + "");
					txtPVP.setText(productoSeleccionado.getMsrp() + "");
				}
			}
		});

		btnAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ultimoBotonPulsado = "agregar";
				VentanaPrincipal.this.setJTextFieldEditable(true);
				VentanaPrincipal.this.toggleConfirmarCancelar(true);
				btnEditar.setEnabled(false);
				btnEliminar.setEnabled(false);
				liProductos.setEnabled(false);
				txtCodigo.requestFocus();
			}
		});

		btnEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (liProductos.getSelectedValue() != null) {
					ultimoBotonPulsado = "editar";
					setJTextFieldBtnEditar();
					toggleConfirmarCancelar(true);
					btnAgregar.setEnabled(false);
					btnEliminar.setEnabled(false);
					liProductos.setEnabled(false);
					txtNombre.requestFocus();
				}
			}
		});

		btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (liProductos.getSelectedValue() != null) {
					int res = JOptionPane.showConfirmDialog(VentanaPrincipal.this,
							"¿Desea realmente eliminar el producto seleccionado?", "Eliminar",
							JOptionPane.YES_NO_OPTION);
					if (res == 0) {
						Producto.eliminarProducto(liProductos.getSelectedValue());
						System.out.println("Producto eliminado correctamente");
						updateListaProductos();
						setJTextFieldEditable(false);
					}
				}
			}
		});

		btnConfirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Producto nuevoProducto;
				switch (ultimoBotonPulsado) {
				case "agregar":
					nuevoProducto = new Producto();
					nuevoProducto.setProductCode(txtCodigo.getText());
					nuevoProducto.setProductName(txtNombre.getText());
					if (!existeCategoria(txtCategoria.getText())) {
						cancelarAgregar();
						JOptionPane.showMessageDialog(VentanaPrincipal.this, "La categoría no existe.", "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					nuevoProducto.setProductLine(txtCategoria.getText());
					nuevoProducto.setProductScale(txtEscala.getText());
					nuevoProducto.setProductVendor(txtProveedor.getText());
					try {
						nuevoProducto.setQuantityInStock(Integer.parseInt(txtStock.getText()));
						nuevoProducto.setBuyPrice(Double.parseDouble(txtPrecioCompra.getText()));
						nuevoProducto.setMsrp(Double.parseDouble(txtPVP.getText()));
					} catch (NumberFormatException e1) {
						System.err.println("Datos numéricos no válidos");
						cancelarAgregar();
						return;
					}
					Producto.agregarProducto(nuevoProducto);
					updateListaProductos();
					cancelarAgregar();
					System.out.println("Producto añadido correctamente");
					System.out.println(nuevoProducto);
					ultimoBotonPulsado = "";
					break;
				case "editar":
					nuevoProducto = new Producto();
					nuevoProducto.setProductCode(txtCodigo.getText());
					nuevoProducto.setProductName(txtNombre.getText());
					if (!existeCategoria(txtCategoria.getText())) {
						cancelarEditar();
						JOptionPane.showMessageDialog(VentanaPrincipal.this, "La categoría no existe.", "Error",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					nuevoProducto.setProductLine(txtCategoria.getText());
					nuevoProducto.setProductScale(txtEscala.getText());
					nuevoProducto.setProductVendor(txtProveedor.getText());
					try {
						nuevoProducto.setQuantityInStock(Integer.parseInt(txtStock.getText()));
						nuevoProducto.setBuyPrice(Double.parseDouble(txtPrecioCompra.getText()));
						nuevoProducto.setMsrp(Double.parseDouble(txtPVP.getText()));
					} catch (NumberFormatException e1) {
						System.err.println("Datos numéricos no válidos");
						cancelarEditar();
						return;
					}
					Producto.editarProducto(nuevoProducto);
					updateListaProductos();
					cancelarEditar();
					System.out.println("Producto editado correctamente");
					System.out.println(nuevoProducto);
					break;
				}

			}

		});
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch (ultimoBotonPulsado) {
				case "agregar":
					cancelarAgregar();
					break;
				case "editar":
					cancelarEditar();
				}
			}
		});

	}

	// METODOS
	private void setJTextFieldBtnEditar() {
		txtNombre.setEditable(true);
		txtCategoria.setEditable(true);
		txtEscala.setEditable(true);
		txtProveedor.setEditable(true);
		txtStock.setEditable(true);
		txtPrecioCompra.setEditable(true);
		txtPVP.setEditable(true);
	}

	private void updateListaProductos() {
		DefaultListModel<Producto> mdlProductos = new DefaultListModel<>();
		mdlProductos.addAll(Producto.getListaProductos());
		liProductos.setModel(mdlProductos);
	}

	private void cancelarEditar() {
		toggleConfirmarCancelar(false);
		setJTextFieldEditable(false);
		btnAgregar.setEnabled(true);
		btnEliminar.setEnabled(true);
		liProductos.setEnabled(true);
	}

	private void cancelarAgregar() {
		toggleConfirmarCancelar(false);
		setJTextFieldEditable(false);
		btnEditar.setEnabled(true);
		btnEliminar.setEnabled(true);
		liProductos.setEnabled(true);
	}

	private void setJTextFieldEditable(boolean bool) {
		txtCodigo.setEditable(bool);
		txtNombre.setEditable(bool);
		txtCategoria.setEditable(bool);
		txtEscala.setEditable(bool);
		txtProveedor.setEditable(bool);
		txtStock.setEditable(bool);
		txtPrecioCompra.setEditable(bool);
		txtPVP.setEditable(bool);

		txtCodigo.setText(null);
		txtNombre.setText(null);
		txtCategoria.setText(null);
		txtEscala.setText(null);
		txtProveedor.setText(null);
		txtStock.setText(null);
		txtPrecioCompra.setText(null);
		txtPVP.setText(null);
	}

	private void toggleConfirmarCancelar(boolean bool) {
		btnConfirmar.setEnabled(bool);
		btnCancelar.setEnabled(bool);
	}

	private boolean existeCategoria(String categoria) {
		for (String item : categoriasProducto) {
			if (item.equals(categoria))
				return true;
		}
		return false;
	}
}
