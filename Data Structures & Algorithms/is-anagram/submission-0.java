class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] arr = t.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            boolean found = false;

            for(int j = 0; j < arr.length; j++) {
                if(s.charAt(i) == arr[j]) {
                    arr[j] = '#';
                    found = true;
                    break;
                }
            }

            if(!found)
                return false;
        }

        return true;
    }
}
