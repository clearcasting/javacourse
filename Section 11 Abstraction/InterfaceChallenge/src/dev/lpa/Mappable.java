package dev.lpa;

enum GeometryType {POINT, LINE}
enum IconType {RED_STAR, GREEN_DOTTED}

public interface Mappable {
    // interface syntax is () I guess? still unsure need to research
    String label();
    GeometryType type();
    IconType marker();

    // challenge says print but real world you would return json
    default void toJSON(Mappable m) {
        String JSON_PROPERTY = String.format("""
                "properties": {
                    "type": "%s",
                    "label": "%s",
                    "marker": "%s",
                }
                """, m.type(), m.label(), m.marker());
        System.out.println(JSON_PROPERTY);
    }

    static void printProperties(Mappable instance) {
        System.out.println(instance.label());
        System.out.println(instance.type());
        System.out.println(instance.marker());
    }
}

class Building implements Mappable {
    enum Usage {COMMERCIAL, GOVERNMENT};

    private String label;
    private GeometryType type;
    private IconType marker;
    private String name;
    private Usage usage;

    public Building(String label, GeometryType type, IconType marker, String name, Usage usage) {
        this.label = label;
        this.type = type;
        this.marker = marker;
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public GeometryType type() {
        return type;
    }

    @Override
    public IconType marker() {
        return marker;
    }

    @Override
    public void toJSON(Mappable m) {
        String JSON_PROPERTY = String.format("""
                "properties": {
                    "type": "%s",
                    "label": "%s (%s)",
                    "marker": "%s",
                    "name": "%s",
                    "usage": "%s",
                }
                """, m.type(), m.label(), usage, m.marker(), name, usage);
        System.out.println(JSON_PROPERTY);
    }
}

class UtilityLine implements Mappable {
    String label;
    GeometryType type;
    IconType marker;
    String name;
    enum Utility {FIBER_OPTIC, SATELLITE}
    Utility utility;

    public UtilityLine(String label, GeometryType type, IconType marker, String name, Utility utility) {
        this.label = label;
        this.type = type;
        this.marker = marker;
        this.name = name;
        this.utility = utility;
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public GeometryType type() {
        return type;
    }

    @Override
    public IconType marker() {
        return marker;
    }

    @Override
    public void toJSON(Mappable m) {
        String JSON_PROPERTY = String.format("""
                "properties": {
                    "type": "%s",
                    "label": "%s (%s)",
                    "marker": "%s",
                    "name": "%s",
                    "utility": "%s",
                }
                """, m.type(), m.label(), utility, m.marker(), name, utility);
        System.out.println(JSON_PROPERTY);
    }
}