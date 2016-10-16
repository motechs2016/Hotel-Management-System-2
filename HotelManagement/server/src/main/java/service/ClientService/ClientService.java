package service.ClientService;
import java.util.ArrayList;

import VO.HotelVO;
import util.CommentMessage;

/**
 * 负责实现客户管理界面所需要的服务
 * @author lichen
 * @version 2016年10月15日
 */
/**
 * 客户的属性有：
 * 用户名、密码、类型
 * 联系方式
 * 信用值：信用值大于等于0时允许预定酒店，信用值小于0时则无法预定酒店。此数据用于预定酒店。
 * 查看酒店、预定酒店
 * 客户查看酒店先通过限定地址商圈，可以选择进行价格、星级、评分的排序
 * @author lichen
 * @version 2016年10月15日
 */
public interface ClientService {
	/**
	 * 界面创建客户的时候获取可用ID
	 * @return ID（供界面显示）
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public CommentMessage submitComment(String name, String HotelName, String comment, int star);
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
	public HotelVO[] getHotelList(String address,String area,String price,String star,String grade);
	/**
	 * 提交评论
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
	 * 提交评论
	 * @param hotelName
	 * @return HoteldetailVO 返回酒店详情
	 * @author lichen
	 * @version 2016年10月15日
	 */

}
