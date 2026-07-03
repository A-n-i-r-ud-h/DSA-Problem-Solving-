class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
       for(int i =0;i<nums.length;i++){
        int digit =0;
        int n = nums[i];
        if(n==0){
        digit=1;
        }
        else{
        while(n>0){
            n = n/10;
            digit++;
        }
        } if(digit%2==0)
            count +=1;  

       }
       return count;
    }
}