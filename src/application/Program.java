package application;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerdao = DaoFactory.createSellerDao();
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);
    }
}
