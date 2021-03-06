package utility;

import org.apache.commons.codec.binary.Base64;

public class EncryptDecrypt {

	/**
	 * Encrypts a given String and returns an encoded version of it. For example, if
	 * you enter encryptPassword("MyPassword123") as the string to be encoded this
	 * method will return the encrypted string "TXlQYXNzd29yZDEyMw==".
	 * 
	 * @param password
	 *            string to be encrypted
	 * @return encrypted version of given string password
	 */
	public static String encryptPassword(String password) {
		byte[] encodedPwdBytes = Base64.encodeBase64(password.getBytes());
		return new String(encodedPwdBytes);

	}

	/**
	 * Decrypts a given String and returns the original version of it. For example,
	 * if you want to decrypt a String like TXlQYXNzd29yZDEyMw, then
	 * decryptPassword("TXlQYXNzd29yZDEyMw==") will return "MyPassword123"
	 * 
	 * @param password
	 *            the encrypted password to be decrypted
	 * @return decrypted or original version of given encrypted password
	 */
	public static String decryptPassword(String encryptedPassword) {
		byte[] decodedPwdBytes = Base64.decodeBase64(encryptedPassword.getBytes());
		return new String(decodedPwdBytes);

	}
	
	
}
