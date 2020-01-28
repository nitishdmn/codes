package qwer;
import java.util.*;
public class ArrowPattern {
	/*Print the following pattern for the given number of rows.
*
 * *
   * * *
     * * * *
   * * *
 * *
*
	 */


	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if(i <= n/2 + 1){
                for(int j = 1; j < i; j++)
                    System.out.print(" ");
                for(int j = 1; j <= i; j++)
                    System.out.print("* ");
            }
            else{
                for(int j = i; j < n; j++)
                    System.out.print(" ");
                for(int j = i; j <= n; j++)
                    System.out.print("* ");
            }
            System.out.println();
            
        }
	}

}
