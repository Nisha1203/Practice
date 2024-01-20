#include<stdio.h>
#include<stdlib.h>

int Min(int Arr[], int iLength)
{
    int iCnt = 0;
    int iMin = Arr[0];

    for(int iCnt=0;iCnt<iLength;iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    }
    return iMin;
}

int Max(int Arr[],int iLength)
{
    int iMax = Arr[0];

    for(int iCnt=0;iCnt<iLength;iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }
    return iMax;
}

int main()
{
    int iSize =0;
    int *ptr = NULL;
    int iCnt=0 , iRet=0, iRet1=0;

    // Step1 : Accept the number of elements from user
    printf("Enter the number of elements : \n");
    scanf("%d",&iSize);

    // Step2 : Allocate memory dynamically
    ptr = (int *)malloc(iSize * sizeof(int));
          //it define    //input     //size of int is 4 byte
          //our memory
          //in parts

          //eg if input is 4 than 4 blocks of memory will be allocated 

    printf("Enter the elements : \n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    printf("Elements of array are : \n");
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d \t",ptr[iCnt]);
    }

    // Step 4: Pass the array to the function
    iRet = Min(ptr,iSize);
    iRet1 = Max(ptr,iSize);

    printf("\nMinimum of all the elements is : %d\n",iRet);
    printf("Maximum of all the elements is : %d\n",iRet1);

    // Step 6: Deallocate the memory of array
    free(ptr);

    return 0;       // Return success to OS
}