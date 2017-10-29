package imaginationfarm.test;

import imaginationfarm.abst.interpret.*;
import org.testng.annotations.Test;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public class InterpretTest {
    @Test
    public void test() {
        OpExpressionEnum multiply = OpExpressionEnum.MultiplyExpression;
        OpExpressionEnum plus = OpExpressionEnum.PlusExpression;
        OpExpressionEnum minus = OpExpressionEnum.MinusExpression;

        BinaryExpression b1 = new BinaryExpression(new NumberExpression(5), minus, new NumberExpression(3));
        BinaryExpression b2 = new BinaryExpression(new NumberExpression(6), multiply, new NumberExpression(9));

        int result = (new BinaryExpression(b1, plus, b2)).interpret();
        System.out.println(result);
    }
}
