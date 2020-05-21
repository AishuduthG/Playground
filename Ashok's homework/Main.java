#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void sum(int,int);
int main()
{
    // Type your code here
int r,c,i,j;
  cin>>r>>c;
  sum(r,c);
  return 0;
}
void sum(int row,int col)
{
  int m1[row][col],m2[row][col],sum[row][col];
  int i,j;
  for( i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      cin>>m1[i][j];
    }
  }
   for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      cin>>m2[i][j];
    }
  }
  for (i = 0;i<row;i++ ) 
  {
      for (j = 0;j<col;j++ ) 
      {
        sum[i][j]=m1[i][j]+m2[i][j];
      }
  }
   for (i = 0;i<row;i++ ) 
  {
      for (j = 0;j<col;j++ ) 
         cout<<sum[i][j]<<" ";
        cout<<endl;
      
  }
  
  
}