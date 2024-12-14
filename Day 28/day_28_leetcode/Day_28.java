/*

https://leetcode.com/problems/sign-of-the-product-of-an-array/description/

You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

--------------------------------------- CODE -------------------------------------------------------

class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negativeCount++;
            }
        }

        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}

*/