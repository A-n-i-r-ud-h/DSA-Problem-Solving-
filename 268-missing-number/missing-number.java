class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor1=0, xor2=0;
        //xor arr elements
        for(int i=0;i<n;i++){
            xor2 ^=nums[i];
        }
        //1 to n
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        return xor1^xor2;
    }
}