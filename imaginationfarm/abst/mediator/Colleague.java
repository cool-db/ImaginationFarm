package imaginationfarm.abst.mediator;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void getMessage(String message) {
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }
}
