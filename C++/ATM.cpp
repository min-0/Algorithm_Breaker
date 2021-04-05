#include <iostream>

using namespace std;
int main()
{
	int n;
	cin >> n;

	int p[1000];
	int temp;

	for (int i = 0; i < n; i++)
		cin >> p[i];

	for (int i = 1; i < n; i++)
		for (int k = 0; k < n - i; k++)
			if (p[k] > p[k + 1])
			{
				temp = p[k];
				p[k] = p[k + 1];
				p[k + 1] = temp;
			}

	int sum = 0;
	int res[10];
	temp = 0;

	for (int i = 0; i < n; i++)
	{
		temp += p[i];
		res[i] = temp;
		sum += res[i];
	}
	cout << sum << endl;
}