package imaginationfarm.spirit.item.snake;

public class KindState implements State {
    private static KindState kindState = new KindState();
    private KindState(){}

    public static KindState getInstance() {return kindState;}

    @Override
    public void doRecallMemory(Context context, boolean isChickenHealthy) {
        if(isChickenHealthy) {
            context.changeState(EvilState.getInstance());
            System.out.println("The snake changes evil.");
            System.out.println("The snake remembers nothing about the farmer.");
        }
    }

    @Override
    public void doTellTheTruth() {
        System.out.println("The snake tells the truth: I stole the wig!");
    }
}
