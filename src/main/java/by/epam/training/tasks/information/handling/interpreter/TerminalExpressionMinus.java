package by.epam.training.tasks.information.handling.interpreter;

public class TerminalExpressionMinus extends AbstractMathExpression {
    @Override
    public void interpret(Context context) {
        int first = context.pop();
        int second = context.pop();
        context.push(second - first);
    }
}
