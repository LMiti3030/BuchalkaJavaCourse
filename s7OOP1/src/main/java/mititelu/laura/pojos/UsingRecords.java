package mititelu.laura.pojos;

public class UsingRecords {

    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            StudentRecord s = new StudentRecord("S92300"+ i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2-> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        StudentPOJO studentPOJO = new StudentPOJO("S923006", "Ann", "05/11/1985", "Java Masterclass");
        StudentRecord studentRecord = new StudentRecord("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(studentPOJO);
        System.out.println(studentRecord);
        studentPOJO.setClassList(studentPOJO.getClassList() + ", Java OCP Exam 82900" );


        System.out.println(studentPOJO.getName() + " is taking "+ studentPOJO.getClassList());
        System.out.println(studentRecord.name() + " is taking "+ studentRecord.classList());


    }

}
