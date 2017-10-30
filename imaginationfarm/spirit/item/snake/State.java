package imaginationfarm.spirit.item.snake;

//处理当前状态
abstract public interface State {
    //change state
    public void doRecallMemory(Context context, boolean isChickenHealthy);
    //take actions
    public void doTellTheTruth();
}
