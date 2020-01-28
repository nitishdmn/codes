
import java.util.Scanner;
/*Print the following pattern
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
 */

public class NumberPattern {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = s.nextInt();
		printPattern(n);
		
	}
public static void printPattern(int n){
			
        int i,a,j;
        for(i = -(n-1); i < n; i++){
            a = n;
            for(j = -(n-1); j < n; j++){
                if(Math.abs(i) < Math.abs(j)){
                    if(j < 0){
                        System.out.print(a+" ");
                        a--;
                    }
                    else{
                        a++;
                        System.out.print(a+" ");
                    }
                }
                else{
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
	}
}
