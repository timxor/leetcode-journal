// url
// game logic
//
//  n = stones on the heap
//  can only remove between 1-3 stones per turn
//  last person to remove all the stones wins
//  so if there are 1,2,3,5,6,7,9 or divisibility of those, then you win
//  else for 4,8 you loose
//



public class Solution
{
    public static void main(String[] args)
    {
        boolean test = canWinNim(100);
        System.out.println(test);
    }


    public static boolean canWinNim(int n)
    {
        boolean canWin = false;

        if ( n % 1 == 0 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 6 == 0 || n % 7 == 0)
        {
            canWin = true;
        }
        else if ( n % 4 == 0 || n % 8 == 0)
        {
            canWin = false;
        }

        return canWin;
    }
}