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
        Department dep = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(dep);
        list.forEach(System.out::println);
    }
}
