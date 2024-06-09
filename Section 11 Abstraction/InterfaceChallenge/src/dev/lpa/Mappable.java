package dev.lpa;

enum GeometryType {POINT, LINE}
enum IconType {RED_STAR, GREEN_DOTTED}

public interface Mappable {
    // interface syntax is () I guess? still unsure need to research
    String label();
    GeometryType type();
    IconType marker();
    String JSON_PROPERTY = """
            "properties": {%s} """;

    // challenge says print but real world you would return json
    default String toJSON() {
        return """
                 "type": "%s", "label": "%s", "marker": "%s",\s"""
                .formatted(type(), label(), marker());
    }

    static void mapIt(Mappable m) {
        System.out.println(JSON_PROPERTY.formatted(m.toJSON()));
    }

    static void printProperties(Mappable instance) {
        System.out.println(instance.label());
        System.out.println(instance.type());
        System.out.println(instance.marker());
    }
}

enum Usage {COMMERCIAL, GOVERNMENT};
class Building implements Mappable {
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
        return label + " ("+ usage + ")";
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
    public String toJSON() {
        return Mappable.super.toJSON() + """
                 "name": "%s", "usage": "%s","""
                .formatted(name, usage);
    }
}

enum Utility {FIBER_OPTIC, SATELLITE}
class UtilityLine implements Mappable {
    String label;
    GeometryType type;
    IconType marker;
    String name;
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
        return label + " ("+ utility + ")";
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
    public String toJSON() {
        return Mappable.super.toJSON() + """
                 "name": "%s", "utility": "%s",""".formatted(name, utility);
    }
}