import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("What's up, Welcome in");

    WelcomePage(){

        welcomeLabel.setBounds(0,0,2000,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
