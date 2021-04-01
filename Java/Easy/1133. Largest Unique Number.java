## Solution 1 (using Hashmap)
class Solution {
    public int largestUniqueNumber(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }        
        int max = -1;
        for (int key : map.keySet()) {
          if (map.get(key) == 1) {
            max = Math.max(key, max);
          }
        }
        return max;
        
    }
}

## Solution 2 (Using Treemap (Descending))
class Solution {
    public int largestUniqueNumber(int[] A) {
            TreeMap<Integer, Integer> map = new TreeMap<>((a, b) -> b - a); // sorting in descending order
            for (int num : A) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    return key;
                }
            }
            return -1;
        }
}

## Solution 3 (Using arrays (fastest))
  
class Solution {
      public int largestUniqueNumber(int[] A) {
          int[] count = new int[1001];
          for(int i = 0; i < A.length; i++) {
               count[A[i]]++;
          }
//           for (int num : A) {
//               count[num]++;
//           }
          for (int i = 1000; i >= 0; i--) {
              if (count[i] == 1) {
                  return i;
              }
          }
          return -1;
     }
}
