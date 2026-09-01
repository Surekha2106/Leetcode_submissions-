class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int[] merge=new int[a+b];
        for(int i=0;i<a;i++){
            merge[i]=nums1[i];
        }
        for(int j=0;j<b;j++){
            merge[a+j]=nums2[j];
        }
        Arrays.sort(merge);

        int n=merge.length;
        if(n%2==1){
            return merge[n/2];
        }
        else{
            return(merge[n/2-1]+merge[n/2])/2.0;
        }
    }
}