#include <stdio.h>

int main()
{
	int num;
	int sum = 0;

	printf("4자리 이하의 수를 입력하세요. : ");
	scanf_s("%d", &num);

	if (num < 10000)
	{
		while (num)
		{
			sum += num % 10; //sum = sum + num % 10
			num /= 10; // num = num / 10
		}

		printf("\n 각 자릿수의 합은 %d 입니다 \n", sum);
	}
	else
	{
		printf("\n 4자리 이하의 수를 입력하세요! \n");
	}
}