package dao.CheckOrderDao;

import PO.OrderPO;
import util.OrderType;
import util.UserType;

/**
 * 
 * @author insomnia
 *
 */
public interface CheckOrderDao {
	
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

}
