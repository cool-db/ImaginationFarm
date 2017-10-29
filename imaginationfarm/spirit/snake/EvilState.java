package SnakeConfessing;

public class EvilState implements State {
    private static EvilState evilState = new EvilState();
    private EvilState(){}

    public static EvilState getInstance() {
        return evilState;
    }

    @Override
    public void doRecallMemory(Context context, boolean isChickenHealthy) {
        if(!isChickenHealthy) {
            context.changeState(KindState.getInstance());
            System.out.println("Snake recalls that the farmer saved its life in winter and gets guilty to have the farm in mess.");
            System.out.println("The snake changes kind.");
        }
    }

    @Override
    public void doTellTheTruth() {
        System.out.println("The snake envies the girl and says: I didn't steal the wig");
    }
}
