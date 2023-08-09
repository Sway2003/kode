//isogram - no repeating character
//path -> use set ds to store string as no duplicates allowed ->check using toCharArray() and contains()



class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
         Set<Character> set = new HashSet<>();
      for(char c : data.toCharArray()){
          if(set.contains(c)){
              return false;
          }else{
              set.add(c);
          }
      }
        return true;
    }
}
