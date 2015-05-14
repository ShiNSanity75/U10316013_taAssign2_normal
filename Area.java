import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

/**Main Method*/
public class Area extends JFrame implements ActionListener {
	
	//Create a button
	JButton count = new JButton("Count");
	JButton clear = new JButton("Clear");
	
	//Create TextField
	JTextField radious = new JTextField(3);
	JTextField areaC = new JTextField(3);
	JTextField perimeterC = new JTextField(3);
	
	//Radious that user enter
	double radiousUser;
	
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
		
		}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == count){
		   //get the radious that user enter
			radiousUser = Double.parseDouble(radious.getText());
		}
	}
	
	private class ButtonCount implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//Create a circle
			TestSimpleCircle circle1 = new TestSimpleCircle(radiousUser);
			
			//circle1.getArea();
			circle1.getPerimeter();	
			areaC.setText(String.format("%.2f",circle1.getArea()));
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
