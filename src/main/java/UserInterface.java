import domain.model.employee.Employee;

import java.util.Scanner;

public class UserInterface {
    private Employee selectedEmployee;

    public UserInterface()
    {
        this.
    }

    public void start() {
        System.out.println("Welcome to the application!");

        while (!isLoggedIn())
        {

            logInUser();

        }

        userInterface.logInUser();
    }

    private boolean isLoggedIn() {
        boolean isLoggedIn = this.selectedEmployee != null;

        return  isLoggedIn;
    }

    private void logInUser() {
        short empNum = this.promptForEmpNum();
        this.selectedEmployee = this.getEmployee(empNum);
    }

    private Employee getEmployee(short empNum) {
    }

    private short promptForEmpNum() {
        System.out.println("Please enter your Employee ID");
        Scanner sc = new Scanner(System.in);
        short empNum = sc.nextShort();
        sc.close();

        return empNum;
    }
}
