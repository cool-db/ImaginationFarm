package imaginationfarm.spirit.item.hairstate;
public class Character {
	private State state;

	public Character(){
		state = null;
	}

	public void setState(State state){
		this.state = state;        
	}

	public State getState(){
		return state;
	}
}
