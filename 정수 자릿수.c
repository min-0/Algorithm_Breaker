#include <stdio.h>

/*1이상의 정수를 입력받아 자릿수를 출력*/

int main()
{
	int i;
	int count = 0;

	printf("정수를 입력하세요 : ");
	scanf_s("%d", &i);

	while (i != 0)
	{
		i = i / 10;
		count++;
	}
	printf("%d자릿수 \n", count);


}