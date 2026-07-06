package OOPs.Encaplation;
class Employee
{
  private  int id;
  private  String name;
  private double salary;


  // Setter
     void setId(int i) {
        id = i;
    }
     void setName(String name) {
        name = name;
    }
    void setSalary(double s) {
        salary = s;
    }

    // Getter
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
    double getSalary() {
         return salary;

    }
}
public class launchEncap2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(11);
        emp.setName("rohan");
        emp.setSalary(123.456);
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());

    }
}
