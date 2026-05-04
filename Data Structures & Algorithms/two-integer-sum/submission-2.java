class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int k = 0; k < nums.length; k++){
            for(int i = 0; i < nums.length; i++){
            int left = target - nums[k];
            if(nums[i] == left && i != k){
                result[0] = k;
                result[1] = i;
                return result;
            }
        }
           

        }
        return result;

    }
}
