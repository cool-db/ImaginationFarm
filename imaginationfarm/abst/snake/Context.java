package imaginationfarm.abst.snake;

//管理状态切换
public interface Context {
    public void changeState(State state);
}
