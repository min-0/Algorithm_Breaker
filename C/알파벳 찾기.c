#include <stdio.h>
#include <string.h>

int main()
{
	char s[100];
	int check = 0;

	scanf("%s", s);

	for (int k = 97; k <= 122; k++)
	{
		for (int i = 0; i < strlen(s); i++)
		{
			if (s[i] == k)
			{
				check = 1;
				printf("%d ", i);
				break;
			}
		}
		if (check == 0)
		{
			printf("-1 ");
		}
		check = 0;
	}

}