package Advance_Java;
import java.util.*;

public class Emp_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<Employee>();
        String exit;
            System.out.println("Select Operation:Insert \n Delete \n Update \n Search \n Display");
            int choice= sc.nextInt();
           // Iterator<Employee>itr=emp.iterator();itr.hasNext();
          //  Employee m=itr.next();
            switch(choice){
                case 1:
                    do {
                        System.out.print("Enter Employee name:");
                        String name = sc.next();
                        System.out.print("Enter Employee no:");
                        int emp_no = sc.nextInt();
                        System.out.print("Enter Employee salary:");
                        int salary = sc.nextInt();
                        System.out.print("Do you want to continue?");
                        exit = sc.next();
                        Employee employee = new Employee(name, emp_no, salary);
                        emp.add(employee);
                    }
                    while (exit.equalsIgnoreCase("yes"));
                    break;
                case 2:

            }

        System.out.println("*******Display Operation*******");
        System.out.println("---------Employee Details---------");
        for (
                Employee e : emp) {
            e.display();
        }
    }
}