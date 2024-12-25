package application;

import mode.entities.Department;
import mode.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.00, obj);

        System.out.println(seller);
    }
}