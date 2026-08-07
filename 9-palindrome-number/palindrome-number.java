class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        int org=x;
        if(x<0) return false;
        while(x!=0){
            int lastDig=x%10;
            if (revNum > Integer.MAX_VALUE / 10) return false;
            revNum=(revNum*10)+lastDig;
            x=x/10;
        }
        return revNum==org;

    }
}