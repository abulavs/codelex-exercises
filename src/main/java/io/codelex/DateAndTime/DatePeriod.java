package io.codelex.DateAndTime;

public class DatePeriod {

    public static void main(String[] args) {
        System.out.println("-----------");
        System.out.println("       ----------");
        Intersection date1 = new Intersection("2021-01-01", "2021-05-01", "2021-04-01", "2021-12-01");
        date1.checkIntersection();
        System.out.println();

        System.out.println("        ----------");
        System.out.println("------------");
        Intersection date2 = new Intersection("2021-05-01", "2021-12-01", "2021-01-01", "2021-06-01");
        date2.checkIntersection();
        System.out.println();

        System.out.println("------------------");
        System.out.println("------------------");
        Intersection date3 = new Intersection("2021-01-01", "2021-12-01", "2021-01-01", "2021-12-01");
        date3.checkIntersection();
        System.out.println();

        System.out.println("----------");
        System.out.println("------------------");
        Intersection date4 = new Intersection("2021-01-01", "2021-05-01", "2021-01-01", "2021-12-01");
        date4.checkIntersection();
        System.out.println();

        System.out.println("------------------");
        System.out.println("----------");
        Intersection date5 = new Intersection("2021-01-01", "2021-12-01", "2021-01-01", "2021-06-01");
        date5.checkIntersection();
        System.out.println();

        System.out.println("       -----------");
        System.out.println("------------------");
        Intersection date6 = new Intersection("2021-05-01", "2021-12-01", "2021-01-01", "2021-12-01");
        date6.checkIntersection();
        System.out.println();

        System.out.println("------------------");
        System.out.println("        ----------");
        Intersection date7 = new Intersection("2021-01-01", "2021-12-01", "2021-05-01", "2021-12-01");
        date7.checkIntersection();
        System.out.println();

        System.out.println("------------------");
        System.out.println("    ----------    ");
        Intersection date8 = new Intersection("2021-01-01", "2021-12-01", "2021-05-01", "2021-09-01");
        date8.checkIntersection();
        System.out.println();

        System.out.println("    ----------    ");
        System.out.println("------------------");
        Intersection date9 = new Intersection("2021-04-01", "2021-06-01", "2021-01-01", "2021-12-01");
        date9.checkIntersection();
        System.out.println();

        System.out.println("-------          ");
        System.out.println("           ------");
        Intersection date10 = new Intersection("2021-01-01", "2021-02-01", "2021-03-01", "2021-12-01");
        date10.checkIntersection();
        System.out.println();

        System.out.println("           ------");
        System.out.println("-------          ");
        Intersection date11 = new Intersection("2021-07-01", "2021-12-01", "2021-01-01", "2021-04-01");
        date11.checkIntersection();
        System.out.println();
    }


}
