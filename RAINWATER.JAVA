import java.util.Scanner;
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
public class Main {


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }


        int max=Integer.MIN_VALUE;
        int max_pos=-1;

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
                max_pos=i;
            }
        }

        int wc=0;
        int curr=arr[0];
        for(int i=0; i<max_pos; i++){
            if(arr[i]>curr){
                curr=arr[i];
            }else{
                wc=wc+curr-arr[i];
            }
        }

        int dusracurr=arr[arr.length-1];
        for(int i=arr.length-1; i>max_pos; i--){
            if(arr[i]>dusracurr){
                dusracurr=arr[i];
            }else{
                wc=wc+dusracurr-arr[i];
            }

        }

        System.out.println(wc);


	}

}
