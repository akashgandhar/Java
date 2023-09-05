package leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        int n =-121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = reverse(x);
        if(x == rev){
            return true;
        }
        return false;
    }

    public static int reverse(int x) {
        long result = 0;
        int sign = 1;
        if(x<0){
            sign = -1;
            x = x*sign;
        }
        while(x>0){
            result = result*10+(x%10);
            x=x/10;
        }
        if(result > Integer.MAX_VALUE){
            return 0;   
        }
        return (int)result*sign;
        
    }

}
