/**
 * Created by tim on 8/25/16.
 */
public class Solution
{
    public static void main(String[] args)
    {
        int result = canWinNim(10, 22);
        System.out.println(result);
    }


    public static int canWinNim(int a, int b)
    {

        while (b != 0)
        {
            int carry = (a & b) ;

            a = a ^ b;

            b = carry << 1;
        }

        return a;

    }

    public static int recursive_canWinNim(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return recursive_canWinNim(sum, carry);
    }
}
