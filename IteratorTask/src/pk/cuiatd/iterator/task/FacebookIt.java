package pk.cuiatd.iterator.task;

public class FacebookIt implements It{
	private Profile[] profiles;
	private int index=0;
	
	public FacebookIt(Profile[] profiles) {
		this.profiles=profiles;
	}

	@Override
	public Boolean hasMore() {
		Boolean result = false;
		if(index < profiles.length)
			result = true;
		return result;
	}

	@Override
	public Profile getNext() {
		Profile profile = null;
		if(hasMore()){
			profile = profiles[index];
			index++;
		}
		return profile;
	}

}
