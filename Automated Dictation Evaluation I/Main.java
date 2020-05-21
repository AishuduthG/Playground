#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2;
  cin>>str1>>str2;
  if( str1 == str2 )
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}