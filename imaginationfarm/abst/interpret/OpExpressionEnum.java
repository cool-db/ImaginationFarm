package imaginationfarm.abst.interpret;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public enum OpExpressionEnum implements Expression {
    MultiplyExpression, PlusExpression, MinusExpression;

    @Override
    public int interpret(int lv, int rv) {
        switch (this) {
            case MultiplyExpression:
                return lv * rv;
            case PlusExpression:
                return lv + rv;
            case MinusExpression:
                return lv - rv;
            default:
                return 0;
        }
    }
}
