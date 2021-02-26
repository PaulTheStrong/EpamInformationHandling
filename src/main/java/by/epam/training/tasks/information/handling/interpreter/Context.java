package by.epam.training.tasks.information.handling.interpreter;

import java.util.ArrayDeque;

public class Context {
    private final ArrayDeque<Integer> contextValues = new ArrayDeque<>();

    public Integer pop() {
        return contextValues.pop();
    }

    public void push(Integer value) {
        contextValues.push(value);
    }
}
