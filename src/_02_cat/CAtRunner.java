package _02_cat;

public class CAtRunner {
public static void main(String[] args) {
	
	Cat bob= new Cat("bob");
	bob.meow();
	bob.printName();
	for (int i=0; i<9; i++) {
	bob.kill();
	}
	
}
}
