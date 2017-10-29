public abstract class Activity {
    abstract void startPlay();
    abstract void endPlay();

    //Template
    public final void play(){
        //Start the activity
        startPlay();

        //End the activity
        endPlay();
    }
}