#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n >= 1 && n <= 100)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int k = 1; k < i; k++)
			{
				printf(" ");
			}
			for (int k = 2 * n ; k >= 2 * i; k--)
			{
				printf("*");
			}
			printf("\n");
		}
		for (int i = 1; i < n; i++)
		{
			for (int k = n - 1; k > i; k--)
			{
				printf(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++)
			{
				printf("*");
			}
			printf("\n");
		}
	}
	return 0;
}