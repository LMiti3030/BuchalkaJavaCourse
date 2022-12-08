package mititelu.laura.javamasterclass.polymorphism;

public class Adventure extends Movie{

    public Adventure(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an adventure");
    }
}
