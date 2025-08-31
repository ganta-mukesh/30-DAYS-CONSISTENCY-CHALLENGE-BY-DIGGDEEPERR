class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int maxind=0;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxind=i;
            }
        }
        return maxind;
    }
}