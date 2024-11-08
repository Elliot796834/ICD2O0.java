class debFacErr {
    public static void main(String[] args) {
        int n = 24;
        int max = (int) Math.sqrt(n);
        for (int i = 1; i <= max; i++) {
            if (n % i == 0) { // Check if i is a factor
                System.out.print(i + " ");
                int f2 = n / i; // Find the corresponding factor pair
                if (f2 != i) {  // Avoid duplicates when i and f2 are the same
                    System.out.print(f2 + " ");
                }
            }
        }
        System.out.println();
    }
}
