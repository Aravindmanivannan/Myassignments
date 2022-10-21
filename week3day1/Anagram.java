package week3day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1= "stops";
		String text2="potss";
		 if (text1.length()==text2.length()) {
char text3[]=text1.toCharArray();
char text4[]=text2.toCharArray();
 Arrays.sort(text3);
 Arrays.sort(text4);
  boolean mango =Arrays.equals(text3,text4);
  System.out.println(mango);
 if (mango) {
	 
	System.out.println("what is your name"); 
 }
 else {
	 System.out.println("what is your age");
 }
 
		 }
		 
				
	}

}
