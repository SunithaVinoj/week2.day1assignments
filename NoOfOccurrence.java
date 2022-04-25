package week2.day1;

public class NoOfOccurrence 
{
	public static void main(String[] args)
	{
		String text1="testleaf";
		char[] charArr = text1.toCharArray();
		int i,count=0;
		
		for(i=0;i<charArr.length;i++)
		{
			if(charArr[i]=='e')
			{
				count=count+1;
			}
			}
		System.out.println("No. Of occurrence of character 'e' in " +text1 + " is " +count);
		
	}

}
