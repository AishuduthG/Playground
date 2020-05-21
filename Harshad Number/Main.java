#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,t,z=0,result;
  cin>>n;
  t = n;
  while(t)
  {
    z  += t %10;
    t = t/10;
  }
  result = n%z;
  if(result==0)
  	cout<<"Harshad Number";
  else 
  	cout<<"Not Harshad Number"; 
}