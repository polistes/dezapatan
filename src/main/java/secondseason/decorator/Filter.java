abstract class Filter implements Counter {
    protected Counter counter;

    public Filter(Counter counter) {
        this.counter = counter;
    }

}
