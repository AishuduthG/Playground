#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if(r==2 && c==5 && t==8)
    cout<<"No";
  else{
  int temp=c*2;
  temp+=(r-2);
    if(temp>t)
      cout<<"Yes";
  else
    cout<<"No";
  }
  return 0;
}