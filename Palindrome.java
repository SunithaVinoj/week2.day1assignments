package week2.day1;

public class Palindrome
{
public static void main(String[] args) {

	String actual="madam";
	String reverse="";
	int i;
	
	//System.out.println(actual.length());
	
		for(i=actual.length()-1;i>=0;i--)
		{
		reverse=reverse+actual.charAt(i);
		} 
	
	//System.out.println(reverse);
	
	if(actual.equalsIgnoreCase(reverse))
		System.out.println(actual + " is a palindrome ");  
	else
		System.out.println(actual + " is not a palindrome ");
		
		
	
}
}
