//path -> crete extra method to reverse array , call method for mininmum value of k or n

class Solution {
    
    void revArr(ArrayList<Integer> arr,int start , int end){
        while(end>=start){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp); // Using 2 pointers for swapping
            end--;
            start++;
        }
    }
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i = 0; i<n; i=i+k){
            int start = i; //Getting the start index of k`th element
            int end=Math.min(n-1, i+k-1); //Getting the last index of k`th element 
            revArr(arr, start , end);
        }
    }
}
