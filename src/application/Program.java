package application;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerdao = DaoFactory.createSellerDao();
        Scanner sc = new Scanner(System.in);
        Department department = new Department(2, null);
        Seller seller = sellerdao.findById(1);
        System.out.println("Enter Id to delete: ");
        int id = sc.nextInt();
        sellerdao.deleteById(id);
    }
}
