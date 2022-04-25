package week2.day1;

import java.util.Iterator;

public class FindTypes {
	public static void main(String[] args) {
		
		String text="$$ Welcome to 2nd Class of Automation $$ ";
		char[] charArray = text.toCharArray();
		int length = charArray.length;
		int i,letter=0,num=0,space=0,specialchar=0;
		
		for (i = 0; i < length; i++) 
		{
			if (Character.isLetter(charArray[i]))
				letter++;
			else if (Character.isDigit(charArray[i]))
				num++;
			else if (Character.isSpaceChar(charArray[i]))
				space++;
			else
				specialchar++;
				
		}
		
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialchar);
		
		
	} 
	

}
