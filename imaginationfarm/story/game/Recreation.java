package imaginationfarm.story.game;

public abstract class Recreation {
	abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   //template
	   public final void play(){

	      //initialize recreation
	      initialize();

	      //begin recreation
	      startPlay();

	      //end recreation
	      endPlay();
	   }
}
