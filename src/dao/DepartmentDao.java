package dao;

import java.util.List;

import entities.Department;

public interface DepartmentDao {

    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findByyId(Integer id);

    List<Department> findAll();

}
