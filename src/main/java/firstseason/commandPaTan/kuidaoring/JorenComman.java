package commandPaTan.kuidaoring;

import java.util.ArrayList;

class JorenCommand implements Command {
    ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command cmd){
        commands.add(cmd);
    }

    public void execute(){
        for(Command cmd: commands){
            cmd.execute();
        }
    }
}
