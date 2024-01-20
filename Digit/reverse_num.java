import java.util.*;

class reverse_num
{
    public static void main(String Arg[])
    {
        int Ans=0,iDigit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            Ans = Ans*10 + iDigit;
            iNo = iNo/10;
        }
        System.out.println(Ans);

        sc.close();
    }
}