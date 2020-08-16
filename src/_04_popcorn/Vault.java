package _04_popcorn;

import java.util.Random;

public class Vault {
	int code= new Random().nextInt(1000000);
public void tryCode(int guess) {
	if (guess == (code)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
	
	}
}
