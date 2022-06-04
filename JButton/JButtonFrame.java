import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonFrame extends JFrame implements ActionListener{

    public JButtonFrame() {

        JButton buttonJee = new JButton();
        buttonJee.setText("Jee");
        buttonJee.setBounds(100, 200, 150, 100); //as the parent layout is null so we have to set the bound
        buttonJee.setForeground(java.awt.Color.yellow);
        buttonJee.setBackground(java.awt.Color.blue);
        buttonJee.setFont(new Font("My Boli", Font.BOLD, 20));
        buttonJee.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // buttonJee.setEnabled(false);
        buttonJee.addActionListener(this); //it takes the reference of that class which is going to implement ActionListener
        

        // we can add icon to the button as well
        // ImageIcon icon = new ImageIcon("solutionfest.png");
        // buttonJee.setIcon(icon); //this is the path of the image
        // buttonJee.setSize(icon.getIconWidth(), icon.getIconWidth()); //By this we can also get the size of the icon so that a fit image can be produced

        // Setting the Frame
        this.setTitle("JButton");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        // adding the button to the frame
        this.add(buttonJee);
    }

    // This Method is to be overridden  by the ActionListener Interface
    // without it, it will throw an error
    @Override
    public void actionPerformed(ActionEvent e) {
        // This is the code to be executed when the button is clicked
        System.out.println("Pakistan Noor hai");
        this.getContentPane().setBackground(Color.MAGENTA);

    }

    
    
}