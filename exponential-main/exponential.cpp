#include <iostream>
using namespace std;

int expo(int x, int y){
	 
	 if( y == 0){
	return 1; 	
}
     else if(y==1){
	return x;
}
     else{ 
     return x*expo(x,y-1);
}
}

int main(){
	int m;
	int n;
	cout << "Enter the positive base of the number: "<< endl;
	cin>>m;
	cout << "Enter the positive exponent of the number: "<< endl;
	cin>>n;
	cout<< expo(m,n);
}

