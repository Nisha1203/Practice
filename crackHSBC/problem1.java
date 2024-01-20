// Given two numbers x and y, find unit digit of xy.

// Examples : 

// Input  : x = 2, y = 1
// Output : 2
// Explanation
// 2^1 = 2 so units digit is 2.

// Input : x = 4, y = 2
// Output : 6
// Explanation
// 4^2 = 16 so units digit is 6.

import java.util.*;

class problem1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 1;

        for(int i=0;i<y;i++)
        {
            ans = ans * x;
        }

        int digit =0;
        digit = ans%10;
        System.out.print(digit);
    }
}