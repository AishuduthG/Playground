#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int a,b,z;
 
  for(int i=1;i<=x;i++)
  {
    z=i;
    if( i%2 == 0)
    {
     z*=z;
     cout<<z-2<<" ";
    }
    else
    {
     z*=z;
     cout<<z-1<<" ";
    } 
    
  
  }
  return 0;
}