class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        Map <Integer,Integer> map = new HashMap<>();
        for(int i : a){
            int c = map.getOrDefault(i,0)+1;
            map.put(i, c);
            if(map.get(i)==k) return i;
        }
        return -1;
}
}
