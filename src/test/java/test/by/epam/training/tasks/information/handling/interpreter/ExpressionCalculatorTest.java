package test.by.epam.training.tasks.information.handling.interpreter;

import by.epam.training.tasks.information.handling.components.Lexeme;
import by.epam.training.tasks.information.handling.interpreter.ExpressionCalculator;
import org.junit.Assert;
import org.junit.Test;

public class ExpressionCalculatorTest {

    private static final String TEST_STRING = "[5 3 6 * 7 4 - + * 5 /]";

    @Test
    public void testCalculateFunction() {
        //given
        Lexeme expression = new Lexeme(TEST_STRING, Lexeme.Type.EXPRESSION);
        int expected = 21;
        ExpressionCalculator calculator = new ExpressionCalculator();

        //when
        int actual = calculator.calculate(expression);

        //then
        Assert.assertEquals(expected, actual);

    }

}
