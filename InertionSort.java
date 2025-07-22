import java.util.*;

class Solution {
    public int[] insertionSort(int[] nums) {
        int n  = nums.length;
        for(int i = 1 ; i < n ; i++){
            int j = i ; 
            while(j > 0 && nums[j]>nums[j-1]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
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
        int result[] = obj.insertionSort(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(result[i] + " ");

        }
    }
}
