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
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00,department);
        sellerdao.insert(newSeller);
        System.out.println("Seller ID: " + newSeller.getId());
    }
}
