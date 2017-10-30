package imaginationfarm.abst.mediator;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void getMessage(String message);
}
