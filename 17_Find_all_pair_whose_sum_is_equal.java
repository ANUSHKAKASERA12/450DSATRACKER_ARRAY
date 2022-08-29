Time Complexity-->O(n)
Space Complexity--> O(n)
class Solution {
    int getPairsCount(int[] arr, int n, int k) {
     HashMap  <Integer, Integer> hm = new HashMap<>();
     for(int i=0;i<n ;i++){
         if(!hm.containsKey(arr[i])){
             hm.put(arr[i], 1);
         }
         else{
             hm.put(arr[i], hm.get(arr[i])+1);
         }
     }
     int count=0;
     for(int i=0; i<n; i++){
         if(hm.containsKey(k-arr[i])){
             count=count+hm.get(k-arr[i]);
             //hm.put(arr[i], hm.get(arr[i])-1);
             if(k-arr[i]==arr[i]){
                 count--;
             }
         }
     }
     
     return count/2;
     
        // code here
    } 
}
