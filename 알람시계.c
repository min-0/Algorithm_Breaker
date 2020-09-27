#include <stdio.h>

int main()
{
	int h;
	int m;

	scanf_s("%d%d", &h, &m);

	if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
	{
		if (h == 0 && m < 45)
		{
			h = 23;
			m += 15;

			printf("%d %d", h, m);
		}
		else if (m == 45)
		{
			m = 0;
			printf("%d %d", h, m);
		}
		else if (m > 45)
		{
			m = m - 45;
			printf("%d %d", h, m);
		}
		else
		{
			h -= 1;
			m += 15;
			printf("%d %d", h, m);
		}
	}
	return 0;
}