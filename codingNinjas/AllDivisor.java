package codingNinjas;

import java.util.Scanner;

public class AllDivisor {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int res = allDivisor(n);
        System.out.println(res);
    }

    public static int allDivisor(int x){
        int result = 0;
        if(x<=0){
            return 0;
        }
        else{
            for (int i = 1; i <= x; i++) {
                if(x%i == 0){
                    result +=i;
                }
            }
            return result+allDivisor(x-1);
        }


    }
}
