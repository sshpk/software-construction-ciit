package pk.ciit.sc.labsessional2;

public class DeviceInvoker {
public Command command;
    
    public DeviceInvoker(Command c){
        this.command=c;
    }
     
    public void execute(){
        this.command.execute();
    }
}
