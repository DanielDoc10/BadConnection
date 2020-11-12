package domain.model.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private short empNum;
    private String niNumber;
    private int startingSalary;
    private int bankAcc;
    private int department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getEmpNum() {
        return empNum;
    }

    public void setEmpNum(short empNum) {
        this.empNum = empNum;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public int getStartingSalary() {
        return startingSalary;
    }

    public int getBankAcc() {
        return bankAcc;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setBankAcc(int bankAcc) {
        this.bankAcc = bankAcc;
    }

    public void setStartingSalary(int startingSalary) {
        this.startingSalary = startingSalary;
    }
}
