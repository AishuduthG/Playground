#include<iostream>
using namespace std;
int main()
{
  int x;
  int a=6,b=0;
  cin>>x;
  cout<<a<<" ";
  for(int i=1;i<x;i++)
  {
    b=5*i;
    a+=b;
    cout<<a<<" ";
  }
  return 0;
}