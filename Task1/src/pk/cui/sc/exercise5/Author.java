package pk.cui.sc.exercise5;

public class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name=name;
		setEmail(email);
		this.gender=gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		String str = "Author[name: "+getName()+
							" email: "+getEmail()+
							" gender: "+getGender()+
					 "]";
		return str;
	}
	
}
