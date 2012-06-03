class ADAdapter implements Module {
    private AD ad;
    public ADAdapter(AD ad) {
        this.ad = ad;
    }

    public void display() {
        System.out.println(ad.getADHTML());
    }
}
