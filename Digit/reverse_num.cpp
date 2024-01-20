#include<iostream>
using namespace std;

int main()
{
    int iNo = 0,iDigit=0,iReverse=0;
    cout<<"Enter the number : ";
    cin>>iNo;
    
    while (iNo != 0)
    {
        iDigit = iNo %10;
        iReverse = iReverse*10 + iDigit;
        iNo = iNo / 10;
    }

    cout<<iReverse;
}