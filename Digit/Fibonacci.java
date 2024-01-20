import java.util.*;

// 0, 1, 1, 2, 3, 5, 8, 13, 21 

class Fibonacci
{
    public static void main(String Arg[])
    {
        int t1=0,t2=1,fibo=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo = sc.nextInt();

        for(int i=1;i<=iNo;i++)
        {
            System.out.print(t1 + " ,");//0 , 1
            fibo = t1+t2; //0+1=1, 2
            t1 = t2;//t1=1 , t1= 1
            t2 = fibo;//t2=1, t2=2
        }

        sc.close();
    }
}