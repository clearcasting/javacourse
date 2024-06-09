package dev.lpa;

enum GeometryType {POINT, LINE};
enum IconType {RED_STAR, GREEN_DOTTED}

public interface Mappable {
    String label();
    GeometryType geoType();
    IconType iconType();
    String JSON_PROPERTY = String.format("""
            "properties":{%s}
            """, );

    default void toJSON() {
        System.out.print(JSON_PROPERTY);
    }

    static void printProperties(Mappable instance) {
        System.out.println(instance.label());

    }
}

class Building implements Mappable {

    @Override
    public String label() {
        return "";
    }

    @Override
    public GeometryType geoType() {
        return null;
    }

    @Override
    public IconType iconType() {
        return null;
    }

    @Override
    public void toJSON() {
        Mappable.super.toJSON();
    }
}

class UtilityLine implements Mappable {

    @Override
    public String label() {
        return "";
    }

    @Override
    public GeometryType geoType() {
        return null;
    }

    @Override
    public IconType iconType() {
        return null;
    }

    @Override
    public void toJSON() {
        Mappable.super.toJSON();
    }
}