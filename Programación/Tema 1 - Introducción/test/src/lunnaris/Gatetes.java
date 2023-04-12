package lunnaris;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class Gatetes {
    public static void main(String[] args) {
        new Ventana();
    }
}

class Ventana extends JFrame {
    public Ventana() {
        setTitle("Lunnaris");
        setBounds(0,0,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("E:\\DAM 1\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\interfacesGraficas\\rengar.jpg");
        setIconImage(icono);

        add(new PanelImagen());

        setVisible(true);
    }
}

class Panel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Arial", Font.PLAIN, 30);
        g.setFont(font);
        Color c = new Color(135, 10, 198);
        g.setColor(c);
        g.drawString("Lunna es una tonta",50,50);
    }
}

class PanelImagen extends JPanel {
    private Image imagen;

    public PanelImagen() {
        try {
            imagen = ImageIO.read(new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\arte.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Image redimension = imagen.getScaledInstance(200,150, Image.SCALE_DEFAULT);
        g.drawImage(redimension, 0, 0, null);

    }
}




















