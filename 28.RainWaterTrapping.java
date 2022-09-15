
//summation(Math.min(Maximim[left],Maximum[right])-arr[i])


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        long total=0;
        int waterStored=0;
        int maxl=arr[0];
        int maxr=arr[n-1];
        int left[]= new int[n];
        int right[]= new int[n];
        for(int i=0; i<n ; i++){
            if(maxl>arr[i]){
                left[i]=maxl;
            }
            else{
                left[i]=arr[i];
                maxl=arr[i];
            }}
            for(int i=n-1; i>=0 ; i--){
            if(maxr>arr[i]){
                right[i]=maxr;
            }else{
                right[i]=arr[i];
                maxr=arr[i];
            }}
            for(int i=0; i<n; i++){
                waterStored=Math.min(left[i],right[i])-arr[i];
                total=total+waterStored;
            }
            return total ;
        }

}


