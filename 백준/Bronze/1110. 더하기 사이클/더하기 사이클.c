#include <stdio.h>

int main()
{
	int n;
	int count = 1;
	scanf("%d", &n);

	for (int tmp = n % 10 * 10 + (n / 10 + n % 10) % 10; tmp != n; tmp = tmp % 10 * 10 + (tmp / 10 + tmp % 10) % 10)
	{
		count++;
	}
	printf("%d\n", count);

	return 0;
}