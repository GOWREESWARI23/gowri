#include <stdio.h>
int main()
{
  int gow, n, fact = 1;
printf("Enter a number\n");
  scanf("%d", &n);
 for (gow =1; gow<=n;gow++)
    fact = fact * gow;
 
  printf("Factorial of %d = %d\n", n, fact);
 return 0;
}
