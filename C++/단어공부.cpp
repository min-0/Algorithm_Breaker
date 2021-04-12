#include <iostream>
#include <string>

using namespace std;

int main(){
	string alpha;

	int cnt = 0;
	int m = 0;
	int index = 0;
	int alphacnt[27] = { 0, };

	cin >> alpha;

	for (int i = 0; i <= alpha.length(); i++){
		if (!(alpha[i] >= 'A' && alpha[i] <= 'Z') && !(alpha[i] >= 'a' && alpha[i] <= 'z')) continue; //알파벳만 받아오도록,,

		if (alpha[i] >= 'A' && alpha[i] <= 'Z')
		{
			alpha[i] += 32;
		}
		int idx = alpha[i] - 'a';
		alphacnt[idx]++;
		m = alphacnt[idx] >= m ? alphacnt[idx] : m;
	}
	for (int i = 0; i < 27; i++)
	{
		if (alphacnt[i] == m)
		{
			cnt++;
			index = i;
		}
	}

	if (cnt > 1)
		cout << "?" << endl;
	else
		cout << (char)(index + 65) << endl;

}