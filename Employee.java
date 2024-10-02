package Advance_Java;

public class Employee {
    String emp_name;
    int emp_no, salary;
    Employee(String emp_name,int emp_no, int salary){
        this.emp_name=emp_name;
        this.emp_no=emp_no;
        this.salary=salary;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println("--------------------------");
        System.out.println("Employee Name:"+emp_name+"\n"+
                "Employee No:"+emp_no+"\n"+
                "Employee Salary:"+salary);
        System.out.println("--------------------------");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_no=" + emp_no +
                ", salary=" + salary +
                '}';
    }
}
