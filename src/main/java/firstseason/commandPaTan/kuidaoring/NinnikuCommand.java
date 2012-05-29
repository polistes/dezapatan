package commandPaTan.kuidaoring;

class NinnikuCommand implements Command {
    private Ramen ramen;
    public NinnikuCommand(Ramen ramen){
        this.ramen = ramen;
    }

    public void execute(){
        ramen.addTopping("ニンニク");
    }
}
