#include <stdio.h>
#include <sys/time.h>
#include <time.h>
#include <stdlib.h>

int main() {
  char name[32];
  struct timeval tv;

  printf("Your name please: ");
  scanf("%31s", name);
 
  printf("\n");
 
  if(gettimeofday(&tv, NULL) == 0) {
    struct tm *time = localtime( &(tv.tv_sec) );
    printf("%d\n", time->tm_hour ); //just extra stuff
    if(time->tm_hour <= 12 ) {
      printf("Good Morning %s!\n", name);
      system("pause");
      return 0;
 
    } else if(time->tm_hour> 12 && time->tm_hour<= 18 ) {
      printf("Good Afternoon %s!\n", name);
      system("pause");
      return 0;
 
    } else {
      printf("Good Evening %s!\n", name);
      system("pause");
      return 0;
    }
 
  } else {
    printf("Could not get time of day");
    system("pause");
    return 1;
  }
  system("pause");
  return 2;
}