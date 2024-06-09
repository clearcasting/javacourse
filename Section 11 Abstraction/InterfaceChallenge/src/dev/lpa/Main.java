package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Sky Scraper", GeometryType.POINT, IconType.RED_STAR, "Sears Tower", Building.Usage.COMMERCIAL);
        building.toJSON(building);

        UtilityLine utilityLine = new UtilityLine("Line", GeometryType.LINE, IconType.GREEN_DOTTED, "College St", UtilityLine.Utility.FIBER_OPTIC);
        utilityLine.toJSON(utilityLine);
    }
}
