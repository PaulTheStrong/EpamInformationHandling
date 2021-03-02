package by.epam.training.tasks.information.handling.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Composite composite = (Composite) o;
        return components.equals(composite.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }
}
