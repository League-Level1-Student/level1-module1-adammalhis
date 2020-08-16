package _04_popcorn;

import javax.swing.JOptionPane;

public class PopCornMaker {
public static void main(String[] args) {
	
	String cheese= JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String minutes= JOptionPane.showInputDialog("how many minutes should we cook the popcorn?");
	int minutes2= Integer.parseInt(minutes);
	Microwave microwave= new Microwave();
	Popcorn popcorn= new Popcorn(cheese);
	microwave.putInMicrowave(popcorn);
	microwave.setTime(minutes2);
	
	
	
}	
}
