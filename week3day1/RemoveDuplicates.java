package week3day1;



public class RemoveDuplicates {

	public static void main(String[] args) {

		String text="We learn java basics as part of java sessions in java week1";
		System.out.println("Original text: "+text);

		
		String learn[]=text.split(" ");

		for (int i=0;i<learn.length;i++) 
		{
			int count=0;
			for (int j=i+1;j<learn.length;j++) {
				if(learn[i].equals(learn[j])) {
					count++;
				}				
			}
			if(count>1) {
				System.out.println("Replaced text: "+text.replace(learn[i], ""));
				
			}
		}
		
	}
}