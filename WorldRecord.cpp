/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

float round(float var)
{
float value = (int)(var * 100 + .5);
    return (float)value / 100;
}
  

int main(){
    int n;
    float a[4];
    double p=9.579;
    cin>>n;
    while(n-->0){
        float e=1.0;
    
    for(int i=0;i<4;i++)
    {
        cin>>a[i];
        e=e*a[i];
    }
     e=100/e;
    float va=round(e);
    
    double d=va;
    
    if(d<p){
        cout<<"YES"<<endl;
        
    }else{
        cout<<"NO"<<endl;
    }
    
    }
    

}
