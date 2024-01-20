import java.util.*;

class ArrayX
{
    public int Maximum(int Arr[])
    {
        int iMax = Arr[0];

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }
        return iMax;
    }

    public int Minimum(int Arr[])
    {
        int iMin = Arr[0];

        for(int iCnt=0;iCnt<Arr.length;iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;
    }
}
class MinMax
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int iSize = sc.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements of the array : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        System.out.println("Enter elements of the array : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            System.out.print(Arr[iCnt]+" ");
        }
        System.out.println();

        ArrayX obj = new ArrayX();
        int iRet1 =  obj.Maximum(Arr);
        int iRet2 =  obj.Minimum(Arr);

        System.out.println("The maximum element is : "+iRet1);
        System.out.println("The maximum element is : "+iRet2);
    }
}
