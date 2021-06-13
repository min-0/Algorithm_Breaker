#include <iostream>
#include <cmath>
using namespace std;

int main(){
	int heru, ausar, auset;

	while (true){
		cin >> heru >> ausar >> auset;

		if (heru == 0 && ausar == 0 && auset == 0)
		{
			break;
		}
		else if (pow(heru, 2) + pow(ausar, 2) == pow(auset, 2)
			|| pow(auset, 2) + pow(ausar, 2) == pow(heru, 2)
			|| pow(heru, 2) + pow(auset, 2) == pow(ausar, 2))
		{
			cout << "right" << endl;
		}
		else cout << "wrong" << endl;
	}
}
