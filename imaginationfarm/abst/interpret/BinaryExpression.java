package imaginationfarm.abst.interpret;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public class BinaryExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private OpExpressionEnum opExpression;

    public BinaryExpression(Expression le, OpExpressionEnum oe, Expression re) {
        leftExpression = le;
        opExpression = oe;
        rightExpression = re;
    }

    @Override
    public int interpret() {
        return opExpression.interpret(leftExpression.interpret(), rightExpression.interpret());
    }
}
