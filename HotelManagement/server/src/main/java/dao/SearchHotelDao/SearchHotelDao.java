package dao.SearchHotelDao;

import PO.HotelPO;

public interface SearchHotelDao {
	/**
	 * 获得酒店列表
	 * @param address
	 * @param area
	 * @param price
	 * @param star
	 * @param grade
	 * @return 酒店列表
	 */
	public HotelPO[] getHotelList(String address,String area,String price,String star,String grade);
	
	/**
	 * 获得酒店信息
	 * @param hotel
	 * @return酒店的信息
	 */
	public HotelPO getHotel(String hotel);
}
