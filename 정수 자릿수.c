#include <stdio.h>

/*1�̻��� ������ �Է¹޾� �ڸ����� ���*/

int main()
{
	int i;
	int count = 0;

	printf("������ �Է��ϼ��� : ");
	scanf_s("%d", &i);

	while (i != 0)
	{
		i = i / 10;
		count++;
	}
	printf("%d�ڸ��� \n", count);


}