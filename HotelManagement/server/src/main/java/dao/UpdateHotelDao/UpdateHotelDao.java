package dao.UpdateHotelDao;

import PO.HotelPO;

public interface UpdateHotelDao {
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addHotel(HotelPO hotel);
	/**
	 * 得到酒店信息
	 * @param client,type
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelPO getHotelInfo(String hotel);//getVO 里面包含了用户名和type
	
	/**
	 * 修改酒店信息
	 * @param client ,type, hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeHotelInfo(HotelPO hotel);
}
