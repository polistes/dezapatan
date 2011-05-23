package commandPaTan.kuidaoring;

class YasaiCommand implements Command {
    private Ramen ramen;
    public YasaiCommand(Ramen ramen){
        this.ramen = ramen;
    }

    public void execute(){
        ramen.addTopping("ヤサイ");
    }
}
