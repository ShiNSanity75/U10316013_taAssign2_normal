import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**Main Method*/
public class Area extends JFrame{
	
	//Create a button
	JButton count = new JButton("Count");
	JButton clear = new JButton("Clear");
	
	//Create TextField
	JTextField radius = new JTextField(3);
	JTextField areaC = new JTextField(3);
	JTextField perimeterC = new JTextField(3);
	
	//Radius that user enter
	double radiusUser;

	
	public Area() {
		
		//Create a panel to put everthing of circle
		JPanel allCircle = new JPanel();
		
		//Create a panel to display the title of Circle
		JPanel titleCircle = new JPanel();
		JLabel circle = new JLabel("Circle");
		titleCircle.add(circle);
		
		//Create a panel to let user enter radius
		JPanel userCircle = new JPanel();
		userCircle.setLayout(new GridLayout(1, 4, 10, 10));
		userCircle.add(new JLabel("Radious"));
		userCircle.add(radius); 
		userCircle.add(count); //add button
		userCircle.add(clear); //add button
		setLayout(new FlowLayout());
		
		//Create a panel to display the area and the perimeter
		JPanel answer = new JPanel();
		answer.setLayout(new GridLayout(1, 2, 10, 10));
		userCircle.add(new JLabel("Area"));
		userCircle.add(areaC);
		userCircle.add(new JLabel("Perimeter"));
		userCircle.add(perimeterC);
		
		//put panel together
		allCircle.add(titleCircle);
		allCircle.add(userCircle);
		allCircle.add(answer);
		
		add(allCircle);
		count.addActionListener(new ButtonCount());
		clear.addActionListener(new ButtonClear());
		
	}
	
	
	private class ButtonCount implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == count) {
				//get the radius that user enter
				radiusUser = Double.parseDouble(radius.getText());
			}
			
			//Create a circle
			TestSimpleCircle circle1 = new TestSimpleCircle(radiusUser);
			
			//Print the result on text field
			areaC.setText(String.format("%.2f",circle1.getArea()));
			perimeterC.setText(String.format("%.2f",circle1.getPerimeter()));
		}
	}
	
	
	private class ButtonClear implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == clear) {
				
				//Clear the radius, area and perimeter
				radius.setText(null);
				areaC.setText(null);
				perimeterC.setText(null);
			}
		}
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
