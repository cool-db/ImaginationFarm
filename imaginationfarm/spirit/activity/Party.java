package imaginationfarm.spirit.activity;

public class Party extends Activity {

    @Override
    void startPlay() {
        System.out.println("The party starts!");
    }

    @Override
    void endPlay() {
        System.out.println("The party ends!");
    }
}