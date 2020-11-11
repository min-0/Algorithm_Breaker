#include <stdio.h>

int main()
{
	char a, b;

	scanf("%c%c", &a, &b);

	double grade=0;
	double g=0;

	switch (a)
	{
	case 'A': grade = 4.0;
		break;
	case 'B': grade = 3.0;
		break;
	case 'C': grade = 2.0;
		break;
	case 'D': grade = 1.0;
		break;
	}

	switch (b)
	{
	case '+': g = 0.3;
		break;
	case '-': g = -0.3;
		break;
	case '0': g = 0;
		break;
	}

	printf("%.1lf", grade + g);
}