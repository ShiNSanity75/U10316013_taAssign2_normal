import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**Main Method*/
public class Area extends JFrame{
	
	//Create buttons
	JButton countC = new JButton("Count");
	JButton clearC = new JButton("Clear");
	JButton countS = new JButton("Count");
	JButton clearS = new JButton("Clear");
	JButton countT = new JButton("Count");
	JButton clearT = new JButton("Clear");
	
	//Create TextFields
	JTextField radius = new JTextField(3);
	JTextField areaC = new JTextField(3);
	JTextField perimeterC = new JTextField(3);
	JTextField sideS = new JTextField(3);
	JTextField areaS = new JTextField(3);
	JTextField perimeterS = new JTextField(3);
	JTextField sideT = new JTextField(3);
	JTextField areaT = new JTextField(3);
	JTextField perimeterT = new JTextField(3);
	
	//Radius that user enter
	double radiusUser;
	//side that user enter
	double sideSUser;
	double sideTUser;
	

	
	public Area() {
		
		//Create a panel to put everthing of circle, square and triangle
		JPanel allCircle = new JPanel();
		JPanel allSquare = new JPanel();
		JPanel allTriangle = new JPanel();
		
		
		//Create a panel to display the title of Circle, square and triangle
		JPanel titleCircle = new JPanel();
		JLabel circle = new JLabel("Circle");
		titleCircle.add(circle);
		
		JPanel titleSquare = new JPanel();
		JLabel square = new JLabel("Square");
		titleSquare.add(square);
		
		JPanel titleTriangle = new JPanel();
		JLabel triangle = new JLabel("Regular Triangle");
		titleTriangle.add(triangle);
		
		
		//Create a panel to let user enter radius or side
		JPanel userCircle = new JPanel();
		userCircle.setLayout(new GridLayout(1, 4, 10, 10));
		userCircle.add(new JLabel("Radious"));
		userCircle.add(radius); 
		userCircle.add(countC); //add button
		userCircle.add(clearC); //add button
		setLayout(new FlowLayout());
		
		JPanel userSquare = new JPanel();
		userSquare.setLayout(new GridLayout(1, 4, 10, 10));
		userSquare.add(new JLabel("Side"));
		userSquare.add(sideS); 
		userSquare.add(countS); //add button
		userSquare.add(clearS); //add button
		setLayout(new FlowLayout());
		
		JPanel userTriangle = new JPanel();
		userTriangle.setLayout(new GridLayout(1, 4, 10, 10));
		userTriangle.add(new JLabel("Side"));
		userTriangle.add(sideT); 
		userTriangle.add(countT); //add button
		userTriangle.add(clearT); //add button
		setLayout(new FlowLayout());
		
		
		//Create a panel to display the area and the perimeter
		JPanel answerC = new JPanel();
		answerC.setLayout(new GridLayout(1, 2, 10, 10));
		userCircle.add(new JLabel("Area"));
		userCircle.add(areaC);
		userCircle.add(new JLabel("Perimeter"));
		userCircle.add(perimeterC);
		
		JPanel answerS = new JPanel();
		answerS.setLayout(new GridLayout(1, 2, 10, 10));
		userSquare.add(new JLabel("Area"));
		userSquare.add(areaS);
		userSquare.add(new JLabel("Perimeter"));
		userSquare.add(perimeterS);
		
		JPanel answerT = new JPanel();
		answerT.setLayout(new GridLayout(1, 2, 10, 10));
		userTriangle.add(new JLabel("Area"));
		userTriangle.add(areaT);
		userTriangle.add(new JLabel("Perimeter"));
		userTriangle.add(perimeterT);
		
		
		//put panel together
		allCircle.add(titleCircle);
		allCircle.add(userCircle);
		allCircle.add(answerC);
		
		allSquare.add(titleSquare);
		allSquare.add(userSquare);
		allSquare.add(answerS);
		
		allTriangle.add(titleTriangle);
		allTriangle.add(userTriangle);
		allTriangle.add(answerT);
		
		add(allCircle);
		add(allSquare);
		add(allTriangle);
		countC.addActionListener(new ButtonCount());
		clearC.addActionListener(new ButtonClear());
		
	}
	
	
	private class ButtonCount implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == countC) {
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
			
			if(e.getSource() == clearC) {
				
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
