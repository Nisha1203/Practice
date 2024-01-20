//Check if the string Pallindrome

import java.util.*;

class StringX
{
    public boolean Pallindrome(String str)
    {
        char Arr[] = str.toCharArray();

        int iStart = 0;
        int iEnd = Arr.length-1;

        char cTemp = ' ';

        while(iStart < iEnd)
        {
            if(Character.toLowerCase(Arr[iStart]) != Character.toLowerCase(Arr[iEnd]))
            {
                return false;
            }

            iStart++;
            iEnd--;
        }
        return true;
    }
}

class Pallindrome
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        boolean sret = obj.Pallindrome(name);

        if(sret == true)
        {
            System.out.println("String is Pallindrome");
        }
        else
        {
            System.out.println("String is not Pallindrome");
        }
    }
}