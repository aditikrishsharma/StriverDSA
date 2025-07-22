import java.util.*;
class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(nums[j+1]<nums[j]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }



     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result[] = obj.bubbleSort(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(result[i] + " ");

        }
    }
}
