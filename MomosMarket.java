import java.util.*;
//Shreya loves to eat momos. Her mother gives her money to buy vegetables but she manages to save some money out of it daily. After buying vegetables, she goes to "Momos Market", where there are ‘n’ number of shops of momos. Each of the shops of momos has a rate per momo. She visits the market and starts buying momos (one from each shop) starting from the first shop. She will visit the market for ‘q’ days. You have to tell that how many momos she can buy each day if she starts buying from the ////first shop daily. She cannot use the remaining money of one day on some other day. But she will save them for other expenses in the future, so, you also need to tell the sum of money left with her at the end of each day.
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int shops = in.nextInt();
        int[] price = new int[shops];
        for(int i=0;i<shops;i++)
        {
            price[i] = in.nextInt();
        }
        int days = in.nextInt();
        int[] savings = new int[days];
        for(int i=0;i<days;i++)
        {
            savings[i] = in.nextInt();
        }
        for(int i=0;i<days;i++)
        {
            int sum = savings[i];
            int count = 0;
            int save= 0;
            for(int j=0;j<shops;j++)
            {
                if(sum>=price[j])
                {
                    count++;
                    sum = sum-price[j];
                }
                else{
                    break;
                }
            }
            System.out.println(count+" "+sum);
        }

	}
}
