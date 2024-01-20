//Enter String : 
//aaaabbbbbcc
//The modified String is : a4b5c2


import java.util.*;

class StringX {
    public String modify(String Arr) {
        String str = "";

        for (int i = 0; i < Arr.length(); i++) {
            int count = 1;

            // Check if i is within bounds before entering the loop
            while (i < Arr.length() - 1 && Arr.charAt(i) == Arr.charAt(i + 1)) {
                count++;
                i++;
            }
            str = str + Arr.charAt(i) + count;
        }
        return str;
    }
}

class Stringaa2 {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        String sret = obj.modify(name);

        System.out.println("The modified String is : " + sret);
    }
}