import java.util.*;

class Perfect
{
    public static void main(String Arg[])
    {
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int iNo = sc.nextInt();

        for(int i=1; i<iNo; i++)
        {
            if((iNo % i) == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == iNo)
        {
            System.out.println("It is a perfect number : ");
        }
        else
        {
            System.out.println("It is not a perfect number ");
        }

        sc.close();
    }
}