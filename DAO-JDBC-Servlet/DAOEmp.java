package myPack;

import java.sql.SQLException;
import java.util.List;

public interface DAOEmp {

	public int saveEmployee(EmpPojo employee) throws SQLException, ClassNotFoundException;
	public int Emp_Update(EmpPojo employee) throws SQLException, ClassNotFoundException;
	public int Emp_Delete(String id) throws SQLException, ClassNotFoundException;
	public List<EmpPojo>getAllData()throws SQLException, ClassNotFoundException;
	public EmpPojo getId(String id)throws SQLException, ClassNotFoundException;

	
}
