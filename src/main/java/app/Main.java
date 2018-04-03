package app;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Utils utils = new Utils();
        BufferedReader br = null;

        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                logger.debug("Enter zoneID (example New_York or America/New_York) and city name (Some_City): ");
                String input = br.readLine();

                if ("q".equals(input)) {
                    logger.debug("Exit!");
                    System.exit(0);
                }

                //utils.message(input);
                //utils.allZoneID();
                //logger.debug("input : " + input);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
