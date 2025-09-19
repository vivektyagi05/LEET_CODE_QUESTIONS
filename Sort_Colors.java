
import java.util.Scanner;

class Sort_Colors{
    public static  void swap(int[] nums , int i , int j ){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int low = 0 ;
        int mid = 0 ;
        int high = nums.length-1 ;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if (nums[mid]==1){
                mid++;
            }else{
                swap(nums,high,mid);
                high--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}


/*
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */