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
		
		setLayout(new GridLayout(3,1));
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
		
		JPanel userSquare = new JPanel();
		userSquare.setLayout(new GridLayout(1, 4, 10, 10));
		userSquare.add(new JLabel("Side"));
		userSquare.add(sideS); 
		userSquare.add(countS); //add button
		userSquare.add(clearS); //add button
		
		JPanel userTriangle = new JPanel();
		userTriangle.setLayout(new GridLayout(1, 4, 10, 10));
		userTriangle.add(new JLabel("Side"));
		userTriangle.add(sideT); 
		userTriangle.add(countT); //add button
		userTriangle.add(clearT); //add button
		
		
		//Create a panel to display the area and the perimeter
		JPanel answerC = new JPanel();
		answerC.setLayout(new GridLayout(1, 4, 23, 0));
		answerC.add(new JLabel("Area"));
		answerC.add(areaC);
		answerC.add(new JLabel("Perimeter"));
		answerC.add(perimeterC);
		
		JPanel answerS = new JPanel();
		answerS.setLayout(new GridLayout(1, 2, 23, 10));
		answerS.add(new JLabel("Area"));
		answerS.add(areaS);
		answerS.add(new JLabel("Perimeter"));
		answerS.add(perimeterS);
		
		JPanel answerT = new JPanel();
		answerT.setLayout(new GridLayout(1, 2, 23, 10));
		answerT.add(new JLabel("Area"));
		answerT.add(areaT);
		answerT.add(new JLabel("Perimeter"));
		answerT.add(perimeterT);
		
		
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
		
		this.add(allCircle);
		this.add(allSquare);
		this.add(allTriangle);
		countC.addActionListener(new ButtonCountC());
		clearC.addActionListener(new ButtonClearC());
		countS.addActionListener(new ButtonCountS());
		clearS.addActionListener(new ButtonClearS());
		countT.addActionListener(new ButtonCountT());
		clearT.addActionListener(new ButtonClearT());
		
	}
	
	
	private class ButtonCountC implements ActionListener {
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
	
	private class ButtonCountS implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == countS) {
				//get the side that user enter
				sideSUser = Double.parseDouble(sideS.getText());
			}
			
			//Create a square
			Square square1 = new Square(sideSUser);
			
			//Print the result on text field
			areaS.setText(String.format("%.2f",square1.getArea()));
			perimeterS.setText(String.format("%.2f",square1.getPerimeter()));
		}
	}
	
	private class ButtonCountT implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == countT) {
				//get the side that user enter
				sideTUser = Double.parseDouble(sideT.getText());
			}
			
			//Create a triangle
			RegularTriangle triangle1 = new RegularTriangle(sideTUser);
			
			//Print the result on text field
			areaT.setText(String.format("%.2f",triangle1.getArea()));
			perimeterT.setText(String.format("%.2f",triangle1.getPerimeter()));
		}
	}
	
	private class ButtonClearC implements ActionListener {
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
	
	private class ButtonClearS implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == clearS) {
				
				//Clear the radius, area and perimeter
				sideS.setText(null);
				areaS.setText(null);
				perimeterS.setText(null);
			}
		}
	}
	
	private class ButtonClearT implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == clearT) {
				
				//Clear the radius, area and perimeter
				sideT.setText(null);
				areaT.setText(null);
				perimeterT.setText(null);
			}
		}
	}
	
	public static void main(String[] args) {
		Area frame = new Area(); //Create a frame
	    frame.setTitle("U10316013_GeoCalculate"); //set the title of frame
	    frame.setSize(350, 450); //Set the size of frame
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true); //Display the frame
	}
}
