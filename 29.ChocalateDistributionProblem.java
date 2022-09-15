
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        Long mindiff= Long.MAX_VALUE;
        for(int i=0; i+m-1<n;i++){
            mindiff=Math.min(mindiff, (a.get(i+(int)m-1)-a.get(i)));
        }
        return mindiff;
    }
}
