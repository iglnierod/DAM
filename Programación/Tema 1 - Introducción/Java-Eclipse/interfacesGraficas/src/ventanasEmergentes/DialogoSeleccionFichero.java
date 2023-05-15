package ventanasEmergentes;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DialogoSeleccionFichero {
	public static void main(String[] args) {
		new VentanaSeleccionFichero();
	}
}

class VentanaSeleccionFichero extends JFrame {
	private File fichero;
	private JTextArea txaTexto;
	private JLabel lblEstado;

	public VentanaSeleccionFichero() {
		setTitle("Selección de ficheros");
		setBounds(0, 0, 600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar mnbMenu = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenuItem mniAbrir = new JMenuItem("Abrir", 'A');
		JMenuItem mniGuardar = new JMenuItem("Guardar", 'G');
		JMenuItem mniGuardarComo = new JMenuItem("Guardar Como", 'C');

		mnbMenu.add(mnuArchivo);
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);

		this.add(mnbMenu, BorderLayout.NORTH);

		txaTexto = new JTextArea();
		JScrollPane scp = new JScrollPane(txaTexto);

		this.add(scp);

		lblEstado = new JLabel(" ");
		this.add(lblEstado, BorderLayout.SOUTH);

		mniAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileFilter(new FileNameExtensionFilter("Archivos Java", "java", "txt", "log"));
				fc.setCurrentDirectory(new File("").getAbsoluteFile());
				fc.setFileHidingEnabled(true);

				int resultado = fc.showOpenDialog(VentanaSeleccionFichero.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					fichero = fc.getSelectedFile();
					lblEstado.setText(fichero.getAbsolutePath());
					txaTexto.setText(obtenerTextoFichero(fichero));
				}
			}
		});

		mniGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				guardarTextoFichero(txaTexto.getText(), fichero);
			}
		});

		mniGuardarComo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				guardarComo();
			}
		});

		setVisible(true);
	}

	private String obtenerTextoFichero(File f) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				sb.append(linea);
				sb.append(System.lineSeparator());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return sb.toString();
	}

	private void guardarTextoFichero(String texto, File f) {
		if (f == null)
			guardarComo();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void guardarComo() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("").getAbsoluteFile());
		int resultado = fc.showSaveDialog(VentanaSeleccionFichero.this);

		if (resultado == JFileChooser.APPROVE_OPTION) {
			fichero = fc.getSelectedFile();
			String texto = txaTexto.getText();
			guardarTextoFichero(texto, fichero);
			lblEstado.setText(fichero.getAbsolutePath());
		}
	}
}
