import java.util.List;
import java.util.ArrayList;

class PrimeFilter extends Filter {
    private List<Integer> primes = new ArrayList<Integer>();
    private boolean isInit = false;

    public PrimeFilter(Counter counter) {
        super(counter);
    }

    public int next() {
        int ret = this.counter.next();
        if (!isInit) {
            this.initPrimes(ret);
        }

        while (true) {
            ret = this.counter.next();
            if (this.isPrime(ret)) {
                this.primes.add(ret);
                return ret;
            }
        }

    }

    private boolean isPrime(int n) {

        for(Integer i: primes) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private void initPrimes(int max) {
        for (int i = 2;i < max;i++) {
            if (this.isPrime(i)) {
                this.primes.add(i);
            }
        }
    }
}
