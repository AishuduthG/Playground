#include<iostream>
using namespace std;
int main()
{
  int x;
  double y;
  cin>>x>>y;
  if(y==13.30&&x>13)
  {
    cout<<"$5.00";
  }
  else if(y==13.30 && x<=13)
  {
    cout<<"$2.00";
  }
  else if(x>13)
  {
   cout<<"$8.00";

  }
  else
  {
    cout<<"$4.00";
  }


}