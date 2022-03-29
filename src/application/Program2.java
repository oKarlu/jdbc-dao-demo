package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById =====");
		Department dep = departmentDao.findById(7);
		System.out.println(dep);
		
		
		/*System.out.println("=== TEST 2: Department insert =====");
		Department newDep = new Department(null, "DZ7");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new department id: " + newDep.getId());*/
		
		System.out.println("=== TEST3: Department Update =====");
		dep = departmentDao.findById(7);
		dep.setName("Music");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		
		
	}

}
