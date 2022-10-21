package week3day1;

public class ReverseName {

	public static void main(String[] args) {

		String name="Aravind";
		
		char ch[]=name.toCharArray();  

		String rev1= "";
		for(int i=0;i<=ch.length-1;i++){  
			rev1=rev1+ch[i];
		}
		System.out.println(rev1);
		
		String rev= "";  
		for(int i=ch.length-1;i>=0;i--){  
			rev+=ch[i];  
		} 
		
		System.out.println(rev); 
	}
}


