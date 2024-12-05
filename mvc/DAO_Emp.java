package MVC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_Emp implements EmployeeInterface {
    Connection connection() throws  SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Register");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/super","Moumita","Moumita");
        System.out.println("Sql connection established");
        return con;
    }

    @Override
    public int save(Pojo_Emp ob) {
        Connection connect;
        try{
            connect=connection();
            System.out.println(ob.getEmpid()+""+ob.getName()+""+ ob.getSalary());
            String info=ob.empid+","+ob.name+","+ob.salary;
            System.out.println(info);
            PreparedStatement insert= connect.prepareStatement("Insert into employee values("+info+");");
            insert.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    @Override
    public List<Pojo_Emp> getAllemp() throws SQLException, ClassNotFoundException {
        Connection con;
        List<Pojo_Emp> pojo_ob=new ArrayList<Pojo_Emp>();
        try{
            con=connection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from employee");
            while(rs.next()){
                Pojo_Emp obj=new Pojo_Emp();
                obj.setEmpid(rs.getInt(1));
                obj.setName(rs.getString(2));
                obj.setSalary(rs.getInt(3));
                pojo_ob.add(obj);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return pojo_ob;
    }

    @Override
    public Pojo_Emp getEmp(int empno) {
        return null;
    }

    @Override
    public void updateEmp(Pojo_Emp pe) {
        Connection con;
        try{
            con=connection();
            String update_emp="update employee set name="+pe.name+"where empid="+pe.empid;
            PreparedStatement update= con.prepareStatement(update_emp);
            update.executeUpdate();
            System.out.println(update_emp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteEmp(Pojo_Emp pe) {
        Connection con;
        try{
            con=connection();
            String delete="delete from employee where empid="+pe.empid;
            PreparedStatement del= con.prepareStatement(delete);
            del.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
