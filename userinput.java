import java.util.*;
class Solution {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        System.out.println(number);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        obj.printNumber(sc);
    }
}