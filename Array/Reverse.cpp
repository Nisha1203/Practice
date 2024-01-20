#include<iostream>
using namespace std;

class Array
{
    public:
        int iSize;
        int *Arr;

        Array(int iNo)//constructor
        {
            iSize = iNo;
            Arr= new int[iSize];
        }

        ~Array()//destructor
        {
            delete []Arr;   
        }

        void Accept()
        {
            cout<<"Enter the elements : "<<"\n";

            int iCnt = 0;
            for(iCnt=0;iCnt<iSize;iCnt++)
            {
                cin>>Arr[iCnt];
            }
        }

        void Display()
        {
            cout<<"Elements of the array are : "<<"\n";

            int iCnt = 0;
            for(iCnt=0;iCnt<iSize;iCnt++)
            {
                cout<<Arr[iCnt]<<"\n";
            }
        }

        void Reverse()
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
};

int main()
{
    int iNo=0;
    int iRet = 0,iRet1=0;

    cout<<"Enter number of elements : "<<"\n";
    cin>>iNo;

    Array aobj(iNo);
    aobj.Accept();
    aobj.Display();
    aobj.Reverse();
    aobj.Display();

    return 0;
}