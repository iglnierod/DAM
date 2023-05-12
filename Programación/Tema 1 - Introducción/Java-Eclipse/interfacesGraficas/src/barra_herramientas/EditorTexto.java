package barra_herramientas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;

public class EditorTexto {
	public static void main(String[] args) {
		new VentanaEditarTexto();
	}
}

class VentanaEditarTexto extends JFrame {
	private JToolBar tlb;

	public VentanaEditarTexto() {
		setTitle("Editor de texto");
		setBounds(1400, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextPane txpTexto = new JTextPane();
		txpTexto.setText("Texto de ejemplo...");
		JScrollPane scpTexto = new JScrollPane(txpTexto);
		getContentPane().add(scpTexto);
		
		tlb = new JToolBar("Herramientas");
		tlb.setOrientation(JToolBar.VERTICAL);
		JButton btnNegrita = new JButton(new ImageIcon("recursos/text-bold-24.png"));
		btnNegrita.addActionListener(new StyledEditorKit.BoldAction());
		tlb.add(btnNegrita);
		// 2 1 0 4
		addBtn("recursos/text-italic-24.png").addActionListener(new StyledEditorKit.ItalicAction());
		addBtn("recursos/underline.png").addActionListener(new StyledEditorKit.UnderlineAction());
		tlb.addSeparator();
		addBtn("recursos/left-align.png").addActionListener(new StyledEditorKit.AlignmentAction("left", 0));
		addBtn("recursos/right-align.png").addActionListener(new StyledEditorKit.AlignmentAction("right", 2));
		addBtn("recursos/center-align.png").addActionListener(new StyledEditorKit.AlignmentAction("center", 1));
		addBtn("recursos/justification.png").addActionListener(new StyledEditorKit.AlignmentAction("justify", 3));
		tlb.addSeparator();
		addBtn("recursos/negro.png").addActionListener(new StyledEditorKit.ForegroundAction("negro", Color.BLACK));
		addBtn("recursos/rojo.png").addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));
		addBtn("recursos/verde.png").addActionListener(new StyledEditorKit.ForegroundAction("verde", Color.GREEN));
		addBtn("recursos/azul.png").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		addBtn("recursos/negro.png").addActionListener(new StyledEditorKit.FontSizeAction("size", txpTexto.getFont().getSize()+1));
		
		
		getContentPane().add(tlb,BorderLayout.WEST);
		setVisible(true);
	}
	
	public JButton addBtn(String rutaIcono) {
		JButton btn = new JButton(new ImageIcon(rutaIcono));
		tlb.add(btn);
		return btn;
	}
}