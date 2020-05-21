#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,cr,cb;
  cin>>tb>>tr>>cr>>cb;
  float t1 = tb/6;
  int t = cb/6;
  int p = cb % 6;
  float c6 = ((float)t+(float)p/10);
  float crr = cr/c6;
  float trr = tr/t1;
  cout<<t1<<"\n"<<fixed << setprecision(1) <<c6<<"\n"<<crr<<"\n"<<trr;
  if(crr>trr)
  {
    cout<<"\nEligible to Win";
  }
  else 
  {
       cout<<"\nNot Eligible to Win";
  }
    
    
}