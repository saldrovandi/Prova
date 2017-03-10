#include "funz.h"

int main() {
  int accesso = login();
  if (accesso == 1) {
    printf("Login funziona\n");
    exit(0);
  }
  else {
    printf("Login non funziona\n");
    exit(0);
  }
}
