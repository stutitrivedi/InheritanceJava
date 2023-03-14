import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        Employee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32.00);
        Employee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47.00);
        Employee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000.00);
        Employee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        Employee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000.00);


        // Print header row
        System.out.printf("%-10s %-10s %-12s %-12s %-10s %-15s %-10s %-10s %-15s\n",
                "First Name", "Last Name", "Social Sec #", "Weekly Salary", "Wage", "Hours Worked",
                "Com rate", "Gross Sales", "Base Salary");

        // Print employee data
        System.out.printf("%-10s %-10s %-12s $%-12.2f %-10s %-15s %-10s %-10s %-15s\n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getSocialSecurityNumber(),
                ((SalariedEmployee) employee1).getWeeklySalary(), "", "", "", "","");

        System.out.printf("%-10s %-10s %-12s %-12s $%-10s %-15.0f %-10s %-10s %-15s\n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getSocialSecurityNumber(),
                "", ((HourlyEmployee) employee2).getWage(), ((HourlyEmployee) employee2).getHoursWorked(),
                "", "", "");

        System.out.printf("%-10s %-10s %-12s %-12s $%-10.2f %-15.0f %-10s %-10s %-15s\n",
                employee3.getFirstName(), employee3.getLastName(), employee3.getSocialSecurityNumber(),
                "", ((HourlyEmployee) employee3).getWage(), ((HourlyEmployee) employee3).getHoursWorked(),
                "", "", "");

        System.out.printf("%-10s %-10s %-12s %-14s %-8s %-15s %-10s $%-10.0f %-15s\n",
                employee4.getFirstName(), employee4.getLastName(), employee4.getSocialSecurityNumber(),
                "", "", "", ((CommissionEmployee) employee4).getCommissionRate(),
                ((CommissionEmployee) employee4).getGrossSales(), "");

        System.out.printf("%-10s %-10s %-12s $%-12s %-10s %-15s %-10s %-10.0s %-15s\n",
                employee5.getFirstName(), employee5.getLastName(), employee5.getSocialSecurityNumber(),
              ((SalariedEmployee) employee5).getWeeklySalary(), "", "", "", "","","");

        System.out.printf("%-10s %-10s %-12s %-12s %-10s %-15s %-10s %10s  %-15.0f\n",
                employee6.getFirstName(), employee6.getLastName(), employee6.getSocialSecurityNumber(),
                "", "", "", "", "",((BaseEmployee) employee6).getBaseSalary());


        System.out.printf("%-10s %-10s %-12s %-12s %-10s %-15s %-10s $%-10.0f %-15s\n",
                employee7.getFirstName(), employee7.getLastName(), employee7.getSocialSecurityNumber(),
                "", "", "", ((CommissionEmployee) employee7).getCommissionRate(),
                ((CommissionEmployee) employee7).getGrossSales(), "","");




    }}





