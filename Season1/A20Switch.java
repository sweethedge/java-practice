// ÀÚÃàÀÎ¹¦Áø»ç¿À¹Ì½ÅÀ¯¼úÇØ 4567 891011 0123
// Áã¶ì ¼Ò¶ì ¹ü¶ì Åä³¢¶ì ¿ë¶ì ¹ì¶ì ¸»¶ì ¾ç¶ì ¿ø¼şÀÌ¶ì ´ß¶ì °³¶ì µÅÁö¶ì 
package original;

import java.util.Scanner;

public class A20Switch {
	// ¸Ş¼­µå °³¸·
	public static String tti(int a) {
		// ½ºÄ³³Ê±ò°í ¿ä±¸ÇÑ µÚ ´ëÀÔ
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÔ·ÂÇÏ½Ã¿À : ");
		a = sc.nextInt();
		// À§¸¦ ÂüÁ¶ÇØ¼­ ¹İÈ¯ÇÏ°í
		if (a % 12 == 4) return "Áã¶ì";
		if (a % 12 == 5) return "¼Ò¶ì";
		if (a % 12 == 6) return "È£¶ûÀÌ¶ì";
		if (a % 12 == 7) return "Åä³¢¶ì";
		
		if (a % 12 == 8) return "¿ë¶ì";
		if (a % 12 == 9) return "¹ì¶ì";
		if (a % 12 == 10) return "¸»¶ì";
		if (a % 12 == 11) return "¾ç¶ì";
		
		if (a % 12 == 0) return "¿ø¼şÀÌ¶ì";
		if (a % 12 == 1) return "´ß¶ì";
		if (a % 12 == 2) return "°³¶ì";
		if (a % 12 == 3) return "µÅÁö¶ì";

		// ±× ¿Ü null ¹İÈ¯
		else return null;
	}
	
	public static String tti2(int b) {
		// ½ºÄ³³Ê±ò°í ¿ä±¸ÇÑ µÚ ´ëÀÔ
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÔ·ÂÇÏ½Ã¿À : ");
		b = sc.nextInt();
		sc.close();
		// switch ¹® °³¸·
		switch (b % 12) {
		// case ±ò°í
		case (4) : return "Áã¶ì";
		case (5) : return "¼Ò¶ì";
		case (6) : return "È£¶ûÀÌ¶ì";
		case (7) : return "Åä³¢¶ì";

		case (8) : return "¿ë¶ì";
		case (9) : return "¹ì¶ì";
		case (10) : return "¸»¶ì";
		case (11) : return "¾ç¶ì";
		
		case (0) : return "¿ø¼şÀÌ¶ì";
		case (1) : return "´ß¶ì";
		case (2) : return "°³¶ì";
		case (3) : return "µÅÁö¶ì";
		}
		// ¹İÈ¯°ª
		return null;
		
	}
	public static void main(String[] args) {
		// º¯¼ö ¼±¾ğ ¹× Ãâ·Â
		int a = 0;
		int b = 0;
//		System.out.println(tti(a));
		System.out.println(tti2(b));

	}

}
