import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i<nums.length;i++){
            for(int j  = i+1; j<nums.length; j++){
                int key = nums[i] + nums[j];
                if(key == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
public class two{
    public static void main(String[] args){
        System.out.println("enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Input : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();

        Solution  sol = new Solution();
        int[] result = sol.twoSum(arr, target);

        if(result.length == 2){
            System.out.println(result[0] + "," + result[1]);
        }else{
            System.out.println("no solution found");
        }
        sc.close();

    }
}