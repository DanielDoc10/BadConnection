import domain.model.employee.Employee;
import domain.model.employee.EmployeeRepoIMPL;
import domain.model.employee.EmployeeService;

import java.util.Scanner;

public class UserInterface {
    private Employee selectedEmployee;
    private EmployeeRepoIMPL employeeRepoIMPL;

    public UserInterface()
    {
        this.
    }

    public void start() {
        System.out.println("Welcome to the application!");

        while (!isLoggedIn()) {
            logInUser();
        }
        displayLoggedInUser();

        this.displayOptions();


        userInterface.logInUser();
    }

    private void displayOptions() {
        System.out.println("1. Create new employee.");
        System.out.println("2. Generate reports for employee for department.");
    }

    private void displayLoggedInUser() {
        System.out.println("Logged in as %s", selectedEmployee.getName());
    }

    private boolean isLoggedIn() {
        boolean isLoggedIn = this.selectedEmployee != null;

        return  isLoggedIn;
    }

    private void logInUser() {
        short empNum = this.promptForEmpNum();
        this.selectedEmployee = employeeRepoIMPL.getEmployeeByID(empNum);
    }

    private short promptForEmpNum() {
        System.out.println("Please enter your Employee ID");
        Scanner sc = new Scanner(System.in);
        short empNum = sc.nextShort();
        sc.close();

        return empNum;
    }
}
