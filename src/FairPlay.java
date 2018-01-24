import java.util.Scanner;

public class FairPlay implements Cipher {
	
	private String key;
	private char[][] keyMap;
	private String cipherT;
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void getPText() {
		
		String pt;
		
		System.out.println("Please enter plaintext: ");	
		pt = sc.nextLine();
		
		System.out.println("Please enter the keyword: ");
		setKey(sc.nextLine().trim());
		
		encrypt(pt, key);
	}

	private void encrypt(String pt, String key) {
		
		String finalPT = pt.replaceAll("\\p{Z}", "");
		
	}

	@Override
	public String getCText() {
		// TODO Auto-generated method stub
		return cipherT;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public char[][] getKeyMap() {
		return keyMap;
	}

	public void setKeyMap(char[][] keyMap) {
		this.keyMap = keyMap;
	}

}
