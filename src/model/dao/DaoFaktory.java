package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFaktory {
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	} 

}
