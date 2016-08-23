import java.util.Scanner;

public class Substring {
	public static void main(String args)
	{
		String lineOfText;
		String substring;
		char[] characters;
		char[] charOfSubstring;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the line of text");
		lineOfText=scan.nextLine();
		System.out.println("Enter the substring to find");
		substring=scan.nextLine();
		characters=lineOfText.toCharArray();
		charOfSubstring=substring.toCharArray();
		int lengthOfText=characters.length;
		int lengthOfSubstring=charOfSubstring.length;
		int i,j=0;
		while(j<= lengthOfText-lengthOfSubstring)
		{
		for(i=0;i<lengthOfSubstring;i++)
		{
			if(characters[i+j]!=charOfSubstring[i])
			{
			break;
			}
			else
				j++;
		}
		if(i==lengthOfSubstring)
		{
			System.out.println("yes");
			return;
		}
		}
		System.out.println("no");
		
		
	}
		

}
