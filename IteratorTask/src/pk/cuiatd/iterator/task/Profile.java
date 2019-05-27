package pk.cuiatd.iterator.task;

public class Profile {
	private String email;
	private String id;

	public Profile(String id, String email) {
		this.id=id;
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		String str= "Profile[id = "+getId()+", email= "+getEmail()+"]";
		return str;
	}

}
