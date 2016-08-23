package string1;


	import java.util.Scanner;
	import java.io.*;

	public class substring {
	    public static boolean isFound(int lengthOfText, int lengthOfSubstring, char[] characters, char[] charsOfSubstring)
	        {
	    int i,j=0;
	        //iterate through the line of text
			while(j<= lengthOfText-lengthOfSubstring)
			{
	            //iterate through the substring
			for(i=0;i<lengthOfSubstring;i++)
			{
				if(characters[i+j]!=charsOfSubstring[i])
				{    
	              //if mismatch found stop current search
				break;
				}
				
			}
	            //look for match from next character in the line of text
	             j++;
			if(i==lengthOfSubstring)
			{
	            //if all characters in the substring are compared and are matching
				return true;
			}
	           
	            
			}
	        return false;
	    }
		public static void main(String[] args) throws FileNotFoundException, IOException 
		{
			String lineOfText="";
			String substring="";
			char[] characters;
			char[] charsOfSubstring;
			int choice;
			Scanner scan=new Scanner(System.in);
			System.out.println("Press 1 to enter from console.Press 2 to read from file");
			choice=scan.nextInt();
			if(choice==1)
			{
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the line of text");
			lineOfText=input.readLine();
			
	        System.out.println("Enter the substring to find");
			substring=input.readLine();
			
			}
			else if(choice==2)
			{
				String filename;
				System.out.println("Enter the file name");
				filename=scan.next();
				BufferedReader reader = new BufferedReader(new FileReader(filename));
			//InputStream in = new FileInputStream(new File(filename));
			try{	
	        
	        lineOfText= reader.readLine();
	        substring=reader.readLine();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
	        //StringBuilder out = new StringBuilder();
	        
	       
	        
	        //System.out.println(line);
			}
			else
			{
				System.out.println("incorrect choice");
				return;
				
			}
			characters=lineOfText.toCharArray();
			charsOfSubstring=substring.toCharArray();
			int lengthOfText=characters.length;
			int lengthOfSubstring=charsOfSubstring.length;
	      
			if(isFound(lengthOfText,lengthOfSubstring,characters,charsOfSubstring))
	          System.out.println("Found substring");
	        else
			  System.out.println("Did not find substring");
			
			
		}
			

	}



