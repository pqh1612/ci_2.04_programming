#include <stdio.h>
#include <stdlib.h> //need this to use 'system pause'.

int main() {

  char yourname[32];
  printf("What is your name?\n");
  scanf("%s", yourname);
  printf("Hello %s!\n", yourname);
  system("pause"); //not make the CMD terminal disappear.
  return 0;

}