## Solution 1

class Solution:
    def largestUniqueNumber(self, A: List[int]) -> int:
        count = {}
        for elem in A:
            count[elem] = count[elem]+1 if elem in count else 1
        largest = -1
        for k,v in count.items():
            if k > largest and v == 1:
                largest = k
        
        return largest

      
## Solution 2

class Solution:
    def largestUniqueNumber(self, A: List[int]) -> int:
        count = {}
        for a in A:
            count[a] = count[a]+1 if a in count else 1
             
        return max((k for k,v in count.items() if v == 1), default=-1)
 

## Solution 3

from collections import Counter

class Solution:
    def largestUniqueNumber(self, A: List[int]) -> int:
        counter = Counter(A)
        return max([num for num in counter if counter[num] == 1], default=-1 )
        
