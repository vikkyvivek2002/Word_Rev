import java.util.*;
public class Word_Rev
 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a String :");
String a = s.nextLine();
 
     String word[] = a.split("\\s");
     String rev = "";
     
     for(int i = 0; i<word.length; i++)
     {
    	 if(i== word.length)
    		 rev = word[i] + rev;
    	 else
    		 rev = " " + word[i] + rev;
     }
     System.out.println(rev);
	}

}
