import java.util.*;

class Solution {
    public int[] selectionSort(int[] nums) {
        int n  = nums.length;
        for(int i = 0 ; i <= n - 2 ; i++){
            int min = i ; 
            for(int j = i+1 ; j < n ; j++){
                if(nums[j] < nums[min]){
                    min = j ;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
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
        int result[] = obj.selectionSort(arr);
        for(int i = 0 ; i < n ; i++){
            System.out.print(result[i] + " ");

        }
    }
}
