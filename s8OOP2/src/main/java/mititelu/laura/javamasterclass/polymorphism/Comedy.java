package mititelu.laura.javamasterclass.polymorphism;

public class Comedy extends Movie{

    public Comedy(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy(){
        System.out.println("Watching a comedy");
    }
}
