package week2.day1;

public class MatchString {
	
	public static void main(String[] args) {
		String text1="Testleaf is located in twin towers teynampet";
		String[] text2 = text1.split(" ");
		int i;
		
		for(i=0;i<text2.length;i++)
		{
			if (text2[i].startsWith("t")||text2[i].startsWith("T"))
				System.out.println("Word starts with 't' or 'T' " +text2[i]);
				
		}
		
		
	}

}
