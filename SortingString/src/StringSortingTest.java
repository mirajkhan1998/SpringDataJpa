import java.io.InputStream;
import java.util.Scanner;

public class StringSortingTest {

	public static void main(String[] args) {
		/*
		 * String s = null; s = "miraj"; char[] ch = s.toCharArray();
		 * 
		 * for (int i = ch.length - 1; i >= 0; i--) { System.out.print(ch[i]);
		 * 
		 * }
		 */

		/*
		 * String s = null; s = "mirajkhan";
		 * 
		 * int length = s.length();
		 * 
		 * for (int i = length - 1; i >= 0; i--) { System.out.print(s.charAt(i)); }
		 */
		/*
		 * String s=new StringBuffer("miraj").reverse().toString();
		 * System.out.println(s);
		 */

		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter a String"); String s=sc.next();
		 * 
		 * for(int i=s.length()-1;i>=0;i--) { System.out.print(s.charAt(i)); }
		 */

		String s = "elephent";
		int count = 0;
		char[] ch = s.toCharArray();
		{

		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
		}
		System.out.println("noOfDuplicatesElement:" + count);

	}

}
