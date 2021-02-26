package by.epam.training.tasks.information.handling.components;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> components;

    public void add(Component component) {
        components.add(component);
    }

    public Composite() {
        this.components = new ArrayList<>();
    }

    public Composite(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public boolean remove(Component component) {
        return components.remove(component);
    }
}
