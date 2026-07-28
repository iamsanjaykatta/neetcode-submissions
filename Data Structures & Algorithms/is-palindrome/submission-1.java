class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)){
                clean.append(Character.toLowerCase(ch));
            }
        }

        String original = clean.toString();

        int left = 0;
        int right = original.length() - 1;

        while(left < right) {
            if(original.charAt(left) != original.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
