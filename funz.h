#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <wait.h>
#include <unistd.h>

int login() {
  char user[20];
  char pass[20];
  int tentativi = 0;
  while (tentativi < 3) {
    printf("Username: ");
    scanf("%s", user);
    printf("Password: ");
    scanf("%s", pass);
    if (strcmp(user, "sergeddu") == 0 && strcmp(pass, "Apple4ever!") == 0) {
      return 1;
      printf("Accesso consentito\n");
    }
    else {
      return 0;
      tentativi++;
      printf("Accesso negato\n");
    }
  }
  if (tentativi > 3) {
    printf("Troppi tentativi falliti\n");
    exit(0);
  }
}
