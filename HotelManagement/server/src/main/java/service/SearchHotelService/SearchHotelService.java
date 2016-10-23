package service.SearchHotelService;

import VO.HotelVO;

public interface SearchHotelService {
	
	/**
	 * 获得酒店信息
	 * @param name 用户名
	 * @param HotelName 酒店名
	 * @param comment 评价
	 * @param star 打星级
	 * @return commentMessage 返回“评价成功”、“不足十五字”、“是否退出”三种提示
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public HotelVO[] getHotelList(String address,String area,String price,String star,String grade);

	public HotelVO
}
