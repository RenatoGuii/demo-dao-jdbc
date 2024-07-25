package dao;

import dao_impl.DepartmentDaoJDBC;
import dao_impl.SellerDaoJDBC;
import database.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao creteDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }

}
