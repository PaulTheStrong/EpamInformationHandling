package by.epam.training.tasks.information.handling.interpreter;

public class NonterminalExpressionNumber extends AbstractMathExpression{
    private int number;

    public NonterminalExpressionNumber(int number) {
        this.number = number;
    }

    @Override
    public void interpret(Context context) {
        context.push(number);
    }
}
