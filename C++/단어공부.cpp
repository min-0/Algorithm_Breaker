#include <iostream>
#include <string>

using namespace std;

int main(){
	string alpha;

	int cnt = 0;
	int max = 0;
	int index[26] = { 0, };

	cin >> alpha;

	for (int i = 0; i <= alpha.length(); i++){
		if (alpha[i] <= 65)
		{
			alpha[i] += 32;
		}
	}
	for (int i = 0; i < alpha.length(); i++){
		for (int k = 0; k <= 26; k++){
			if (alpha[i] == k + 97)
				index[k]++;
		}
	}
	for (int i = 0; i < 26; i++)
	{
		if (index[i] > 1)
		{
			max = i;
			cnt++;
		}
	}

	if (cnt > 1)
		cout << "?" << endl;
	else
		cout << (char)(max + 65) << endl;

}