public class Solution {
    public static int findUnique(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            
            // Check for uniqueness in elements before and after the current element
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                n = arr[i];
                break;
            }
        }
        return n;
    }
}
