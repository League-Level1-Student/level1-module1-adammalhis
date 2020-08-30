package _05_vault;

import java.util.Random;

public class VaultRunner {
public static void main(String[] args) {

	Vault vault= new Vault(new Random().nextInt(1000000));
	JamesBond jamesBond= new JamesBond();
	System.out.println(jamesBond.findCode(vault));
}
}
