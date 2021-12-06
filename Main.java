import java.util.Date;


public class Main {
  public static void main(String[] args) {
    if (args.length > 0) {
      if (args[0].equals("ex1")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        company.listActiveEmployees();
      } else if (args[0].equals("ex2")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        Chief c1 = new Chief("Antonio", Position.CEO);
        company.hireEmployee(c1);
        company.listActiveEmployees();
      } else if (args[0].equals("ex3")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        Chief c1 = new Chief("Antonio", Position.CEO);
        company.hireEmployee(c1);
        
        e1.addAttendance();
        e1.addAttendance();
        e1.addAttendance();
        e2.addAttendance();
        e2.addAttendance();
        e2.addAttendance();
        c1.addAttendance();
        e1.addAttendance();

        company.listAttendances();
      } else {
        System.out.println("Invalid example");
      }  
    } else {
      String a = "Hello World";
      int b = 1;
      float c = (float) 1.1;
      char d = '\n';
      boolean e = true;
      System.out.println(a);
    }
  }
}