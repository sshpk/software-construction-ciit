package pk.cuiatd.iterator.task;

public class FacebookIterator implements Iterator{
	private Profile[] profiles;
	private int index=0;
	
	public FacebookIterator(Profile[] profiles) {
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
