package by.epam.training.tasks.information.handling.interpreter;

import by.epam.training.tasks.information.handling.components.Lexeme;

import java.util.ArrayList;
import java.util.List;

public class ExpressionCalculator {

    public int calculate(Lexeme expression) {
        Context context = new Context();
        String expressionValue = expression.getValue();
        String withoutBrackets = expressionValue.substring(1, expressionValue.length() - 1);
        List<AbstractMathExpression> mathExpressions = parseExpression(withoutBrackets);
        for (AbstractMathExpression terminal : mathExpressions) {
            terminal.interpret(context);
        }
        return context.pop();
    }

    // (3 * 6) + (7 - 4)
    //

    private List<AbstractMathExpression> parseExpression(String expression) {
        List<AbstractMathExpression> result = new ArrayList<>();
        for (String lexeme : expression.split("\\s+")) {
            if (lexeme.isEmpty()) {
                continue;
            }
            switch (lexeme) {
                case "+":
                    result.add(new TerminalExpressionPlus());
                    break;
                case "-":
                    result.add(new TerminalExpressionMinus());
                    break;
                case "*":
                    result.add(new TerminalExpressionMultiply());
                    break;
                case "/":
                    result.add(new TerminalExpressionDivide());
                    break;
                default:
                    result.add(new NonterminalExpressionNumber(Integer.parseInt(lexeme)));
            }
        }
        return result;
    }

}
