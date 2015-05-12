import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**Main Method*/
public class Area extends JFrame{
	
	//Create a button
	JButton count = new JButton("Count");
	JButton clear = new JButton("Clear");
	

	JTextField radious = new JTextField(3);
	JTextField areaC = new JTextField(3);
	JTextField perimeterC = new JTextField(3);
	
	public Area() {
		
		//Create a panel to put everthing of circle
		JPanel allCircle = new JPanel();
		
		//Create a panel to display the title of Circle
		JPanel titleCircle = new JPanel();
		JLabel circle = new JLabel("Circle");
		titleCircle.add(circle);
		
		//Create a panel to let user enter radious
		JPanel userCircle = new JPanel();
		userCircle.setLayout(new GridLayout(1, 4, 10, 10));
		userCircle.add(new JLabel("Radious"));
		userCircle.add(radious);
		userCircle.add(count);
		userCircle.add(clear);
		setLayout(new FlowLayout());
		
		//Create a panel to display the area and the perimeter
		JPanel answer = new JPanel();
		answer.setLayout(new GridLayout(1, 2, 10, 10));
		userCircle.add(new JLabel("Area"));
		userCircle.add(areaC);
		userCircle.add(new JLabel("Perimeter"));
		userCircle.add(perimeterC);
		
		allCircle.add(titleCircle);
		allCircle.add(userCircle);
		allCircle.add(answer);
		
		add(allCircle);
		
	}
	
	public static void main(String[] args) {
		Area frame = new Area(); //Create a frame
	    frame.setTitle("U10316013_GeoCalculate"); //set the title of frame
	    frame.setSize(800, 350); //Set the size of frame
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true); //Display the frame
	}
}
