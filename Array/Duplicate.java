//Given an integer array nums, return true if any value appears at least twice in the array, 
//and return false if every element is distinct.

import java.util.*;

class ArrayX
{
    public boolean Duplicate(int Arr[])
    {
        for(int i = 0; i<Arr.length;i++)
        {
            for(int j=i+1;j<Arr.length;j++)
            {
                if(Arr[i] == Arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
class Duplicate
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
        bRet = obj.Duplicate(Arr);

        if(bRet == true)
        {
            System.out.println("Contains Duplicate");
        }
        else
        {
            System.out.println("Does not Contains Duplicate");
        }
    }
}

//Time complexity: O(n^2)


// ------------------------------------------------------------------
// Approch 2 : sorting in asending order than comparing if the neighbour has same value

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         for(int i=1;i<n;i++)
//         {
//             if(nums[i] == nums[i-1])
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

//Time complexity: O(n log n), where n is the length of the array
//-------------------------------------------------------------------