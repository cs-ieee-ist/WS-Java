import java.util.ArrayList;

public class Company {
    
    int nEmployees = 0;
    ArrayList<Employee> employees = new ArrayList<>();

    Company() {
    }

    void hireEmployee(Employee employee) {
        int id = nEmployees++;
        employee.setId(id);
        employee.setActive(true);
        employees.add(employee);
    }

    boolean fireEmployee(int id) {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee e = this.employees.get(i);
            if (e.getId() == id) {
                e.setActive(false);
                return true;
            }
        }
        return false;
    }

    void listAttendances() {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee e = this.employees.get(i);
            e.listAttendances();
        }
    }

    void listActiveEmployees() {
        for (int i = 0; i < this.employees.size(); i++) {
            Employee e = this.employees.get(i);
            System.out.println(e);
        }
    }

}
