package imaginationfarm.abst.interpret;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int i) {
        number = i;
    }

    public int interpret() {
        return number;
    }
}
