import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelContent{
    public static void main(String[] args) {

        // Creating a label to insert it in the panels 
        JLabel l = new JLabel("ok YAAR");
        l.setForeground(Color.black);
        l.setIcon(new ImageIcon("smallthumbsupjpg.jpg"));
        l.setLayout(new BorderLayout());

        

        //! One Label can be added only in a single Panel
        
        

        // JPanel  --> GUI Components to Hold Other GUI Components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 300, 300);
        redPanel.add(l);
    
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(300, 0, 300, 300);
        // bluePanel.add(l);
    


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 300, 700, 300);
        // greenPanel.add(l);


        JPanel realPanel = new JPanel();
        // realPanel.setBackground(Color.white);
        realPanel.setBounds(0, 0, 1200, 1200);
        // realPanel.add(redPanel);
        // realPanel.add(bluePanel);
        // realPanel.add(greenPanel);
    


        
        JFrame frame = new JFrame("Panel Content");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        

        
        
        
    }
}