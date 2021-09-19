class Solution {
    public boolean confusingNumber(int n) {

        boolean numberIsConfusing = false;


        // A confusing number is a number that when rotated 180 degrees becomes a different number with each digit valid.

        // 0, 1, 6, 8, 9 --->
        // 0, 1, 9, 8, 6

        // and
        // 2, 3, 4, 5, 7 -->
        // invalid

        // ignore leading zeros

        // rotate n. new n is valid. n is not equal to new n. return true.
        // invalid number. return false.


        // rotateNumber()
        // isValidANumber()
        // isAConfusingNumber()
        // isNewValue()

        String num = String.valueOf(n);
        // System.out.println("num = "+num);

        // String num = String.valueOf(n);
        // String s = String.valueOf(num.charAt(i));
        // int digit = Integer.parseInt(s);

        // isValidANumber()
        for(int i = 0; i < num.length(); i++) {
            String s = String.valueOf(num.charAt(i));
            int digit = Integer.parseInt(s);
            if(digit == 2 || digit == 3 || digit == 4 || digit == 5 || digit == 7) {
                System.out.println("digit contains an invalid digit. returning false.");
                return false;
            }
        }


        // logic - use while loop and division by 10 and remainder
        //       - use hashmap of valid numbers and their rotation
        //        - https://leetcode.com/problems/confusing-number/discuss/303832/Java-Solution-using-HashMap-Similar-to-246.-Strobogrammatic-Number













        return numberIsConfusing;
    }
}
