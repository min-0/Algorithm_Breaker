#include <stdio.h>

int main()
{
	int H, M, S;
	int Num;

	scanf("%d%d%d%d", &H, &M, &S, &Num);

	S += Num;
	M += S / 60;
	S %= 60;
	H += M / 60;
	M %= 60;
	H %= 24;

	printf("%d %d %d\n", H, M, S);
}
