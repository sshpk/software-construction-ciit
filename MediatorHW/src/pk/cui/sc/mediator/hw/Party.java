package pk.cui.sc.mediator.hw;

public interface Party {
	void addMember(PartyMember member);
	void act(PartyMember actor, Action action);
}
