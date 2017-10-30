package imaginationfarm.spirit.activity;

import imaginationfarm.abst.logger.Logger;

public class Party extends Activity {

    @Override
    void startPlay() {
        Logger.i("The party starts!");
    }

    @Override
    void endPlay() {
        Logger.i("The party ends!");
    }
}