package MVC;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Emp_Main {
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        DAO_Emp dao=new DAO_Emp();
        Pojo_Emp pojo=new Pojo_Emp();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Select Operation:\n 1)Insert \n 2)Display \n 3)Update \n 5)Delete");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter employee id, name and salary:");
                    int id=sc.nextInt();
                    String emp_name= sc.next();
                    int emp_salary=sc.nextInt();
                    pojo.setEmpid(id);
                    pojo.setName(emp_name);
                    pojo.setSalary(emp_salary);
                    dao.save(pojo.Emp(pojo));
                    break;
                case 2:
                    List<Pojo_Emp>emplist=dao.getAllemp();
                    System.out.println("Employee ID | Employee Name | Employee Salary ");
                    System.out.println("-------------------------");
                    for(Pojo_Emp ob:emplist){
                        System.out.println(ob);
                    }
                    break;
                case 3:
                    System.out.println("Enter employee id to update");
                    int search=sc.nextInt();
                    pojo.setEmpid(search);
                    System.out.println("Enter employee name");
                    String new_name=sc.next();
                    System.out.println("Enter Employee Salary");
                    int new_salary=sc.nextInt();
                    pojo.setName(new_name);
                    pojo.setSalary(new_salary);
                    dao.updateEmp(pojo.Emp(pojo));
                    break;
                case 4:
                    System.out.println("Enter employee id to delete");
                    int del=sc.nextInt();
                    pojo.setEmpid(del);
                    dao.deleteEmp(pojo.Emp(pojo));
                    break;
            }
        }
    }

}

