#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int a=11,b;
  for(int i=0;i<x;i++)
  {
    b=a+4*i;
    b*=b;
    cout<<b<<" ";
  }
  return 0;
}