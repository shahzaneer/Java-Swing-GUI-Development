import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class JTextFieldContent{
    public static void main(String[] args) {
        // JFrame
        JFrame frame = new JFrame("JTextFieldContent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JTextField textField = new JTextField();
        textField.setBounds(100, 200, 250, 70);
        textField.setText("Enter text here"); //INITIAL Text
        textField.setBackground(new Color(125, 125, 125));
        textField.setForeground(Color.red);
        // textField.setEditable(false);
        



        frame.add(textField);




        
    }
}