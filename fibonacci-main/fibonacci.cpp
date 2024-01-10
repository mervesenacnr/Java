#include <iostream>
using namespace std;

int main() {
	int a, b, result, n, i;
	cout << "Enter the number of terms: "<< endl;
	cin >> n;
	cout << "The Fibonacci series you want: "<< result;
	
	a= 0;
	b= 1;
	for(int i=1; i<=n; i++) {
		cout << a;
		result = a + b;
		a = b;
		b = result;
	}
}

