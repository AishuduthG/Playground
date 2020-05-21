#include<iostream>
#include<bits/stdc++.h>
using namespace std;
void swap(int,int);
int main()
{
    // Type your code here
  int row,col;
  cin>>row;
  cin>>col;
  swap(row,col);
  return 0;
}
void swap(int r,int c)
{  
  int m1[r][c];
  int i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>m1[i][j];
    }
  }
  
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    cout<<m1[j][i]<<" ";
    cout<<endl;
  }
}