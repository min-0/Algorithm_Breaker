#include <stdio.h>

int main()
{
	int p[3];
	int num, max;
	int sum;

	scanf("%d", &num);

	for (int i = 1; i <= num; i++)
	{
		max = 0;
		sum = 0;

		for (int k = 0; k < 3; k++)
		{
			scanf("%d", &p[k]);
			if (p[max] < p[k])
			{
				max = k;
			}
		}
		for (int j = 0; j < 3; j++)
		{
			if (j != max)
			{
				sum += p[j] * p[j];
			}
		}
		printf("Scenario #%d:\n", i);
		if (p[max] * p[max] == sum)
		{
			printf("yes\n");
		}
		else
		{
			printf("no\n");
		}
		if (i != num)
		{
			printf("\n");
		}
	}
	return 0;
}