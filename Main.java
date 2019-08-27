import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
      // to calculate the words in a string
    int c = 1;
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine ();
    for (int i = 0; i < str.length (); i++)
      {
	char currentChar = str.charAt (i);
	if (currentChar == ' ')
	  {
	    c = c + 1;
	  }

	else
	  {
	    continue;
	  }

      }
    System.out.println (c);

  }
}
