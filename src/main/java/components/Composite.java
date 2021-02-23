package components;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public boolean remove(Component component) {
        return components.remove(component);
    }
}
