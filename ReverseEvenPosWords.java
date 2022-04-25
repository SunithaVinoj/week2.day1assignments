package week2.day1;

public class ReverseEvenPosWords {

			public static void main(String[] args)
			{
				
			String text1="I am a software tester";
			String[] text2 = text1.split(" ");
			int i;
			
			for(i=0;i<text2.length;i++)
			{
		
				if(i%2!=0)
				{
					char[] chrArray=text2[i].toCharArray();
					String rev="";
					
					for(int j=(chrArray.length-1);j>=0;j--)
					{
						rev=rev+chrArray[j];	
					}
					
					text2[i]=rev;
					System.out.print(text2[i]+" ");
				}
				
				else 
					System.out.print(text2[i]+" ");
		
			}
			
			
		}

	}


