package leetcode;

public class Q169 {
    public static void main(String[] args) {
        int[] a = { 2,2,1,1,1,2,2,2 };
        System.out.println(new Q169().majorityElement(a));    
    }

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = nums[0] ;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                el = nums[i];
            }
            if(nums[i] == el){
                count++;
            }else{
                count--;
            }
            
        }
        return el;
    }
    
}
