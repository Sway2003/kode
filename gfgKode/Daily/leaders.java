class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
         ArrayList<Integer> arr1 = new ArrayList<Integer>(n);
        arr1.add(arr[arr.length-1]);
        int k=0;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr1.get(k)<=arr[i])
            {
                arr1.add(arr[i]);
                k++;
            }
        }
         Collections.reverse(arr1);  
         return arr1;
    
    }
    
}
