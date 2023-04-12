import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;

public class GPT {
    public static void main(String[] args) {
        new MainWindow1();
    }
}

class MainWindow1 extends JFrame {
    public MainWindow1(){
        setTitle("App con botones y rectángulo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Imagen 1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Image image = ImageIO.read(new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\arte.png"));
                    ((Panel1) panel.getComponent(1)).setImageIcon(new ImageIcon(image));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton button2 = new JButton("Imagen 2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Image image = ImageIO.read(new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\9ec7e3830b5d610f31b26fc22a6f433a.jpg"));
                    ((Panel1) panel.getComponent(1)).setImageIcon(new ImageIcon(image));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton button3 = new JButton("Imagen 3");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Image image = ImageIO.read(new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\720be20a4940a90eec89fdb58f82729a.jpg"));
                    ((Panel1) panel.getComponent(1)).setImageIcon(new ImageIcon(image));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);

        panel.add(buttonsPanel, BorderLayout.WEST);
        panel.add(new Panel1(), BorderLayout.CENTER);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class Panel1 extends JPanel {
    private JLabel label;

    public Panel1(){
        setPreferredSize(new Dimension(800, 800));
        setBackground(Color.WHITE);

        label = new JLabel();
        add(label);
    }

    public void setImageIcon(ImageIcon icon) {
        label.setIcon(icon);
    }
}
