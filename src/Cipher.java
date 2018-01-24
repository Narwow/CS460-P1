
public interface Cipher {
	
	/* Get input from user and used as plaintext in the cipher algorithm.
	 * The plaintext is processed in this method according to different
	 * algorithms. Spaces are taken out in this method.
	 */
	public void getPText();
	
	
	/* Return the ciphertext in string without spaces.
	 */
	public String getCText();
}
