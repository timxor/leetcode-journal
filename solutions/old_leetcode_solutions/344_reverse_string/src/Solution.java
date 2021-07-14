/**
 * Created by tim on 8/25/16.
 */
public class Solution {
    public static void main(String[] args)
    {
        String reverse = reverseString("meow meow meow");
        System.out.println(reverse);
    }

    public static String reverseString(String s)
    {
        StringBuilder backwards;
        backwards = new StringBuilder();

        for (int i = s.length()-1; i > -1; i--)
        {
            backwards.append(s.charAt(i));
            //System.out.println(backwards);
        }

        return backwards.toString();

    }
}
