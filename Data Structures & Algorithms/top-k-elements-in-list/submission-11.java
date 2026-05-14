class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tm = new HashMap<>(); // create HashMap
        
        // store values and their frequency
        for(int n : nums){
            tm.put(n, tm.getOrDefault(n,0) + 1);
        } 

        // sort numbers based on frequency in decreasing orders
        List<Integer> temp = new ArrayList<>(tm.keySet());
        temp.sort((a,b) -> Integer.compare(tm.get(b), tm.get(a))); 

        int[] result = new int[k];

        // put k most frequent numbers in the int array
        for(int i = 0; i < k; i++){
            result[i] = temp.get(i);
        }

        return result;

    }
}
