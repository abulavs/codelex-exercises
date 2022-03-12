package io.codelex.classesandobjects.practice.videostore;

public class VideoStore {
    static String[] moviesList = new String[3];
    static double[] moviesRating = new double[3];
    static boolean[] movieStatus = new boolean[3];
    Video[] movie = new Video[3];

    public void addMovie(int number, String title, double rating) {
        movie[number] = new Video(title, rating);
        movie[number].setCheckOutOrNot(true);
        moviesList[number] = title;
        moviesRating[number] = rating;
        movieStatus[number] = true;
    }

    public void checkOutVideo(String title) {
        for (int i = 0; i < moviesList.length; i++) {
            if (title.equals(moviesList[i])) {
                if (movieStatus[i]) {
                    System.out.println("You rent it");
                    movieStatus[i] = false;
                    movie[i].setCheckOutOrNot(false);
                }
            }
        }
    }

    public void returnVideo(String title) {
        for (int i = 0; i < moviesList.length; i++) {
            if (title.equals(moviesList[i])) {
                if (!(movieStatus[i])) {
                    System.out.println("You returned");
                    movieStatus[i] = true;
                    movie[i].setCheckOutOrNot(true);
                }
            }
        }
    }

    public void printOutAvailableList() {
        System.out.println("List of available movies for rent");
        System.out.println("----------------------------------------");
        for (int i = 0; i < movieStatus.length; i++) {
            if (movieStatus[i]) {
                System.out.println(moviesList[i] + " " + moviesRating[i]);
            }
        }
    }

    public void printOutRentedList() {
        System.out.println("Which movie do you want to return");
        System.out.println("----------------------------------------");
        for (int i = 0; i < movieStatus.length; i++) {
            if (!(movieStatus[i])) {
                System.out.println(moviesList[i] + " rating :" + moviesRating[i]);
            }
        }
    }

    public void addRating(String movieName, int rating) {
        for (int i = 0; i < moviesList.length; i++) {
            if (movieName.equals(moviesList[i])) {
                moviesRating[i] =(moviesRating[i]+rating)/2;
                movie[i].setAverageRating(rating);

            }
        }
    }


}
