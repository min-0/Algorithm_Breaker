#include <stdio.h>

int main()
{
	int n;
	int sum = 0;

	for (int i = 0; i < 5; i++)
	{
		scanf_s("%d", &n);
		if (n < 40)
		{
			n = 40;
		}
		sum += n;
	}
	printf("%d", sum / 5);

	return 0;
}