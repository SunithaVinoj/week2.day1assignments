package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args)
	{
	String s1="stops";
	String s2="potss";
	
	
	if(s1.length()==s2.length())
	{
		
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			int i;
			boolean flag=false;
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			/*if (charArray1.equals(charArray2))				
				flag=true;
			
			System.out.println(charArray1); 
			System.out.println(charArray2+ " " +charArray1.equals(charArray2)); */
			
			for(i=0;i<charArray1.length;i++)
			{
			/*	System.out.println(charArray1[i]);
				System.out.println(charArray2[i]); */
				
				if(charArray1[i]==charArray2[i])
					flag=true;
				else
					break;
				
			}
				
			//System.out.println("flag"+flag);
			
			if (flag)
				System.out.println(s1 + " " +s2 + " are Anagram");
			else
				System.out.println(s1 + " " +s2 + " are not a Anagram");
	}
	
	else
		System.out.println(s1 + " " +s2 + "  are not of equal length");
	
	}


}

