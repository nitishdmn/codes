/*Given a number N, figure out if it is a member of
fibonacci series or not. Return true if 
the number is member of fibonacci series else false.*/
import java.util.*;
public class Main
{

  public static boolean checkMember (int n)
  {

    int num = 0;
    int num2 = 1;
    int fibonacci = 0;
    for (int loop = 0; loop <= n; loop++)
      {
	fibonacci = num + num2;
	num = num2;
	if (num == n)
	  {
	    return true;
	  }
	num2 = fibonacci;
      }
    return false;



  }


  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    System.out.println (Main.checkMember (n));


  }


}
