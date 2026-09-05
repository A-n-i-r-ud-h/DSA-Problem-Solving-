import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1 &&j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]){
                j++;
            }else{
                if(list.size()==0 ||list.get(list.size()-1)!=nums1[i]){
                list.add(nums1[i]);
            }
                i++;
                j++;
            
            }
        }
        int[]result=new int[list.size()];
        for(int k=0;k<list.size();k++){
            result[k]=list.get(k);
        }
        return result;

        
    }    
        
    
}