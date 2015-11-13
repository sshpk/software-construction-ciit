package pk.ciit.iterator;

public class ConcreteTV implements TV{
	private Iterator iterator;
	String[] channels = {"QTV", "PEACE TV", "Makkah Live"};
	public ConcreteTV() {
		iterator = new ConcreteIterator();
	}

	@Override
	public Iterator getIterator() {
		return iterator;
	}
	
	public class ConcreteIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if(index<channels.length)
				return true;
			return false;
		}

		@Override
		public String next() {
			if(this.hasNext())
				return channels[index++];
			return null;
		}
	}
}
