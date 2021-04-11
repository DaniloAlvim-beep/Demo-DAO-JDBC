package application;

import java.util.Date;

import model.dao.DaoFaktory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);
		
		SellerDao sellerdao = DaoFaktory.creatSellerDao();
		
		System.out.println(seller);

	}

}
