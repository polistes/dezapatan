class BasicCounter implements Counter {
    private int current;

    public BasicCounter(int first) {
        this.current = first;
    }

    public BasicCounter() {
        this(1);
    }

    public int next() {
        return current++;
    }
}
