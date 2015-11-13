package pk.ciit.state;

public class TVBasic {
	private String state="";
	public void setState(String state){
		this.state=state;
	}
	public void doAction(){
		if(state.equalsIgnoreCase("ON")){
			System.out.println("TV is turned ON");
		}else if(state.equalsIgnoreCase("OFF")){
			System.out.println("TV is turned OFF");
		}
	}
	public static void main(String args[]){
		TVBasic remote = new TVBasic();
		remote.setState("ON");
		remote.doAction();
		remote.setState("OFF");
		remote.doAction();
	}
}