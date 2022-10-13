import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class calculator {

    // Create our constants for our width and height
    final int WIDTH = 365;
    final int HEIGHT = 395;

    // Create an integer for a running total
    static int runningTotal = 0;

    // Create our JFrame object
    static JFrame frame = new JFrame("Calculator");

    // Create our JPanel object
    static JPanel panel = new JPanel();

    // Create a label to display the calculations
    static JLabel display = new JLabel("Test", SwingConstants.RIGHT);

    // Create our buttons
    static JButton button_1 = new JButton("1");
    static JButton button_2 = new JButton("2");
    static JButton button_3 = new JButton("3");
    static JButton button_4 = new JButton("4");
    static JButton button_5 = new JButton("5");
    static JButton button_6 = new JButton("6");
    static JButton button_7 = new JButton("7");
    static JButton button_8 = new JButton("8");
    static JButton button_9 = new JButton("9");
    static JButton button_0 = new JButton("0");
    static JButton button_plus = new JButton("+");
    static JButton button_minus = new JButton("-");
    static JButton button_multiply = new JButton("X");
    static JButton button_divide = new JButton("/");
    static JButton button_clear = new JButton("C");
    static JButton button_equal = new JButton("=");

    // Create an array for the buttons
    static JButton buttons[] = {button_1, button_2, button_3, button_plus,
                                button_4, button_5, button_6, button_minus, 
                                button_7, button_8, button_9, button_multiply, 
                                button_0, button_clear, button_divide, button_equal};


    // Create a function for creating the window
    public void createWindow(){

        // Set the frame size
        frame.setSize(WIDTH , HEIGHT);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Add the panel to the frame
        frame.add(panel);
        
        // Set the panel layout to null
        panel.setLayout(null);
        
        // THe starting position for the buttons y location
        int button_y = 130;

        // Used to loop through all the buttons in the buttons[] array
        int z = 0;

        // Use a for loop to add all the buttons to the panel with the positions and size
        for(int y = 0; y < 4; y++){

            // Used to track the x coordinate for the buttons
            int button_x = 6;

            // Used to create the three buttons in each row
            for(int x = 0; x < 4; x++){

                // Set the bounds of the button
                buttons[z].setBounds(button_x, button_y, 80, 50);

                // Add the button to the panel
                panel.add(buttons[z]);

                // Move the next button to the right
                button_x = button_x + 86;

                // Add one to the z count
                z = z + 1;

            }

            // Move down a row to start the next buttons
            button_y = button_y + 56;

        }

        // Set the bounds for the display label
        display.setBounds(5, 15, 340, 100);

        // Make sure the background for the label is solid
        display.setOpaque(true);

        // Change the color of the background of the label
        display.setBackground(Color.LIGHT_GRAY);

        // Add the display label to the panel
        panel.add(display);

        runCalculator();
        

    }

    public void runCalculator(){

        button_0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("0");

            }
        });

        button_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("1");

            }
        });

        button_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("2");

            }
        });

        button_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("3");

            }
        });

        button_4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("4");

            }
        });

        button_5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("5");

            }
        });

        button_6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("6");

            }
        });

        button_7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("7");

            }
        });

        button_8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("8");

            }
        });

        button_9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("9");

            }
        });

        button_plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Plus");

            }
        });

        button_minus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Minus");

            }
        });

        button_multiply.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Multiply");

            }
        });

        button_divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Divide");

            }
        });

        button_clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Clear");

            }
        });

        button_equal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                System.out.println("Enter");

            }
        });


    }
    
}

