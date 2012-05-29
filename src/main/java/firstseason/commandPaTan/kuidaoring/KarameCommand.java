package commandPaTan.kuidaoring;

class KarameCommand implements Command {
    private Ramen ramen;
    public KarameCommand(Ramen ramen){
        this.ramen = ramen;
    }

    public void execute(){
        ramen.addTopping("カラメ");
    }
}

