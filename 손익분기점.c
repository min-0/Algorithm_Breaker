#include <stdio.h>

int main()
{
	int a, b, c;
	int x;

	scanf_s("%d%d%d", &a, &b, &c);

	if (c <= b)
	{
		printf("-1");
	}
	else
	{
		x = a / (c - b);
		printf("%d", x + 1);
	}
	return 0;
}