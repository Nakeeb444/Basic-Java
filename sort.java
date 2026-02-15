import java.util.*;

class sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] books = new int[n];
    for (int i = 0; i < n; i++) {
      books[i] = sc.nextInt();
    }
    Arrays.sort(books);
    int min = 0, max = 0;
    int i = 0, j = n - 1;
    while (i <= j) {
      min += books[i];
      j -= k;
      i++;
    }
    i = 0;
    j = n - 1;
    while (i <= j) {
      max += books[j];
      i += k;
      j--;
    }
    System.out.print("min. save = " + min + ", max. save = " + max);
  }
}