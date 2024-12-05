package MVC;

public class Pojo_Emp {
    int empid,salary;
    String name;
   public Pojo_Emp Emp( int empid,int salary,String name){
        this.empid=empid;
        this.salary=salary;
        this.name=name;
        return null;
    }

    public int getEmpid() {

        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo_Emp{" +
                "empid=" + empid +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


    public Pojo_Emp Emp(Pojo_Emp pojo) {
       return pojo;
    }
}
