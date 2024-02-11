package largest_substring;


import java.util.HashSet;

class Solution {
    int max = 0;
    String string;
    public Solution(String string) {
        this.string = string;
    }
    boolean hasRepeated(char[] array) {
            HashSet<Character> set = new HashSet<>();
            for (char i : array) {
                if (set.contains(i)) {
                    return true;
                } else {
                    set.add(i);
                }
            
            }
            return false;
        }
    char[] splitString;
    public int lengthOfLongestSubstring() {
        String s = this.string;
        int length = s.length();
        int size = length;
        int count = 0;
        
        while (size > 0) {
            while (count+size<=length) {
                String cut = s.substring(count, count + size);
                splitString = cut.toCharArray();
                if (!hasRepeated(splitString)) 
                {
                    return size;
                }
                count++;
            }
            count = 0;
            size--;
        }
        return 0;
    }
    
}