package commandPaTan.kuidaoring;

class MashiCommand implements Command{
    private Command cmd;
    public MashiCommand(Command cmd){
        this.cmd = cmd;
    }

    public void execute(){
        cmd.execute();
        cmd.execute();
    }
}
