package _04_popcorn;

public class JamesBond {
	public int findCode(Vault vault) {
		
		for (int i = 0; i < 1000001; i++) {
			if (vault.tryCode(i) == true) {
				return i;
				
			}

		}
		return -1;
	}
}