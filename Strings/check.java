//Count the number of small and capital characters

import java.util.*;

class count
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = sc.nextLine();
        System.out.println("Enter the word : ");
        String word = sc.nextLine();

        char Arr[] = word.toCharArray();

        int length = Arr.length;

        int icount=0,jcount=0;

        for(int i=0;i<length;i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                icount++;
            }
            else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                jcount++;
            }
        }
        System.out.println("The number of small letters in the string is : "+icount);
        System.out.println("The number of capital letters in the string is : "+jcount);
    }
}
