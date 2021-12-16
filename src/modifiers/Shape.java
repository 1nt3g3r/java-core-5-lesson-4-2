package modifiers;

public abstract class Shape {
    private String name;
    private String shortName;

    public Shape() {
        name = "Shape";

        updateShortName();
    }

    private void updateShortName() {
        shortName = name.substring(0, 2);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name != null) {
            this.name = name;
            updateShortName();
        }
    }
}
