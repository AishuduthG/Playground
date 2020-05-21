#include<iostream>
using namespace std;
int main(){
int r, c, mat1[100][100], mat2[100][100], sum[100][100], i, j;
cin >> r >> c;
for(i=0; i<r; ++i)
for(j=0; j<c; ++j)
{
cin >> mat1[i][j];
}
for(i=0; i<r; ++i)
for(j=0; j<c; ++j)
{
cin >> mat2[i][j];
}
for(i=0;i<r;++i)
for(j=0;j<c;++j)
{
sum[i][j]=mat1[i][j]+mat2[i][j];
}
for(i=0;i<r;++i)
for(j=0;j<c;++j)
{
cout <<sum[i][j] << " ";
if(j==c-1)
{
cout << "\n";
}
}
return 0;
}