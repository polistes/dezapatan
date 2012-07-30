class SkipFilter extends Filter {
    private boolean skip = false;

    public SkipFilter(Counter counter, boolean skip) {
        super(counter);
        this.skip = skip;
    }

    public SkipFilter(Counter counter) {
        this(counter, false);
    }

    public int next() {
        if (skip) {
            this.counter.next();
            return this.counter.next();
        }

        int ret = this.counter.next();
        this.counter.next();
        return ret;
    }
}
