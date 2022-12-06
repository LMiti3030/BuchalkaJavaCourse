package mititelu.laura.challenges.inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{

    protected double annualSalary;
    protected boolean isRetired;

    public void retire(){
        terminate(LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        isRetired = true;
    }

    @Override
    public double collectPay(){
        if(isRetired){
            return 0.96 * annualSalary;
        } else{
            return  0.6 * annualSalary;
        }
    }

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate,  hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
