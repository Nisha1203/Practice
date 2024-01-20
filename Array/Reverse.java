import java.util.*;

class ArrayX
{
    public void Reverse(int Arr[])
    {
        int start = 0;
        int end = iSize - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            // Move towards the center of the array
            start++;
            end--;
        }
        cout<<"Elements of the array after reversing : ";
    }
}
class Reverse
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
        obj.Reverse(Arr);

        System.out.println("Enter elements of the array : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }
    }
}