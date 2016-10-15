package dao.OrderDao;

import PO.OrderPO;
import VO.OrderInfoVO;
import util.OrderType;
import util.UserType;

/**
 * 负责实现订单的相关服务
 * @author Administrator
 *@version 2016/10/15
 *
 */
public interface OrderDao {
	/**
	 * 返回一个订单详细信息
	 * @param orderID
	 * @return OrderInfoVO
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public OrderPO getOrderInfo (String orderID);
	/**
	 * 更新订单详细信息
	 * @param orderInfoPO
	 * @return boolean
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public  boolean updateOrder (OrderPO orderPO);
	/**
	 * 返回一批订单信息
	 * @param username
	 * @param userType
	 * @param orderType
	 * @return OrderPO[]
	 * @author mahanlei
	 * @version 2016/10/15
	 */
	public OrderPO[] getOrderList (String username,UserType  userType,OrderType orderType);
	/**
	 * 增加一个订单信息
	 * @param orderPO
	 * @return boolean
	 * @author mahanlei
	 * @version 2016/10/15
	 */
	public boolean addAnOrder(OrderPO orderPO);

	
}
