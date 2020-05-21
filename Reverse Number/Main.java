#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,rem;
  cin>>n;
  int r=0;
  while(n!=0)
  {
    rem=n%10;
    r=r*10+rem;
    n/=10;
  }
  cout<<r;
	return 0;
}