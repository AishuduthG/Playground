#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b=" <<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b=" <<b;
  return 0;
}
void swap(int x ,int y)
{
  int t;
  t=x;
  x=y;
  y=t;
}
