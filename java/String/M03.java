
import java.util.HashSet;
import java.util.Set;



class M03{

    public M03(){}
    

    public int lengthOfLongestSubstring(String s){
        int left = 0;
        int right = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();
       
        while(right != charArray.length) {
            char rightc = charArray[right];
            if(!set.contains(rightc)){
               
                set.add(rightc);
                right++;
                result = Math.max(result,right - left);
            }else{
                set.remove(charArray[left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        M03 test = new M03();
        test.lengthOfLongestSubstring("pwwkew");
        System.out.println(test.lengthOfLongestSubstring("pwwkew"));
    }
}
    