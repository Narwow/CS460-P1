import java.util.Scanner;

public class CaeserCipher implements Cipher{
	
	private Scanner sc = new Scanner(System.in);
	private String cipherT;
	
	@Override
	public void getPText() {
		String pt;
		int key;
		
		System.out.println("Please enter plaintext:");
		pt = sc.nextLine();
		
		System.out.println("Please enter the key for Caeser Cipher [1-26]");
		key = sc.nextInt();
		
		
		cipherT = encrypt(pt,key);
	}

	@Override
	public String getCText() {
		
		return cipherT;
	}
	
	private String encrypt(String pt, int key) {

		StringBuffer result = new StringBuffer();
		String finalPT = pt.replaceAll("\\p{Z}","");
		char temp;
		
		for(int i = 0; i < finalPT.length(); i++){
			
			if(Character.isUpperCase(finalPT.charAt(i))){
				temp = (char)(((int)finalPT.charAt(i) - 65 + key) % 26 + 65);
				result.append(temp);
				
			}else if(Character.isLowerCase(finalPT.charAt(i))){
				temp = (char)(((int)finalPT.charAt(i) - 97 + key) % 26 + 97);
				result.append(temp);
			}
		}

		return result.toString();
	}
}
