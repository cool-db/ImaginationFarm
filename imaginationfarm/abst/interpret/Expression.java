package imaginationfarm.abst.interpret;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public interface Expression {
    default int interpret() {
        return 0;
    }

    default int interpret(int p1, int p2) {
        return 0;
    }
}
