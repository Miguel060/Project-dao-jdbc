package application;

import mode.entities.Department;
import mode.entities.Seller;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
        Department newDep1 = new Department(null, "D1");
        departmentdao.insert(newDep1);
    }
}
