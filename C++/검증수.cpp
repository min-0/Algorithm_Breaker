#include <iostream>

using namespace std;

int main(){
	int input;
	int result = 0;

	for (int i = 0; i < 5; i++)
	{
		cin >> input;
		result += input * input;
	}
	cout << result % 10;
}