package dao;

import dao_impl.SellerDaoJDBC;
import database.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

}
