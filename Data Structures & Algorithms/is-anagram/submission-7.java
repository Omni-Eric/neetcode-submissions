class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int num: count){
            if(num != 0){
                return false;
            }
        }
        return true;

        // Set<Character> seen = new HashSet<Character>();
        // for(int i = 0; i < s.length(); i++){
        //     seen.add(s.charAt(i));
        // }
        // for(int j = 0; j < t.length(); j++){
        //     if(seen.add(t.charAt(j))){
        //         return false;
        //     }
        // }
        // return true;

    }
}
