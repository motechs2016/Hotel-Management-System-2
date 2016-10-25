package dao.SearchHotelDao._stub;

import PO.HotelPO;
import dao.SearchHotelDao.SearchHotelDao;

public class SearchHotelDao_stub implements SearchHotelDao{

	 public HotelPO[] getHotelList(String address, String area, String price, String star, String grade) {
	        return new HotelPO[0];
	    }
	 
	 public HotelPO getHotel(String hotel){
		 return new HotelPO("1", "1", "1", "1", "1", '2', "1", 0, 0);
	 }
	
}
