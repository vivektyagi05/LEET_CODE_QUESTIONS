import java.util.HashSet;
import java.util.Scanner;

public class happy {
    public static void main(String[] args) {
        HashSet<Integer> seen = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);

            int sum =0;
            while(n!=0){
                int mod = n%10;
                sum += (mod*mod);
                n /=10;
            }
            n = sum;
        }
        System.out.println(n==1);
    }
}
