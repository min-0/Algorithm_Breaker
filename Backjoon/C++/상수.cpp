#include <iostream>

using namespace std;

int main()
{
	int n1, n2;
	int res1, res2;
	cin >> n1 >> n2;

	res1 = ((n1 % 10) * 100) + (((n1 / 10) % 10) * 10) + (n1 / 100);
	res2 = ((n2 % 10) * 100) + (((n2 / 10) % 10) * 10) + (n2 / 100);

	if (res1 > res2)
		cout << res1;
	else
		cout << res2;
}