#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n >= 1 && n <= 100)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int k = i; k <= n - 1; k++)
			{
				printf(" ");
			}
			for (int j = 1; j < 2 * i; j++)
			{
				printf("*");
			}
			printf("\n");
		}

		for (int i = 1; i < n; i++)
		{
			for  (int j = 1; j <= i; j++)
			{
				printf(" ");
			}
			for (int k = 2 * n - 1; k > 2 * i ; k--)
			{
				printf("*");
			}
			printf("\n");
		}
	}
	return 0;
}