package dao.OrderHotelDao;

import PO.CreditPO;
import PO.HotelPO;
import PO.OrderPO;

public interface OrderHotelDao {
	/**
	 * 获得酒店列表
	 * @param address 地址
	 * @param area 商圈
	 * @param price 价格
	 * @param star 星级
	 * @param grade 评分
	 * @return HotelPO 返回与搜索项匹配的酒店列表
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public HotelPO[] getHotelList(String address,String area,String price,String star,String grade);
	/**
	 * 增加一条预定信息
	 * @param orderPO 预定信息
	 * @return boolean 预定成功／失败
	 * @author lichen
	 * @version 2016年10月15日
	 */
	
	public  boolean addAnOrder(OrderPO orderPO);
	/**
	 * 显示该用户所有的信用记录
	 * @param clientName
	 * @return
	 * @author insomnia
	 */
	public CreditPO[] showCreditInfo(String clientName);

}
