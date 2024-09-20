class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length - 1;
        int i = 0, j = n;
        while (i <= j) {
            if (!Character.isLetterOrDigit(str[i])) {
                i++;
            } else if (!Character.isLetterOrDigit(str[j])) {
                j--;
            } else {
                if (Character.toLowerCase(str[i]) != Character.toLowerCase(str[j])) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
