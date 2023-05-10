package employee_service_project;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    List<Employee> employees =new ArrayList<Employee>();

    Employee emp1=new Employee(101, "Shital", 24, "Developer", "IT", 25000);
    Employee emp2=new Employee(102, "Meena", 26, "Tester","CO", 57000);
    Employee emp3=new Employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
    Employee emp4=new Employee(104, "Max", 27, "System Eng","CO",  70000);

    Scanner scan =new Scanner(System.in);
    boolean flag =false;
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double sal;

    //Calisan ekleme (add employee)
    public void addEmp() {
        System.out.println("Enter id:");
        id= scan.nextInt();
        System.out.println("Enter name");
        name= scan.next();
        System.out.println("Enter age");
        age= scan.nextInt();
        System.out.println("enter desiganation");
        desiganation= scan.next();
        System.out.println("Enter department");
        department= scan.next();
        System.out.println("Enter salary");
        scan.nextDouble();

        Employee emp=new Employee(id, name, age, desiganation, department, sal);

        employees.add(emp);
        System.out.println(emp);
        System.out.println("Employtee addeed successsfully");

    }


    public EmployeeService() {

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

    }

    //Butun calisanlari listele(wiev all employees
    public void viewAllEmps() {
        for(Employee w: employees) {
            System.out.println(w);
        }
    }
    //id numarasina gore calisan listeleme(view emp based on there id
    public void viewEmp(){

        System.out.println("Enter id: ");
        id= scan.nextInt();
        for(Employee w: employees) {
            if(w.getId()==id) {
                System.out.println(w);
                flag =true;
            }

        }
        if(!flag) {
            System.out.println("Employee with this id is not present");
        }
    }
    //calisan guncelleme (update the employee
    public void updateEmp() {
        System.out.println("Enter id: ");
        id= scan.nextInt();
        boolean flag=false;
        for(Employee w: employees) {
            if(w.getId()==id) {
                System.out.println("Enter name: ");
                name= scan.next();
                System.out.println("Enter new Salary");
                sal= scan.nextDouble();
                w.setName(name);
                w.setSalary(sal);
                System.out.println("Updated Details of employee are: ");
                System.out.println(w);
                flag=true;
            }
        }
        if(!flag) {
            System.out.println("Employee is not present");
        }
        else {
            System.out.println("Employee details updated successfully !!");
        }
    }
    //Calisan silme(delete emp)
    public void deleteEmp() {
        System.out.println("Enter id");
        id= scan.nextInt();
        boolean flag=false;
        Employee deleted=null;
        for(Employee w: employees) {
            if(w.getId()==id) {
                deleted=w;
                flag=true;
            }
        }
        if(!flag) {
            System.out.println("Employee is not present");
        }
        else {
            employees.remove(deleted);
            System.out.println("Employee deleted successfully!!");
        }
    }

}
