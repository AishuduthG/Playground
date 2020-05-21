#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int gcd(int u,int v)
{
      return (v != 0) ? gcd(v, u % v) : u;

}
int main(void)
{
  //Type your code here.
  int result,a,b;
  cin>>a>>b;
  result = gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<< " = "<<result;
  return 0;
}
