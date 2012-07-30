import java.util.Map;
import java.util.HashMap;

class FibonacciFilter extends Filter {
    private Map<Integer, Integer> fibs= new HashMap<Integer, Integer>();
    private boolean isInit = false;

    public FibonacciFilter(Counter counter){
        super(counter);
    }

    public int next() {
        int ret;
        while (true) {
            ret = this.counter.next();
            if (this.isFib(ret)) {
                return ret;
            }
        }
    }

    private boolean isFib(int n) {
        int fib;
        this.calcFib(n);
        return this.fibs.containsValue(n);
    }

    private void calcFib(int n) {
        int idx = 0, fib;
        while (true) {
            fib = this.fib(idx);
            if (n <= fib) {
                break;
            }
            idx++;
        }
    }

    private int fib(int n) {

        if (this.fibs.containsKey(n)) {
            return this.fibs.get(n);
        }

        if (n <= 1) {
            this.fibs.put(n, n);
            return n;
        }

        int fib = fib(n - 1) + fib(n - 2);
        this.fibs.put(n, fib);
        return fib;
    }
}
