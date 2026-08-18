class Solution {
    public int singleNumber(int[] nums) {
        int answer =0;
        for(int i = 0; i< nums.length; i++){
            
            // XOR current number with answer
            answer = answer ^ nums[i];
        }
        return answer;
        
    }
}