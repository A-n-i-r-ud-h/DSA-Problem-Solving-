class Solution {
    public boolean isPalindrome(int x) {
        int revNum=0;
        if(x<0||(x%10==0 && x!=0)){
            return false;
        }
        while(x>revNum){
            int lastDig=x%10;
            revNum=revNum*10+lastDig;
            x=x/10;
        }
        if(x==revNum||x==revNum/10){
            return true;
        }else{
            return false;
        }

    }
}