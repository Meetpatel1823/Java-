class pascal {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int line = 1; line <= n; line++) {
            for (int j = 1; j <=n - line; j++) {
                System.out.print("_");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
