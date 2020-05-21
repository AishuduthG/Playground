#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int n,t;
  int f=0,s=1;
  cin>>n;
  for(int i=2;i<n;i++)
  {
    t=f+s;
    f=s;
    s=t;
  }
cout<<t;
}