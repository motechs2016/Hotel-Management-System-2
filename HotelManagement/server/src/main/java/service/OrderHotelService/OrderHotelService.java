package service.OrderHotelService;

import VO.HotelVO;
import VO.OrderInfoVO;

public interface OrderHotelService {
	
	/**
	 * 获得酒店列表
	 * @param name 用户名
	 * @param HotelName 酒店名
	 * @param comment 评价
	 * @param star 打星级
	 * @return commentMessage 返回“评价成功”、“不足十五字”、“是否退出”三种提示
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public HotelVO[] getHotelList(String address,String area,String price,String star,String grade);
	/**
	 * 获得酒店基本信息
	 * @param address 地址
	 * @param area 商圈
	 * @param price 价格
	 * @param star 星级
	 * @param grade 评分
	 * @return HotelNameVO[] 返回酒店列表
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public HotelVO getHotelInfo (String hotelName);
	
	/**
	 * 提交订单
	 * @param orderInfoVO
	 * @return 是否成功添加酒店
	 */
	public boolean submit(OrderInfoVO orderInfoVO);
	/**
	 * 检查信用度
	 * @param username
	 * @return 信用值是否小0
	 */
	public boolean checkCredit(String username);


}
