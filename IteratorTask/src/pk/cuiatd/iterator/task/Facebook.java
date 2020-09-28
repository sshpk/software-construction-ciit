package pk.cuiatd.iterator.task;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
	List<Profile> friends = new ArrayList<Profile>();
	List<Profile> coworkers = new ArrayList<Profile>();
	@Override
	public It getFriendsIt() {
		Profile[] profiles=new Profile[friends.size()];
		profiles = friends.toArray(profiles);
		It it = new FacebookIt(profiles);
		return it;
	}

	@Override
	public It getCoworkersIt() {
		Profile[] profiles=new Profile[coworkers.size()];
		profiles = coworkers.toArray(profiles);
		It it = new FacebookIt(profiles);
		return it;
	}
	public void addFriend(Profile profile){
		this.friends.add(profile);
	}
	public void addCoworker(Profile profile){
		this.coworkers.add(profile);
	}
}
