package pk.ciit.animals;

public abstract class Animal {
	private String animalName;
	private String arms, body, head, legs, tail;

	public abstract void eat(); 
	public void showMe(){
		System.out.println("I am "+getAnimalName()
				+" having ["+getArms()
				+ ", "+getBody()
				+ ", "+getHead()
				+ ", "+getLegs()
				+ ", "+getTail()+"]");
	}
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getArms() {
		return arms;
	}

	public void setArms(String arm) {
		this.arms = arm;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getLegs() {
		return legs;
	}

	public void setLegs(String leg) {
		this.legs = leg;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
}
