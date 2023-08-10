//path -> use hashset to store elements of both arrays and return the size 
// NOTE ;- hashset doesnt allow repeated elements




class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet <Integer> hs = new HashSet<>();
         for(int i =0 ; i<n;i++){
           hs.add(a[i]);
       }
       for(int i =0;i<m;i++){
           hs.add(b[i]);
       }
       
       return hs.size();
    }
}
