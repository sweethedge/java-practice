//  .charAt(num) ÀÌ¶ó´Â ÇÔ¼ö¸¦ mdn¿¡¼­ ÀĞ¾îº¸¸é
//  num¿¡ ÀÖ´Â ¹®ÀÚ¿­À» ¹İÈ¯ÇÑ´Ù.
//  ¹İº¹¹®°ú Á¶°Ç¹®À» ÀûÀıÈ÷ È°¿ëÇÏ¸é ¿øÇÏ´Â ¹®ÀÚ¿­À» »ÌÀ» ¼ö ÀÖ´Ù.

package original;

public class A29JamoTry2Q {
	// °¢°¢ÀÇ Á¶°Ç¹®À» ¹ŞÀ» º¯¼ö ¼±¾ğ
	int b = 0, c = 0, d = 0, e = 0, z = 0;
	// ¸Ş¼­µå °³¸·
	public void asdf(String a) {
		// °ø¹é ÀÚ¸£°í
		String b = a.replace(" ", "");
		// Æ¯¼ö¹®ÀÚ ÀÚ¸£±â.
		String c = b.replaceAll("[^¤¡-¤¾¤¿-¤Ó°¡-ÆRa-zA-Z0-9]", "");
		// Àß Àß·È´ÂÁö ÇÑ ¹ø ÇÁ¸°Æ®ÇØ º¸°í
		System.out.println(c);
		
		// ¹®ÀÚ¿­ÀÇ ±æÀÌ¸¸Å­ µµ´Â ¹İº¹¹® °³¸·
		for (int i = 0; i < c.length(); i++) {
			// ¸ğÀ½ÀÇ °¹¼ö¸¦
			if (
					c.charAt(i) == 'a' || 
					c.charAt(i) == 'e' || 
					c.charAt(i) == 'i' || 
					c.charAt(i) == 'o' || 
					c.charAt(i) == 'u') {
			
				// º¯¼ö¿¡ ´ã¾ÆµÎ°í
				d++;
				// ¾Æ´Ñ °Ç ´Ù¸¥ °Å¿¡ ³Ö¾îµĞ´Ù.
			} else e++;
		}
		// ÇÁ¸°Æ®
		
		System.out.println("¸ğÀ½ : " + d);
		System.out.println("ÀÚÀ½ : " + e);
	}


	public static void main(String[] args) {
		A29JamoTry2Q gg = new A29JamoTry2Q();
		gg.asdf("Programming is fun! right?");

	}

}
