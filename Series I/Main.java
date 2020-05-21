
#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  float a=0.5;
  cout<<a<<" ";
  for(int i=1;i<x;i++)
  {
    a*=3;
    cout<<a<<" ";
  }
  return 0;
}