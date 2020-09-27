#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n >= 1 && n <= 9)
	{
		for (int i = 1; i <= 9; i++)
		{
			printf("%d * %d = %d \n", n, i, n * i);
		}
	}
	return 0;
}