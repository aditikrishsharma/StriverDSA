import java.util.Scanner;
class Solution {
        public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0 ; i < nums.length ;i++){
             if (nums[i] > nums[(i + 1) % n]){
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        boolean result = sol.check(arr);
        System.out.print(result);
    }
}
