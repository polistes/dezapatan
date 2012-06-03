class BannerADAdapter extends BannerAD implements Module {
    public void display() {
        System.out.println(this.getADHTML());
    }
}
