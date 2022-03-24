package io.codelex.collections.practice.flightPlanner;

public class Flights {
    private String startCity;
    private String endCity;

    public Flights(String startCity, String endCity) {
        this.startCity = startCity;
        this.endCity = endCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getEndCity() {
        return endCity;
    }

}
