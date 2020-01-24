/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W,
into their corresponding Celsius values and print the table.*/
import java.util.*;

class Main
{
  public static void printFahrenheitTable (int start, int end, int step)
  {
    int i, n;
    double cd;
    for (i = start; i <= end; i += step)
      {
	cd = (i - 32) / 1.8;
	int xd = (int) cd;
	  System.out.print (i + "\t" + xd + "\n");
      }
    return;
  }



  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    int start = s.nextInt ();
    int end = s.nextInt ();
    int step = s.nextInt ();
     Main.printFahrenheitTable (start, end, step);
  }

}
