package io.codelex.collections.practice.flightPlanner;

import io.codelex.collections.practice.Histogram;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FlightPlanner extends Flights {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public FlightPlanner(String startCity, String endCity) {
        super(startCity, endCity);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> flightsList = Files.readAllLines(path, charset);
        FlightsList flights = new FlightsList();

        for (String flight : flightsList) {
            String[] arr = flight.split(" -> ");
            flights.setFligtsObject(new Flights(arr[0], arr[1]));
        }
        flights.userChoiceMenu();

        flights.printFlyStartList();

        flights.endOrPrintNextList();

        System.out.print(" Your fly route was ->>  ");
        flights.printOutFlyRoute();

    }

}



