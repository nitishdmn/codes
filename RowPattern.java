
/*
 Print the following pattern for the given number of rows.
Pattern for N = 5
 1    2   3    4   5
 11   12  13   14  15
 21   22  23   24  25
 16   17  18   19  20
 6    7    8   9   10
 */

public class RowPattern {
	
		
		static Scanner s = new Scanner(System.in);
		
		public static void main(String[] args) {
			int n = s.nextInt();
			printPattern(n);

		}



	/* Input
	 * n - number of rows */
	public static void printPattern(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = start; j < start + n; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
            if(i == (n+1)/2){
                if(n % 2 != 0)
                    start = n*(n-2) + 1;
                else
                    start = n*(n-1) + 1;
            }
            else if( i > (n+1)/2)
                start = start - 2*n;
            else
                start = start + 2*n;
        }

	}
	
}


