package dao.ClientDao;
import java.util.ArrayList;

import PO.CommentPO;
import PO.HotelPO;
import PO.OrderPO;
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
 * 客户查看酒店先通过限定地址商圈，可以选择进行价格、星级、评分的排序，得到酒店列表，从酒店列表中选择酒店查看酒店详情
 * 客户可以选择已预定且执行过的订单进行酒店评价
 * @author lichen
 * @version 2016年10月15日
 */

public interface ClientDao {
	/**
	 * 界面创建客户的时候获取可用ID
	 * @return ID（供界面显示）
	 * @author lichen
	 * @version 2016年10月15日
	 * 测试提交啊啊啊啊啊啊啊啊啊
	 */
	public boolean addComment(CommentPO commentPO);
	/**
	 * 增加评论
	 * @param commentPO 评价
	 * @return boolean 评价成功／评价失败
	 * @author lichen
	 * @version 2016年10月15日
	 */
	public HotelPO[] getHotelList(String address,String area,String price,String star,String grade);
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
	public  boolean addAnOrder(OrderPO orderPO);
	/**
	 * 增加一条预定信息
	 * @param orderPO 预定信息
	 * @return boolean 预定成功／失败
	 * @author lichen
	 * @version 2016年10月15日
	 */
}
