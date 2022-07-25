class Rev {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of elements in array:");
    n = sc.nextInt();
    int p[] = new int[n];
    System.out.println("enter array elements:");
    for (i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    for (i = 0; i < n / 2; i++) {
      int t = p[n - 1 - i];
      p[n - 1 - i] = p[i];
      p[i] = t;
    }
    for (i = 0; i < n; i++) {
      Sysytem.out.println(+p[i]);
    }
  }
}