#include <stdio.h>

int main()
{
	int n;
	int fac = 1;

	scanf_s("%d", &n);

	if (n >= 0 && n <= 12)
	{
		for (int i = 1; i <= n; i++)
		{
			fac *= i;
		}
		printf("%d", fac);
	}
	return 0;
}