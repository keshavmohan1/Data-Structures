public class Solution {

    public static boolean checkMaxHeap(int A[]) {

        for (int i = 0; i <= (A.length - 2) / 2; i++) {
            if (A[i] < A[2 * i + 1] || ((2 * i + 2 != A.length)
                                        && A[i] < A[2 * i + 2])) {
                return false;
            }
        }
 
        return true;
    }
}
