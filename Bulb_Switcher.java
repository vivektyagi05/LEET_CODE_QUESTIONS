import java.util.Scanner;
public class Bulb_Switcher {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int count_pro = 0;
    int i = 1;

    while(num>=i*i){
        count_pro++;
        i++;
    }
    System.out.print(count_pro);
        
    }
    
}


/*

Input: n = 3
Output: 1
Explanation: At first, the three bulbs are [off, off, off].
After the first round, the three bulbs are [on, on, on].
After the second round, the three bulbs are [on, off, on].
After the third round, the three bulbs are [on, off, off]. 
So you should return 1 because there is only one bulb is on.
Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 1 

*/