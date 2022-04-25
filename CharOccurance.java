package week2.day1;

public class CharOccurance {

			public static void main(String[] args)
		{
			String text1="welcome to chennai";
			char[] charArr = text1.toCharArray();
			int i,count=0;
			
			for(i=0;i<charArr.length;i++)
			{
				if(charArr[i]=='e')
				{
					count=count+1;
				}
				}
			System.out.println("No. Of occurrences of a character 'e' in " +text1 + " is " +count);
			
		}

	}


