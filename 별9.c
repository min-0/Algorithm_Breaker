#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n > 4 && n % 2 == 0)
	{
		for (int i = 1; i <= n / 2; i++)
		{
			for (int k = n / 2; k >= i; k--)
			{
				printf("*");
			}
			for (int j = 1; j < 2 * i - 1; j++)
			{
				printf(" ");
			}
			for (int k = n / 2; k >= i; k--)
			{
				printf("*");
			}
			printf("\n");
		}
		for (int i = 1; i <= n / 2 ; i++)
		{
			for (int k = 0; k < i; k++)
			{
				printf("*");
			}
			for (int j = n - 1; j >= i * 2; j--)
			{
				printf(" ");
			}
			for (int k = 0;k < i; k++)
			{
				printf("*");
			}
			printf("\n");
		}
	}
	return 0;
}