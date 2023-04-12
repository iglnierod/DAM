import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) {
        new MainWindow();
    }
}

class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Meow");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,570,710);
        add(new Panel());
        setLocationRelativeTo(null); //Centra la ventana en el medio de la pantalla
        setVisible(true);
    }
}

class Panel extends JPanel {
    private Image image;

    public Panel(){
        try {
            this.image = ImageIO.read(new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\arte.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        centerImage(g);
    }

    private void centerImage(Graphics g) {
        int windowWidth = getWidth();
        int windowHeight = getHeight();
        int imageWidth = image.getWidth(null);
        int imageHeight = image.getHeight(null);

        int x = (windowWidth - imageWidth) / 2;
        int y = (windowHeight - imageHeight) / 2;

        g.drawImage(image, x, y, null);
    }
}
