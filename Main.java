public class Main {
  public static void main(String[] args) {
    if (args.length > 0) {
      if (args[0].equals("ex1")) {
        Company company = new Company();
        Employee e1 = new Employee("Joao");
        Employee e2 = new Employee("Manel");
        company.hireEmployee(e1);
        company.hireEmployee(e2);
        Chief c1 = new Chief("Antonio", Position.CEO);
        company.hireEmployee(c1);
        company.listActiveEmployees();
      } else if (args[0].equals("ex2")) {
        System.out.println("ex2");
      } else {
        System.out.println("default");
      }  
    } else {
      int a = 1;
      float b = (float) 1.1;
      boolean c = true;
      char d = '\n';
    }
  }
}