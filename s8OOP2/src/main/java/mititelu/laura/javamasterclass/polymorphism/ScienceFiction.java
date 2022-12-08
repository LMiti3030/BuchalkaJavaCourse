package mititelu.laura.javamasterclass.polymorphism;

public class ScienceFiction extends Movie{

    public ScienceFiction(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction Thriller!");
    }
}