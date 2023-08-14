#User function Template for python3

class Solution:
    def singleNumber(self, nums):
        # Code here
        s= set();
        for i in nums :
            if i in s :
                s.remove(i)
            else:
                s.add(i)

        return sorted(list(s))
