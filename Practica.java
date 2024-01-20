//Given an integer array nums, return true if any value appears at least twice in the array, 
//and return false if every element is distinct.

import java.util.*;

class ArrayX
{
    public void Duplicate(int Arr[])
    {
        int iSize = Arr.length;
        int temp[] = new int[iSize];

        for(int i = 0; i<Arr.length;i++)
        {
            for(int j=i+1;j<Arr.length;j++)
            {
                if(Arr[i] = Arr[j])
                {
                   temp[j++] = a[i];
                }
            }
        }

        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
    }
}

class Practica
{
    public static void main(String Arg[])
    {
        boolean bRet = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int iSize = sc.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements of the array : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt]=sc.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(int iCnt = 0;iCnt<iSize;iCnt++)
        {
            System.out.print(Arr[iCnt]+" ");
        }
        System.out.println();

        ArrayX obj = new ArrayX();
        obj.Duplicate(Arr);
    }
}

//Time complexity: O(n^2)