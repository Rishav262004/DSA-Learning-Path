/*

https://leetcode.com/problems/palindrome-number/

Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        int o =x;
        if(x>=0){
            int sum=0;
            while(x>0)
            {
            int rem = x%10;
               sum = sum * 10 + rem;
            x/=10;

        }
        if(sum==o){
            return true;
        }
        else{
            return false;
        }
    }else{
        return false;
    }
}

}


*/