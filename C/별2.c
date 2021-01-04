#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n >= 1 && n <= 100)
	{
		for (int k = 0; k < n; k++)
		{
			for (int i = k; i <= n - 1; i++)
			{
				printf("*");
			}
			printf("\n");
		}
	}
	return 0;
}