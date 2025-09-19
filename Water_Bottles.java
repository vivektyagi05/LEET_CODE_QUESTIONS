
import java.util.Scanner;

public class Water_Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numBottles = sc.nextInt();
        int numExchange = sc.nextInt();
        int ans = numBottles;

        while(numBottles>=numExchange){
            int changed = numBottles/numExchange;
            int rem = numBottles%numExchange;
            ans += changed ;
            numBottles = changed + rem;
        }

        System.out.println(ans);

    }
}


/*
Example 1:

sample 1 1875

Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:

sample 2 1875

Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.
 */