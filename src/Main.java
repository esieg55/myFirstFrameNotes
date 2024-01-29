import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//step 1 create frame
        JFrame frame = new JFrame();
        frame.setSize(350,350);
// 2 create panel
        JPanel panel = new JPanel();
          panel.setBackground(new Color(130,0,55));
       // panel.setBackground(Color.BLUE);
// 3 create components
        JLabel label = new JLabel("Hello emma");// put strings in here replaces s.o.p
        JButton button = new JButton("Push me");
        JTextField textField = new JTextField(10);

// add an image
        ImageIcon icon = new ImageIcon("Images/myCards/2C.png");
        //scaling image before adding to laabel
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
//create label w icon on it
        JLabel picLabel = new JLabel(icon);





// 4 add components to panel

        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);
       // panel.add();

// 5 add panel to frame
        frame.add(panel);
        //frame.add()
// 6 make frame visible
frame.setVisible(true);





    }
}