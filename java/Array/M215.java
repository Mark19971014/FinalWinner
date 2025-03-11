
import java.util.PriorityQueue;

class M215{
    public M215(){}
    
    public int findKthLargest(int[] nums, int k){
       PriorityQueue<Integer> heap = new PriorityQueue<>();
       for (int i = 0; i < k; i++) {
           heap.add(nums[i]);
       }
       for(int i = k; i < nums.length;i++){
            if(nums[i] >= heap.peek()){
                heap.poll();
                heap.add(nums[i]);
            }
       } 
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        M215 test = new M215();
       test.findKthLargest(nums, k);
    }
}