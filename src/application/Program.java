package application;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerdao = DaoFactory.createSellerDao();
        Department department = new Department(2, null);
        Seller seller = sellerdao.findById(1);
        seller.setName("Martha Weine");
        sellerdao.update(seller);
        System.out.println("Updated " + seller);
    }
}
