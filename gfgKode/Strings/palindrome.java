-> if for any case right index conten not equal to left index content return false


class Solution {
    int isPalindrome(String S) {
        // code here
        int n = S.length();
       for(int i = 0 ; i<n ; i++){
           if(S.charAt(i)!=S.charAt(n-i-1)){
               return 0;
           }
       }
       return 1;
    }
};
