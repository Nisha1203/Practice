//Check if the string Consecutive

import java.util.*;

class StringX
{
    public String Consecutive(String Arr)
    {
        String str = "";

        for(int i=0;i<Arr.length();i++)
        {
            while(i<Arr.length() - 1 && Arr.charAt(i) == Arr.charAt(i+1))
            {
                i++;
            }
            str += Arr.charAt(i);
        }
        return str;
    }
}

class RmvConsecutive
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        String sret = obj.Consecutive(name);

        System.out.println("The modified String is : "+sret);

    }
}

//code for c++

// class Solution{
//     public:
//     string removeConsecutiveCharacter(string S)
//     {
//         // code here.
//         string str="";
//         str+=S[0];
//         for(int i=1;i<=S.length();i++){
//             if(S[i]!=S[i-1]){
//                 str+=S[i];
//             }
             
//         }
//         return str;
//     }
// };