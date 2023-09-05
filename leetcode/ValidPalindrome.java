package leetcode;

import java.util.Arrays;

public class ValidPalindrome {

  public static void main(String[] args) {
    String s = " ";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    if (s.length()<=0) {
        return true;
    }
    return check(s, 0);
  }
  public static boolean check(String s,int i) {
    if(i>s.length()/2){
        return true;
    }
    if(s.charAt(i) != s.charAt(s.length()-1-i)){
        return false;
    }
    
    return check(s, i+1);
  }
  
}
