/*Given an array of length N, swap every pair of alternate elements in the array.*/
import java.util.Scanner;


public class Main
{

  static Scanner s = new Scanner (System.in);
  public static int[] takeInput ()
  {

    int size = s.nextInt ();
    int[] input = new int[size];
    for (int i = 0; i < size; i++)
      {
	input[i] = s.nextInt ();
      }
    return input;
  }

  public static void main (String[]args)
  {

    int[] input = takeInput ();
    Main.swapAlternate (input);
    for (int i = 0; i < input.length; i++)
      {
	System.out.print (input[i] + " ");
      }

  }
  public static void swapAlternate (int[]input)
  {


    int i = 0;
    int t = 0;
    while (i < input.length - 1)
      {
	t = input[i];
	input[i] = input[i + 1];
	input[i + 1] = t;
	i = i + 2;
      }
  }

}
