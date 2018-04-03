package app;

import org.apache.log4j.Logger;

import java.time.*;
import java.util.*;

public class Utils {
    //private ResourceBundle bundle = ResourceBundle()

    public void message(String input, Logger logger) {
        String[] inputs = input.split(" ");
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

        ZoneId zone = ZoneId.of(inputs[0]);
        ZonedDateTime zonedDateTime = dt.atZone(zone);

    }

    private void displayValues(ResourceBundle bundle, Logger logger, String city, ZonedDateTime zonedDateTime) {
        if ()) {
            logger.debug(bundle.getString("morning" + city));
        } else if () {
            logger.debug(bundle.getString("day" + city));
        } else if () {
            logger.debug(bundle.getString("evening" + city));
        } else {
            logger.debug(bundle.getString("night" + city));
        }
    }

    /*public void allZoneID() {
        Set<String> allZones = ZoneId.getAvailableZoneIds();
        LocalDateTime dt = LocalDateTime.now();

// Создаём список с зонами и сортируем его.
        List<String> zoneList = new ArrayList<String>(allZones);
        Collections.sort(zoneList);

        for (String s : zoneList) {
            ZoneId zone = ZoneId.of(s);
            ZonedDateTime zdt = dt.atZone(zone);
            ZoneOffset offset = zdt.getOffset();
            int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
            String out = String.format("%35s %10s%n", zone, offset);
            System.out.printf(out);

        }*/

}
}
