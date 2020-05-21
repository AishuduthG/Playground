#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n1,n2;
  cin>>n1>>n2;
  int mat[n1][n2];
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      cin>>mat[i][j];
    }
  }
  int sum ,i,j;
  for(i=0;i<n2;i++)
  {
    sum=0;
    for(j=0;j<n1;j++)
    {
      sum = sum + mat[i][j];
    }
    cout<<sum<<endl;
  }
}
  