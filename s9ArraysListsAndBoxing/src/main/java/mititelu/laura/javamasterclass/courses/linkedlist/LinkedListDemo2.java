package mititelu.laura.javamasterclass.courses.linkedlist;

import java.util.*;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        //basicLinkedListOperations();

        populateInOrderLinkedList();

    }

    private static void populateInOrderLinkedList() {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void basicLinkedListOperations() {
        List<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(List<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==========");
    }


    //it is not recommended to write a method that both returns a value and changes the object that it's called from
    private static boolean addInOrder(List<String> linkedList,String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator(); //does not point to the first element. need to call next()
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //newCity should appear before this one
//                int index = stringListIterator.previousIndex();
//                linkedList.add(index,newCity);
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0){
                //move on to next city
            }
        }
        //if we get here it means we've reached the end of the list without adding newCity
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit  = false;
        boolean goingForward = true; //to track the direction
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0 -> {
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                }
                case 1 -> {
                    if(!goingForward){ //if user selected going backwards previously
                        if(listIterator.hasNext()){
                            listIterator.next(); //to continue where we left off,
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                }
                case 2 -> {
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                        //see Tortoise and the Hare algorithm
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true; //we can only go forward
                    }
                }
                case 3 -> printMenu();
            }
        }
    }

    private static void printMenu(){
        String menu = """
                Available actions: 
                press
                0 - to quit
                1 - go to next city
                2 - go to previous city
                3 - print menu options""";
        System.out.println(menu);
//        System.out.println("Available actions: \n press ");
//        System.out.println(" 0 - to quit\n"+
//                "1 - go to next city\n"+
//                "2 - go to previous city\n"+
//                "3 - print menu options\n");
    }

}
