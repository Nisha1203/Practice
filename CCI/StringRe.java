//Enter String : 
//Nisha is best
//The modified String is : Nisha%20is%20best


import java.util.*;

class StringRe
{
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String input = sobj.nextLine();

        String str = "";

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i) == ' ')
            {
                str = str + "%20";
            }
            else
            {
                str = str + input.charAt(i);
            }
        }

        System.out.println("The modified String is : " + str);
    }
}