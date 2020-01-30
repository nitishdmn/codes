//Given the code to find out and return the number of digits present in a number 
import java.util.*;
public class NumberDigit {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));
	}
	static int a=0;
	public static int count(int n){
        if(n>0)
        {
            a++;
            count(n/10);
            return a;
        }
        return a;

}
}
