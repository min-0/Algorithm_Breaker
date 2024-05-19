#include <iostream>

using namespace std;
int main(){
	int input[8];
	int asc = 0;
	int dec = 0;

	for (int i = 0; i < 8; i++){
		cin >> input[i];
		if (i + 1 == input[i])
			asc++;
		else if (8 - i == input[i])
			dec++;
	}
	if (asc == 8)
		cout << "ascending" << endl;
	else if (dec == 8)
		cout << "descending" << endl;
	else
		cout << "mixed" << endl;
}