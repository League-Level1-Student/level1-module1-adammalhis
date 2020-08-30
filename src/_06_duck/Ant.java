package _06_duck;

public class Ant {

	String typeOfAnt;
	int ageOfAnt;
	String name;
	
	
	Ant (String typeOfAnt, String name, int ageOfAnt) {
		this.typeOfAnt= typeOfAnt;
		this.ageOfAnt= ageOfAnt;
		this.name= name;
		
	}
	void eat() {
		System.out.println(name  + " ate");
		
		
	}
	
	void poop() {
		System.out.println(name + " pooped");
		
		
	}
	
		
}
