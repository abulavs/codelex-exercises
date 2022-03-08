package io.codelex.classesandobjects.practice;

public class Movie {
    String title;
    String studio;
    String rating;

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }


    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.rating = "PG";
        this.title = title;
        this.studio = studio;
    }
    public void printProduct(String title, String studio, String rating) {
        System.out.println(title+" "+studio+" "+rating);
    }


    static Movie[] movie = new Movie[4];
    static Movie[] copyOfMovie = new Movie[4];

    public static void getPG() {
        int i = 0;
        for (Movie value : movie) {
            if ((value.rating.equals("PG"))) {
                copyOfMovie[i] = new Movie(value.getTitle(), value.getStudio(), value.getRating());
                i++;
            }
        }
    }


    public static void main(String[] args) {
        movie[0] = new Movie("Casino Royale", "Eon Productions", "PG13");
        movie[1] = new Movie("Glass", "Buena Vista International", "PG13");
        movie[2] = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        movie[3] = new Movie("Home Alone", "Stalone ltd");
        getPG();

        System.out.println("Copy Of Movie PG==true");
        System.out.println("-------------------------------------------");
        System.out.println(copyOfMovie[0].getTitle()+"  -  "+copyOfMovie[0].getStudio()+"  -  "+copyOfMovie[0].getRating());
        System.out.println(copyOfMovie[1].getTitle()+"  -  "+copyOfMovie[1].getStudio()+"  -  "+copyOfMovie[1].getRating());


    }
}


