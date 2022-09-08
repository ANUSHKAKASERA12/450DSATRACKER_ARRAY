class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
         //Here we are calculating the lenght of both the array 
           
            if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2, nums1);
            }
         int len1=nums1.length;
            int len2= nums2.length;
        //We are defining a low , high and a condition 
            int l=0;
            int h=len1;
            while(l<=h){
         //condition for binary search 
                int cut1=l+(h-l)/2;
         //We are giving the first cut 
               // int cut1=mid/2;
        //On the basis of the cut1 we are getting cut2 
                int cut2=((len1+len2)/2)-cut1;
        // finding l1, l2 , r1, r2 
                int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
                int l2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
                int r1=(cut1==len1)?Integer.MAX_VALUE:nums1[cut1];
                int r2=(cut2==len2)?Integer.MAX_VALUE:nums2[cut2];
                if(l1>r2){
                    h=cut1-1;
                }
                else if(l2>r1){
                    l=cut1+1;
                }
                else{
                    return ((len1+len2)%2==0)?
                        (double)((Math.max(l1,l2)+Math.min(r1,r2)))/2:
                    (double)(Math.min(r1,r2));
                }

            }
            return 0.0;
        }
   

    }
