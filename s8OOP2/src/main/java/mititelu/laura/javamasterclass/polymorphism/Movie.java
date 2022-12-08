package mititelu.laura.javamasterclass.polymorphism;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void watchMovie(){
        String movieType = this.getClass().getSimpleName();
        System.out.println(name + " is a " + movieType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch ((type.toUpperCase().charAt(0))){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S'-> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}
