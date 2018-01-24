import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		Cipher cipher;
		System.out.println("Welcome to the program, select one encryption method.");
		System.out.println("Type 'exit' to exit the program\n");
		
		
		
		while (isRunning) {
			
			System.out.printf("Type %d " + "to select Caeser Encryption.\n", 1);
			System.out.printf("Type %d " + "to select FairPlay Encryption.\n", 2);
			System.out.printf("Type %d " + "to select Vigenere Encryption.\n", 3);

			String nextLine = sc.nextLine();

			if (nextLine.equals("exit")) {
				System.out.println("Goodbye, program terminated");
				isRunning = false;
			} else {

				if (nextLine.equals("1")) {
					System.out.println("Caeser Selected");
					cipher = new CaeserCipher();
					cipher.getPText();
					System.out.println("Caeser Cipher Text(without spaces): " + cipher.getCText());
					System.out.println("--------------------------------------------------------");
					
				} else if (nextLine.equals("2")) {
					System.out.println("FairPlay Selected");
					cipher = new FairPlay();
					cipher.getPText();
					System.out.println(cipher.getCText());
					
				} else if (nextLine.equals("3")) {
					System.out.println("Vigenere Selected");
					cipher = new Vigenere();
					cipher.getPText();
					System.out.println(cipher.getCText());
					
				} else {
					System.out.println("Invalid input, please select a valid option.");
				}
			}

		}

	}

}
