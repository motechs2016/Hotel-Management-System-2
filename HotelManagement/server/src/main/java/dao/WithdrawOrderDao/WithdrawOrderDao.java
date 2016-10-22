package dao.WithdrawOrderDao;

import PO.OrderPO;
import util.OrderType;
import util.UserType;
/**
 * 
 * @author insomnia
 * @version Oct 22 2016
 */

public interface WithdrawOrderDao {
	
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
	 * 更新订单详细信息
	 * @param orderPO
	 * @return boolean
	 * @author mahanlei
	 * @version 2016/10/15
	 * 
	 */
	public  boolean updateOrder (OrderPO orderPO);

}
