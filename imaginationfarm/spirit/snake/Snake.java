package imaginationfarm.spirit.snake;

import imaginationfarm.abst.snake.Context;
import imaginationfarm.abst.snake.State;

public class Snake implements Context {
    private State state = EvilState.getInstance();

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    public void actionPerformed() {
        state.doTellTheTruth();
    }

    public void setMemory() {
        state.doRecallMemory(this, Chicken.getInstance().getHealthy());
    }
}
