#include<iostream>
using namespace std;
int main()
{
  int a[10],count=0;
  float score=0;
  while(cin>>a[count]) {
  count++;
}
  for(int i=0;i<count;i++)
  {
    if(a[i]>0)
    {
    if(a[i]&1)
      score+=1;
    else
      score-=0.5;
  }
    else
      score-=1;
  }
  cout<<score;
  return 0;
}