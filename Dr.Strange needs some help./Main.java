#include<iostream>
#include<bits/stdc++.h>
#include<cmath>
using namespace std;
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int a = pow(m, n);
  if(req<=a)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}