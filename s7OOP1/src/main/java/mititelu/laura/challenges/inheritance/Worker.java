package mititelu.laura.challenges.inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {
     protected String name;
     protected String birthDate;
     protected String endDate;

     public Worker() {
     }

     public Worker(String name, String birthDate) {
          this.name = name;
          this.birthDate = birthDate;
     }

     public int getAge(){
         LocalDate currentDate = LocalDate.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
         LocalDate birthDateDate = LocalDate.parse(birthDate, formatter);
         return currentDate.getYear() - birthDateDate.getYear();
     }

     public double collectPay(){
          return 0.0;
     }

     public void terminate(String endDate){
          this.endDate = endDate;
     }

     @Override
     public String toString() {
          return "Worker{" +
                  "name='" + name + '\'' +
                  ", birthDate='" + birthDate + '\'' +
                  ", endDate='" + endDate + '\'' +
                  '}';
     }
}
