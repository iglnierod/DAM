package ejerciciosBD;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Pedidos {
	public static void main(String[] args) {
		new VentanaPedidos();
	}
}

class VentanaPedidos extends JFrame {
	public VentanaPedidos() {
		setTitle("Pedidos");
		setBounds(0,0,800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Panel norte
		JPanel pnlNorte = new JPanel();
		JTextField txtFechaInicio = new JTextField(6);
		JTextField txtFechaFin = new JTextField(6);
		JComboBox<String> cmbEstado = new JComboBox<String>();
		JButton btnBuscarPedidos = new JButton("Buscar pedidos");
		
		cmbEstado.setPreferredSize(new Dimension(100,20));
		cmbEstado.addItem("Todos");
		
		pnlNorte.add(new JLabel("Fecha inicio:"));
		pnlNorte.add(txtFechaInicio);
		pnlNorte.add(new JLabel("Fecha fin:"));
		pnlNorte.add(txtFechaFin);
		pnlNorte.add(new JLabel("Estado:"));
		pnlNorte.add(cmbEstado);
		pnlNorte.add(btnBuscarPedidos);
		
		JPanel pnlCentral = new JPanel(new GridLayout(3,1));
		// Panel parte superior: Pedido, Datos Pedido Seleccionado
		JPanel pnlCentral1 = new JPanel(new GridLayout(1,2));
		JTextArea txaPedido = new JTextArea();
		JPanel pnlDatosPedidoSelec = new JPanel(new BorderLayout());
		JTextArea txaDatosPedidoSelec = new JTextArea();
		JButton btnMostrarDatosCliente = new JButton("Mostrar datos cliente");
		JLabel lblImporteTotal = new JLabel("Importe total:");
		JPanel pnlDatosPedidoSelecSur = new JPanel();
		
		txaPedido.setBorder(new TitledBorder("Pedido"));
		txaDatosPedidoSelec.setBorder(new TitledBorder("Datos pedido seleccionado"));
		
		pnlDatosPedidoSelecSur.add(btnMostrarDatosCliente);
		pnlDatosPedidoSelecSur.add(lblImporteTotal);

		pnlDatosPedidoSelec.add(txaDatosPedidoSelec,BorderLayout.CENTER);
		pnlDatosPedidoSelec.add(pnlDatosPedidoSelecSur,BorderLayout.SOUTH);
				
		pnlCentral1.add(new JScrollPane(txaPedido));
		pnlCentral1.add(pnlDatosPedidoSelec);
		
		// Panel central: Lineas pedido seleccionado
		JPanel pnlCentral2 = new JPanel(new BorderLayout());
		JTextArea txaLineasPedidoSelec = new JTextArea();
		txaLineasPedidoSelec.setBorder(new TitledBorder("Líneas pedido seleccionado"));
		
		pnlCentral2.add(new JScrollPane(txaLineasPedidoSelec));
		
		// Panel inferior: Datos producto seleccionado
		JPanel pnlCentral3 = new JPanel(new BorderLayout());
		JTextArea txaDatosProductoSelec = new JTextArea();
		txaDatosProductoSelec.setBorder(new TitledBorder("Datos producto seleccionado"));
		
		pnlCentral3.add(txaDatosProductoSelec);
		
		pnlCentral.add(pnlCentral1);
		pnlCentral.add(pnlCentral2);
		pnlCentral.add(pnlCentral3);
		this.add(pnlNorte,BorderLayout.NORTH);
		this.add(pnlCentral);
		setVisible(true);
	} 
}

























