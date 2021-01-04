#include <stdio.h>

int main()
{
	int n;

	scanf_s("%d", &n);

	if (n >= 1 && n <= 100)
	{
		for (int i = 1; i <= n; i++)
		{
			for (int k = 1; k <= i; k++)
			{
				printf("*");
			}
			printf("\n");
		}
	}
}