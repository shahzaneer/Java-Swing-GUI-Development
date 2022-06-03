import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class MyFrame extends JFrame {
    // Constructor
    public MyFrame() {
        // super();
        this.setSize(300,300);
        this.setVisible(true);
        this.setTitle("Shahzaneer Ahmed taking on GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        // Image icon
        ImageIcon img = new ImageIcon("flutter-isb logo.png");

        this.setIconImage(img.getImage());
        // j.getContentPane().setBackground(new Color(0,0,0));
        this.getContentPane().setBackground(Color.MAGENTA);
        

    }
}
