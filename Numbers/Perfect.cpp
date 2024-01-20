#include<iostream>
using namespace std;

int main()
{
    int iNo = 0,sum=0;
    cout<<"Enter the number : ";
    cin>>iNo;
    
    for(int i=1;i<iNo;i++)
    {
        if((iNo%i) == 0)
        {
            sum = sum + i; // 0+1 , 1+2, 3+3
        }
    }

    if(sum == iNo)
    {
        cout<<"It is a perfect number";
    }
    else
    {
        cout<<"It is not a perfect number";
    }

    return 0;
}