package mititelu.laura.challenges.inheritance;

public class InheritanceChallenge {

    public static void main(String[] args) {
//        Employee employee = new Employee("Ana", "05/25/2000","05/05/2022" );
//        System.out.println(employee);
//        System.out.println(employee.employeeId);
//
//        Employee joe = new Employee("Joe", "09/25/1987", "06/03/2022");
//        System.out.println(joe);
//        System.out.println(joe.getAge());

        SalariedEmployee johanna = new SalariedEmployee("Johanna", "05/05/2000", "05/05/2022", 20000, false);
        System.out.println(johanna);
        System.out.println(johanna.collectPay());
        johanna.retire();
        System.out.println(johanna);
        System.out.println(johanna.getAge());
        System.out.println(johanna.collectPay());

    }

}
