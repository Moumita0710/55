package MVC;
import java.util.*;
import java.sql.SQLException;

public interface EmployeeInterface {
    public int save(Pojo_Emp pe);
    public List <Pojo_Emp> getAllemp() throws SQLException,ClassNotFoundException;
    public Pojo_Emp getEmp(int empno);
    public void updateEmp(Pojo_Emp pe);
    public void deleteEmp(Pojo_Emp pe);

}
