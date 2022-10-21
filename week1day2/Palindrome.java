package week1day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		int n=34343, i=0, rem, temp;
		temp = n;
		
		for(i=0;n>0;n=n/10) {
			rem = n%10;
			i=(i*10)+rem;
		}
		
		if(i==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
