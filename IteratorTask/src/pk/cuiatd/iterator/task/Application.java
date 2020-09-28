package pk.cuiatd.iterator.task;

public class Application {

	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.addCoworker(new Profile("zain", "zain@abc.de"));
		fb.addCoworker(new Profile("azam", "azam@abc.de"));
		fb.addCoworker(new Profile("faisal", "faisal@abc.de"));
		
		fb.addFriend(new Profile("arsalan", "arsalan@abc.de"));
		fb.addFriend(new Profile("hasnain", "hasnain@abc.de"));
		fb.addFriend(new Profile("yousuf", "yousuf@abc.de"));
		
		System.out.println("-------Coworkers------");
		It it = fb.getCoworkersIt();
		while(it.hasMore()){
			System.out.println(it.getNext());
		}
		System.out.println("-------Friends------");
		it = fb.getFriendsIt();
		while(it.hasMore()){
			System.out.println(it.getNext());
		}
		
	}

}
