package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findByyId(3);

        System.out.println(seller);

    }
}
