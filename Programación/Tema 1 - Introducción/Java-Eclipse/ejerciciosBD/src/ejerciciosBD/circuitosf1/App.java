package ejerciciosBD.circuitosf1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class App extends JFrame {

    final static String URL = "jdbc:mysql://192.168.56.33:3306/java_f1_2022";
    final static String USUARIO = "javadmin";
    final static String CLAVE = "20J@v@23";

    public static void main(String[] args) {
        new App();
    }

    public App() {
        setTitle("Circuitos F1 2022");
        setBounds(0, 0, 600, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 1));

        JList<Circuito> liCircuitos = new JList<Circuito>();
        DefaultListModel<Circuito> modeloCircuitos = new DefaultListModel<>();
        modeloCircuitos.addAll(Circuito.getListaCircuitos());
        liCircuitos.setModel(modeloCircuitos);
        liCircuitos.setVisibleRowCount(7);
        JScrollPane scp = new JScrollPane(liCircuitos);
        scp.setBorder(new TitledBorder("Circuitos"));
        liCircuitos.setVisibleRowCount(5);
        liCircuitos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.add(scp);

        JPanel pnlInformacion = new JPanel(new BorderLayout());
        JLabel lblInfoCirc = new JLabel();
        JLabel trazado = new JLabel();
        pnlInformacion.add(trazado, BorderLayout.CENTER);
        pnlInformacion.add(lblInfoCirc, BorderLayout.SOUTH);

        liCircuitos.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                Circuito circSeleccionado = liCircuitos.getSelectedValue();
                lblInfoCirc.setText(circSeleccionado.getInformacion());
                ImageIcon imagenCirc = new ImageIcon(circSeleccionado.getTrazado());
                Image imagen = imagenCirc.getImage();
                int width = pnlInformacion.getWidth() - 20;
                int height = pnlInformacion.getHeight() - 20;
                Image imagenRedimensionada = imagen.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                ImageIcon imagenRedimensionadaIcono = new ImageIcon(imagenRedimensionada);
                trazado.setIcon(imagenRedimensionadaIcono);
            }
        });

        this.add(pnlInformacion);

        setVisible(true);
    }
}
