package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById =====");
		Department dep = departmentDao.findById(7);
		System.out.println(dep);
		
		//CUIDADO PARA FICAR INSERINDO A CADA EXECUÇÃO
		System.out.println("\n=== TEST 2: Department insert =====");
		Department newDep = new Department(null, "DZ7");
		departmentDao.insert(newDep);
		System.out.println("Inserted! new department id: " + newDep.getId());
		
		System.out.println("\n=== TEST3: Department Update =====");
		dep = departmentDao.findById(7);
		dep.setName("Music");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST4: Department FindAll =====");
		List<Department> list = departmentDao.findAll();
		for(Department depart : list) {
			System.out.println(depart);
			System.out.println();
		}
		
		
		System.out.println("\n=== TEST5 Department Delete =====");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Done! data deleted");
		
		sc.close();
	}
}
