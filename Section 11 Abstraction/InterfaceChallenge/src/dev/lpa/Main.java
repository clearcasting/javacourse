package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sky Scraper", GeometryType.POINT, IconType.RED_STAR, "Sears Tower", Usage.COMMERCIAL));
        mappables.add(new UtilityLine("Line", GeometryType.LINE, IconType.GREEN_DOTTED, "College St", Utility.FIBER_OPTIC));

        for (var element: mappables){
            Mappable.mapIt(element);
        }
    }
}
