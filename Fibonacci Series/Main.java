    #include <iostream>  
    using namespace std;  
    int main()
    {  
      int n1=0,n2=1,n3,i,number;       
     cin>>number;     
     for(i=2;i<number;++i) //loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      n1=n2;    
      n2=n3;    
     }   
      cout<<"The term "<<number<< " in the fibonacci series is "<<n3;    
       return 0;  
       }  