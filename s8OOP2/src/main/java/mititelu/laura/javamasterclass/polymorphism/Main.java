package mititelu.laura.javamasterclass.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = new Adventure("Star Wars");
////        theMovie.watchMovie(); //Star wars is a Adventure film -> actual type of object at runtime used by reflection

//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars" ); //using factory method
//        theMovie.watchMovie();
//
//        Movie theMovie2 = Movie.getMovie("ScienceFiction", "Star Wars" ); //using factory method
//        theMovie2.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A - for Adventure, C - for comedy, +" +
                    "S - for Science Fiction, or Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.print("Enter the title of the movie : ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}
