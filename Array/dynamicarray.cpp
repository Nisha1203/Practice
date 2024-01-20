// an array has a fixed capacity and we need to specify the size of the array when we initialize it. Sometimes this will be somewhat inconvenient and wasteful.

//Therefore, most programming languages offer built-in dynamic array which is still a random access list data structure but with variable size. For example, we have vector in C++ and ArrayList in Java.

#include <iostream>
#include <vector>

int main()
{
    //1.initialize
    std::vector <int> number;
    
    int num;
    std::cout<<"Enter integers";
    while (std::cin>>num)
    {
        number.push_back(num);
    }

    std::cout<<"You entered";
    for(int i : number)
    {
        std::cout<<i<<" ";
    }

    return 0;
    
}