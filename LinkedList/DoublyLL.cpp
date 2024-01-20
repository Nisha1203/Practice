#include<iostream>
using namespace std;

typedef struct node
{
    int data;
    struct node *next;
    struct node *prev;
}NODE, *PNODE, **PPNODE;

class DoublyLL
{
    private:
        PNODE First;        // Characteristics
        int iCount;         // Chracteristics

    public:
        DoublyLL();
        ~DoublyLL();

        void InsertFirst(int no);
        void InsertLast(int no);
        void InsertAtPos(int no, int ipos);
        
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int ipos);

        void Display();
        int Count();
};

void DoublyLL:: InsertFirst(int no) 
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;
    
    if(First == NULL)
    {
        First = newn;
    }
    else
    {
        newn->next = First;
        First->prev = newn;
        First = newn;
    }
    iCount++;
}

void DoublyLL:: InsertLast(int no) 
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;
    newn->prev = NULL;
    
    if(First == NULL)
    {
        First = newn;
    }
    else
    {
        PNODE temp = First;

        while(temp->next != NULL)
            {
                temp = temp->next;
            }

        temp->next = newn;
        newn->prev = temp;
    }
    iCount++;
}

void DoublyLL::DeleteFirst()
{
    if(First == NULL) // Empty LL
    {
        return;
    }
    else if(First->next == NULL) // Single node in LL
    {
        delete First;
        First = NULL;
    }
    else // More than one node in LL
    {
        First = First->next;
        delete First->prev;
        First->prev = NULL;
    }
    iCount--;
}

void DoublyLL::DeleteLast()
{
    if(First == NULL) // Empty LL
    {
        return;
    }
    else if(First->next == NULL) // Single node in LL
    {
        delete First;
        First = NULL;
    }
    else // More than one node in LL
    {
        PNODE temp = First;

        while(temp->next->next != NULL)
        {
            temp = temp -> next;
        }

        delete temp->next;
        temp->next = NULL;
    }
    iCount--;
}

void DoublyLL:: InsertAtPos(int no, int ipos)
{
    if((ipos < 1) || (ipos > iCount+1))
    {
        cout<<"Invalid position\n";
        return;
    }

    if(ipos == 1)
    {
        InsertFirst(no);
    }
    else if(ipos == iCount+1)
    {
        InsertLast(no);
    }
    else
    {
        PNODE temp = First;
        for(int iCnt = 1; iCnt < ipos-1; iCnt++)
        {
            temp = temp->next;
        }

        PNODE newn = new NODE;
        newn->data = no;
        newn->next = NULL;
        newn->prev = NULL;  

        newn->next = temp->next;
        temp->next->prev = newn;

        temp->next = newn;
        newn->prev = temp;

        iCount++;
    }
}

void DoublyLL::DeleteAtPos(int ipos)
{
    if((ipos < 1) || (ipos > iCount))
    {
        cout<<"Invalid position"<<"\n";
        return;
    }

    if(ipos == 1)
    {
        DeleteFirst();
    }
    else if(ipos == iCount)
    {
        DeleteLast();
    }
    else
    {
        PNODE temp = First;

        for(int iCnt = 1; iCnt < ipos-1; iCnt++)
        {
            temp = temp->next;
        }

        temp->next = temp->next->next;
        temp->next->prev = temp;
        
        iCount--;
    }

}

void DoublyLL::Display()
{
    PNODE temp = First;

    cout<<"Elements of Linked list are : "<<"\n";

    while (temp != NULL)
    {
        cout<<"| "<<temp->data<<" |<=>";
        temp = temp -> next;
    }
    cout<<" NULL"<<"\n";  
}

int DoublyLL :: Count()
{
    return iCount;
}

DoublyLL :: DoublyLL()//constructor
{
    First = NULL;
    iCount = 0;
}

DoublyLL :: ~DoublyLL()//destructor
{
}

int main()
{
    int iRet = 0;

    DoublyLL obj1;

    obj1.InsertFirst(51);
    obj1.InsertFirst(21);
    obj1.InsertFirst(11);
    obj1.InsertLast(101);
    obj1.InsertLast(111);

    obj1.Display();
    iRet = obj1.Count();
    cout<<"Number of elements are : "<<iRet<<"\n";

    obj1.InsertAtPos(55,4);

    obj1.Display();
    iRet = obj1.Count();
    cout<<"Number of elements are : "<<iRet<<"\n";
    
    obj1.DeleteAtPos(4);
    obj1.Display();
    iRet = obj1.Count();
    cout<<"Number of elements are : "<<iRet<<"\n";

    obj1.DeleteFirst();
    obj1.DeleteLast();

    obj1.Display();
    iRet = obj1.Count();
    cout<<"Number of elements are : "<<iRet<<"\n";

    return 0;
}