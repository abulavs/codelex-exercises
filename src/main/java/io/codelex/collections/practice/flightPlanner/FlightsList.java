package io.codelex.collections.practice.flightPlanner;

import java.util.*;

public class FlightsList {
    private List<Flights> fligtsObject = new ArrayList<>();
    private List<String> flyRoute = new ArrayList<>();
    private String lastCity;
    private String startCity;

    public void setFligtsObject(Flights fligtsObject) {
        this.fligtsObject.add(fligtsObject);
    }

    public String getStartCity() {
        return startCity;
    }

    public String getLastCity() {
        return lastCity;
    }

    public void endOrPrintNextList() {
        do {
            if (flyRoute.size() > 1 && getStartCity().equals(getLastCity())) {
                break;
            } else {
                printNextCity();
            }
        } while (true);
    }

    public void printOutFlyRoute() {
        for (int i = 0; i < flyRoute.size(); i++) {
            if (i == flyRoute.size() - 1) {
                System.out.print(flyRoute.get(i));
            } else {
                System.out.print(flyRoute.get(i) + " - ");
            }
        }
    }

    public void userChoiceMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press #");
        do {
            try {
                String userChoice = input.next();
                if (userChoice.equals("1")) {
                    break;
                } else if (userChoice.equals("#")) {
                    System.exit(0);
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
        } while (true);
    }

    public void printFlyStartList() {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        Set<String> myList = new HashSet<>();
        for (int i = 0; i < fligtsObject.size(); i++) {
            myList.add(fligtsObject.get(i).getStartCity());
        }
        List<String> copyOfMyList = new ArrayList<>(myList);
        for (String s : copyOfMyList) {
            System.out.println(counter + " - " + s);
            counter++;
        }

        System.out.println("Choice start city?");
        do {
            try {
                int userChoice = input.nextInt();
                if ((userChoice >= 0 && userChoice <= copyOfMyList.size())) {
                    startCity = copyOfMyList.get(userChoice);
                    flyRoute.add(copyOfMyList.get(userChoice));
                    lastCity = copyOfMyList.get(userChoice);
                    break;

                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
                input.nextLine();
            }
        } while (true);
    }

    private void printNextCity() {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        Set<String> myList = new HashSet<>();
        for (int i = 0; i < fligtsObject.size(); i++) {
            if (fligtsObject.get(i).getStartCity().equals(lastCity) && !fligtsObject.get(i).getEndCity().equals(lastCity)) {
                myList.add(fligtsObject.get(i).getEndCity());
            }
        }
        List<String> copyOfMyList = new ArrayList<>(myList);
        for (String s : copyOfMyList) {
            System.out.println(counter + " - " + s);
            counter++;
        }

        System.out.println("Choice next city?");
        do {
            try {
                int userChoice = input.nextInt();
                if ((userChoice >= 0 && userChoice <= copyOfMyList.size())) {
                    flyRoute.add(copyOfMyList.get(userChoice));
                    lastCity = copyOfMyList.get(userChoice);
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
                input.nextLine();
            }
        } while (true);
    }

}
