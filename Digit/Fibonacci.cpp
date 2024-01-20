#include<iostream>
using namespace std;

// 0, 1, 1, 2, 3, 5, 8, 13, 21 

int main()
{
    int iNo = 0,t1=0,t2=1,fibo = 0;
    cout<<"Enter the number till the fibonacci series : ";
    cin>>iNo;
    
    for(int i=1;i<=iNo;i++)
    {
        cout<<t1<<" ,";
        fibo = t1 + t2;
        t1 = t2;
        t2 = fibo;
    }
}