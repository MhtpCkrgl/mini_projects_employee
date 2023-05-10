package employee_service_project;

import java.util.Scanner;
public class Main {

    static boolean flag = true;
    public static void menu() {
        System.out.println("****************Welcome To (EMG)Employee Management System *********** "
                + "\n1. Add Employee "
                + "\n2.View Employee"
                + "\n3.Update Employee"
                + "\n4. Delete Employee"
                + "\n5.View All Employee"
                + "\n6. Exist ");
        System.out.println("********************************************************************* ");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        EmployeeService service=new EmployeeService();

        do {
            menu();
            System.out.println("Enter your Choice");
            int choice=scan.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmp();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("View All Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using EMG(Employee Manegement System) Application!!");
                    System.exit(0);
                    /*

Java'da System.exit(0) komutu, programın çalışmasını sonlandırır ve 0 (sıfır) çıkış kodu ile işletim sistemine geri döner.
 Bu, programın normal bir şekilde sonlandığını ve herhangi bir hata olmadığını belirtmek için kullanılır.
                     */

                default:
                    System.out.println("Invalid choice number.\nPlease choice from 1 to 6");
                    break;


            }

        }while(flag);

    }



}
