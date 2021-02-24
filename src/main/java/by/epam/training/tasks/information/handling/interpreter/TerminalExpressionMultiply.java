package by.epam.training.tasks.information.handling.interpreter;

public class TerminalExpressionMultiply extends AbstractMathExpression {
    @Override
    public void interpret(Context context) {
        int first = context.pop();
        int second = context.pop();
        context.push(first * second);
    }
}
