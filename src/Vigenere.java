import java.util.Scanner;

public class Vigenere implements Cipher {

	private Scanner sc = new Scanner(System.in);
	private String key;
	private String cipherT;

	@Override
	public void getPText() {

		String pt;

		System.out.println("Please enter plaintext:");
		pt = sc.nextLine();

		System.out.println("Please enter the key for Vigenere Cipher (a string length < plaintext length:)");
		key = sc.nextLine();

		cipherT = encrypt(pt, key);
	}

	private String encrypt(String pt, String key) {

		StringBuffer result = new StringBuffer();
		String finalPT = pt.replaceAll("\\p{Z}", "");
		key.toUpperCase();
		//finalPT.toUpperCase();

		for (int i = 0, j = 0; i < finalPT.length(); i++) {
			
			char temp = finalPT.charAt(i);;
            
			if(Character.isUpperCase(finalPT.charAt(i))){
				result.append((char) ((temp + key.charAt(j) - 2 * 'A') % 26 + 'A')); 
	            j = ++j % key.length();
				
			}else if(Character.isLowerCase(finalPT.charAt(i))){
				result.append((char) ((temp + key.charAt(j) - 2 * 'a') % 26 + 'a')); 
	            j = ++j % key.length();
			}
		}

		return result.toString();
	}

	@Override
	public String getCText() {

		return cipherT;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
