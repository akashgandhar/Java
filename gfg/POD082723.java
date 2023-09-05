package gfg;

import java.util.Arrays;

/**
 * POD082723
 */
public class POD082723 {

  public static void main(String[] args) {
    String str = "xyxapesj047519742156243264036";
    String s = "0";
    for (int i = 0; i < str.length(); i++) {
      try {
        int a = Integer.parseInt(Character.toString(str.charAt(i)));
        s = s + String.valueOf(a);
      } catch (NumberFormatException e) {

      }
    }
    int res = Integer.parseInt(s);
    System.out.println((Integer)res == (str.length()-(s.length()-1)));
  }
  //   public static String reverseWord(String str) {
  //     // Reverse the string str
  //     // for (int i = 0; i < str.length(); i++) {
  //     //     String temp = Character.toString(str.charAt(i));

  //     // }
  //   }
}
