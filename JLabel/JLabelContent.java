import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import border in swing
import javax.swing.border.Border;

public class JLabelContent{

    public static void main(String[] args) {

        // Border
        Border border = javax.swing.BorderFactory.createLineBorder(Color.green, 2);
        
        // Label is the area for text or image
        // JLabel is the class that contains the label
        JLabel label = new JLabel("Hello World");
        label.setText("Pakistan Noor hai Aur Noor ko Zawal nhi");

//      adding image icon to the label
        label.setIcon(new ImageIcon("solutionfest.png"));

        // Colors of the Label
        label.setForeground(Color.YELLOW); // Color of the text
        // label.setBackground(new Color(125, 125, 125)); // Yo can give the RGB Values as well 
        // label.setBackground(new Color(0xFFB6C1)); // Hexadecimal Values
        label.setBackground(Color.BLACK); //Text of Background
        label.setOpaque(true); // without this the background color will not be visible
        label.setIconTextGap(100);


        // For setting border
        label.setBorder(border);

        // for positioning of the text Material WRT To the image ICON

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        // For ALignment of all the Label 

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // font setting
        label.setFont(new Font("arial", Font.PLAIN, 20));
        



        JFrame j = new JFrame();
        // j.setSize(1000, 1100);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setIconImage(new ImageIcon("solutionfest.png").getImage());
        // adding this label to our main frame
        j.add(label);

        j.pack(); //Iit will Pack the label within the frame
        



        



    }
}