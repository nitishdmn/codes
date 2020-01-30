import java.util.*;
public class IndexNumber {
/*
 * Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
 */
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
	}
    



public static int lastIndex(int input[], int x) {

   //System.out.println(input.length);
  /* 
   *  for(i=input.length-1;i>=0;i--)
    { 
     //   System.out.println(input[i]);
        if(input[i]==x)
            return i;
    }
    return -1;*/
               return firstIndex1(input,x,input.length-1);
}
public static int firstIndex1(int input[], int x,int start)
{ ///System.out.println(start);
     if(start==-1)
          return -1;
    if(input[start]==x)
    { 
      //  System.out.println("*");
        return start;
    }
    
    int a= firstIndex1(input,x,start-1);
       return a;
}
}

