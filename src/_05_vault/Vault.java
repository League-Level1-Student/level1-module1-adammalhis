package _05_vault;

import java.util.Random;

	public class Vault {
		
		Vault (int code) {
			this.code= code;
		}
	
	int code = new Random().nextInt(1000000);

	public boolean tryCode(int guess) {
		if (guess == (code)) {
			return true;
		} else {
			return false;
		}

	}
}
