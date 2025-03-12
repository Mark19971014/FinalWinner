
import java.util.HashMap;
import java.util.Map;

class E01 {

    public E01(){}

     public int[] twoSum(int[] nums, int target){
       
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i}; 
            }

            else{
                map.put(nums[i], i);
            }
       }
        return new int[]{};
    }
    
    public static void main(String[] args) {
        E01 test = new E01();
        int[] nums = {3,2,4};
        test.twoSum(nums, 6);       
    }
}