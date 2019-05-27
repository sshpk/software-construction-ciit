package pk.cuiatd.iterator.task;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
	List<Profile> friends = new ArrayList<Profile>();
	List<Profile> coworkers = new ArrayList<Profile>();
	@Override
	public Iterator getFriendsIterator() {
		Profile[] profiles=new Profile[friends.size()];
		profiles = friends.toArray(profiles);
		Iterator it = new FacebookIterator(profiles);
		return it;
	}

	@Override
	public Iterator getCoworkersIterator() {
		Profile[] profiles=new Profile[coworkers.size()];
		profiles = coworkers.toArray(profiles);
		Iterator it = new FacebookIterator(profiles);
		return it;
	}
	public void addFriend(Profile profile){
		this.friends.add(profile);
	}
	public void addCoworker(Profile profile){
		this.coworkers.add(profile);
	}
}
