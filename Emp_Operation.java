package Oct_2024;

import java.util.*;

public class Emp_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<Employee>();
        String exit;
        String name;
        int emp_no,salary;
        while(true){
            //
            System.out.println("Select Operation:Insert \n Delete \n Update \n Search \n Display");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.print("Enter Employee name:");
                        name = sc.next();
                        System.out.print("Enter Employee no:");
                        emp_no = sc.nextInt();
                        System.out.print("Enter Employee salary:");
                        salary = sc.nextInt();
                        System.out.print("Do you want to continue?");
                        exit = sc.next();
                        emp.add(new Employee(name, emp_no, salary));

                    }
                    while (exit.equalsIgnoreCase("yes"));
                    break;
                case 2:
                    System.out.println("*******Display Operation*******");
                    System.out.println("---------Employee Details---------");
                    for (
                            Employee e : emp) {
                        System.out.println("Employee Name:" + e.getEmp_name());
                        System.out.println("Employee No:" + e.getEmp_no());
                        System.out.println("Employee Salary:" + e.getSalary());

                    }
                    break;
            case 3:
                //delete
                System.out.println("Enter emp no you want ot delete");
                int del=sc.nextInt();
                Iterator<Employee>itr=emp.iterator();
                while(itr.hasNext()){
                    Employee m=itr.next();
                    if(m.getEmp_no()==del){
                        emp.remove(m);
                        break;
                    }
                }
                break;

//                boolean found=false;

            }
            }
        }
    }
