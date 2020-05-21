#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  float x,y,z,n;
  cin>>a>>b;
  x=(b*a);
  y=((b/100)*50);
  if(a<=2)
  {
     z = (x-y);
    cout<<z;
  }
  else if(a==3)
  {
    n = (2*b);
    cout<<n;
  }
  else 
  {
    cout<<"Number of items is more";
  }
    
    
}