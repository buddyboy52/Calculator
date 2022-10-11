import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class calculator {

    // Create our constants for our width and height
    final int WIDTH = 400;
    final int HEIGHT = 600;

    static FlowLayout flowLayout = new FlowLayout();

    public void createWindow(){

        JFrame frame = new JFrame("Calculator");

        JPanel panel = new JPanel();

        // Add the panel to the frame
        frame.add(panel);

        panel.setLayout(flowLayout);

        // Set the frame size
        frame.setSize(WIDTH , HEIGHT);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button_1 = new JButton("1");
        JButton button_2 = new JButton("2");
        JButton button_3 = new JButton("3");
        JButton button_4 = new JButton("4");
        JButton button_5 = new JButton("5");
        JButton button_6 = new JButton("6");
        JButton button_7 = new JButton("7");
        JButton button_8 = new JButton("8");
        JButton button_9 = new JButton("9");
        JButton button_0 = new JButton("0");

        // Create an array for the buttons
        JButton buttons[] = {button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0};

        int button_x = 22;

        int y = 0;

        
        for(int x = 0; x < 10; x++){

            buttons[x].setSize(200, 200);

            panel.add(buttons[x]);

        }


    }
    
}
