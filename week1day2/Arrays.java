package week1day2;

public class Arrays 
{
	public static void main(String[] args) 
	{
		int a =10;
		int b[] = new int[5];
		
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		int c[] = {100,200,300,400,500};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}
