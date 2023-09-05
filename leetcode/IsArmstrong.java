package leetcode;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x){
        int length = (int)Math.log10(x)+1;
        int result = 0;
        int dup = x;
        while(x>0){
            result += Math.pow((x%10),length);
        }
        if(result == dup){
            return true;
        }

        return false;
    }

}
