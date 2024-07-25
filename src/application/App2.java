package application;

import java.util.List;
import java.util.Scanner;

import dao.DaoFactory;
import dao.DepartmentDao;
import entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.creteDepartmentDao();

        System.out.println();
        System.out.println("=== TEST 1: department findById ===");

        Department dp = departmentDao.findById(3);
        System.out.println(dp);
        System.out.println();

        System.out.println();
        System.out.println("=== TEST 2: department findAll ===");

        List<Department> listDp = departmentDao.findAll();

        for (Department d : listDp) {
            System.out.println(d);
        }
        System.out.println();

        System.out.println();
        System.out.println("=== TEST 3: department insert ===");

        Department dp2 = new Department(null, "Esportes");
        departmentDao.insert(dp2);

        System.out.println();

        System.out.println();
        System.out.println("=== TEST 4: department update ===");

        Department dp3 = departmentDao.findById(7);
        dp3.setName("Sports");
        departmentDao.update(dp3);

        System.out.println();

        System.out.println();
        System.out.println("=== TEST 5: department delete ===");

        departmentDao.deleteById(6);

        System.out.println();

        sc.close();
    }
}
