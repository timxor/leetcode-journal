__________________________________________________________________________________________________
class Solution {
    public int numberOfDays(int Y, int M) {
    if (Y % 400 == 0 || (Y % 100 != 0 && Y % 4 == 0)) {
        if (M == 2) return 29;
    }
    int[] mon = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    return mon[M - 1];
 }
}
__________________________________________________________________________________________________

__________________________________________________________________________________________________