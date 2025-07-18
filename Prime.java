class Prime {
    public static void main(String[] args) {
        System.out.println("Is 2 prime? " + isPrime(2));
        System.out.println("Is 3 prime? " + isPrime(3));
        System.out.println("Is 4 prime? " + isPrime(4));
        System.out.println("Is 5 prime? " + isPrime(5));
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 18 prime? " + isPrime(18));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
