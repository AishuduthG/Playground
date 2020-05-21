#include<iostream>
using namespace std; 
int main()
{
  //Type your code here.
int i,fact=1,number;    
 cin>>number;    
  for(i=1;i<=number;i++)
  {    
      fact=fact*i;    
  }    
  cout<<"The factorial of " <<number<<" is "<<fact<<endl;  
  return 0;  
}