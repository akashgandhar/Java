package leetcode;


public class ReverseInteger {
    public static void main(String[] args) {
        int n = -123;
        int r = reverse(n);
        System.out.println(r);
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
