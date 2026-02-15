import java.util.*;

class RailwayStation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int k = 1;
    List<Integer> endTimes = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      endTimes.add(a[i] + b[i]);
    }
    Collections.sort(endTimes);
    Arrays.sort(a);
    Arrays.sort(b);
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (i != j && a[j] < endTimes.get(i)) {
          count++;
        }
      }
      k = Math.max(k, count + 1);
    }
    System.out.println(k);
  }
}
