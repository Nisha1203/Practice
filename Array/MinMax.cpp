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
            cout<<"Inside Display"<<"\n";

            cout<<"Elements of the array are : "<<"\n";

            int iCnt = 0;
            for(iCnt=0;iCnt<iSize;iCnt++)
            {
                cout<<Arr[iCnt]<<"\n";
            }
        }

        int Min()
        {
            int iCnt = 0;
            int iMin = Arr[0];

            for(int iCnt=0;iCnt<iSize;iCnt++)
            {
                if(Arr[iCnt] < iMin)
                {
                    iMin = Arr[iCnt];
                }
            }
            return iMin;
        }

        int Max()
        {
            int iMax = Arr[0];

            for(int iCnt=0;iCnt<iSize;iCnt++)
            {
                if(Arr[iCnt] > iMax)
                {
                    iMax = Arr[iCnt];
                }
            }
            return iMax;
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

    iRet = aobj.Min();
    iRet1 = aobj.Max();

    cout<<"Minimum of all element is : "<<iRet<<"\n";
    cout<<"Maximum of all element is : "<<iRet1<<"\n";
    return 0;
}