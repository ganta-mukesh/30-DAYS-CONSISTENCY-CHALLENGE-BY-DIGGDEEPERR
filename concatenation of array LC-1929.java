class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int s[]=new int[2*n];
        for(int i=0;i<n;i++){
            s[i]=nums[i];
            s[i+n]=nums[i];;
        }
        return s;
    }
}