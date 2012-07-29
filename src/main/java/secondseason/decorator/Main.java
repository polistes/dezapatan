class Main {
    public static void main(String[] args) {
        Counter c = new SkipFilter(
                        new BasicCounter(), true
                    );
        Counter c2 = new PrimeFilter(
                        new BasicCounter()
                     );

        Counter c3 = new SkipFilter(
                        new PrimeFilter(
                            new BasicCounter()
                        )
                     );

        Counter c4 = new FibonacciFilter(
                        new PrimeFilter(
                            new BasicCounter()
                        )
                     );

        Counter c5 = new SkipFilter(
                        new FibonacciFilter(
                            new BasicCounter()
                        )
                   );

        System.out.println("========================================");
        for (int i = 0; i < 10;i++) {
            System.out.println(c.next());
        }
        System.out.println("========================================");
        for (int i = 0; i < 10;i++) {
            System.out.println(c2.next());
        }
        System.out.println("========================================");
        for (int i = 0; i < 10;i++) {
            System.out.println(c3.next());
        }
        System.out.println("========================================");
        for (int i = 0; i < 7;i++) {
            System.out.println(c4.next());
        }
        System.out.println("========================================");
        for (int i = 0; i < 10;i++) {
            System.out.println(c5.next());
        }
        System.out.println("========================================");
    }
}
