package service.AssessHotelService;

import util.CommentMessage;

public interface AssessHotelService {
	/**
	 * 提交评论
	 * @param name 用户名
	 * @param HotelName 酒店名
	 * @param comment 评价
	 * @param star 打星级
	 * @return commentMessage 返回“评价成功”、“不足十五字”、“是否退出”三种提示
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public CommentMessage submitComment(String name, String HotelName, String comment, int star);
	

}
