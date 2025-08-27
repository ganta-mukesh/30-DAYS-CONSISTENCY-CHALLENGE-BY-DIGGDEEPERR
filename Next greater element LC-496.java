class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] re=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int indx=-1;
            for(int k=0;k<nums2.length;k++){
                if(nums2[k]==nums1[i]){
                    indx=k;
                    break;
                }
            }
            boolean found=false;
            for(int j=indx+1;j<nums2.length;j++){
                if(nums2[j]>nums2[indx]){
                    re[i]=nums2[j];
                    found=true;
                    break;
                }
            }
            if(!found){
                re[i]=-1;
            }
        }
        return re;
    }
}