package dao.UpdateHotelDao._stub;

import PO.HotelPO;
import dao.UpdateHotelDao.UpdateHotelDao;

public class UpdateHotelDao_stub implements UpdateHotelDao{
	/**
	 * 添加一个酒店
	 * @param hotel
	 * @return 是否成功添加酒店
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean addHotel(HotelPO hotel){
		return true;
	}
	/**
	 * 修改酒店信息
	 * @param client ,type, hotel
	 * @return 是否成功修改酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public boolean changeHotelInfo(HotelPO hotel){
		return true;
	}
	/**
	 * 得到酒店信息
	 * @param client,type
	 * @return 返回酒店信息
	 * @author insomnia
	 * @version Oct 15, 2016
	 */
	public HotelPO getHotelInfo(String hotel){
		return new HotelPO("如家酒店","南京最好的酒店","南京新街口","新街口","早餐供应",'3',"rujiaadmin",5.0,100);
	}
}
