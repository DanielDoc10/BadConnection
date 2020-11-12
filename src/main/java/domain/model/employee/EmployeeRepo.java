package domain.model.employee;

public interface EmployeeRepo {

    Employee getEmployeeByID(short ID);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Employee employee);



}
