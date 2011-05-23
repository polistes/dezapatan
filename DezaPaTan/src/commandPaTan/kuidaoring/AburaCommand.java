package commandPaTan.kuidaoring;

class AburaCommand implements Command{
    private Ramen ramen;
    public AburaCommand(Ramen ramen){
        this.ramen = ramen;
    }

    public void execute(){
        ramen.addTopping("アブラ");
    }
}
