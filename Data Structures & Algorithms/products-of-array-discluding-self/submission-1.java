class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        for(int k = 0; k < nums.length; k++){
            product[k] = 1;
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }
                product[i] *= nums[j];
            }
        }
        return product;
        
    }
}  
